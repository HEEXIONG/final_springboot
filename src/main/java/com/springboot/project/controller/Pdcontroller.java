package com.springboot.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project.model.Pdmodel;
import com.springboot.project.sevice.Pdservice;

//아래 기본 시큐리티 적용안되게하는구문 시큐리티 구현시 삭제 
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@Controller
public class Pdcontroller {

	@Autowired
	private Pdservice pdservice;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
    public String helloSpring() {
        return "index";
    }
	
	  @RequestMapping(value = "/findAll", method = RequestMethod.GET) public
	  List<Pdmodel> findAll(){ return pdservice.findAll(); }
	  
	 @PostMapping("/insert")//글쓰기
	  public ResponseEntity<?> save(@RequestBody Pdmodel Products){
		 return new ResponseEntity<>(pdservice.save(Products), HttpStatus.CREATED);
	  }
	 
	 @GetMapping("/view/{pdcode}")//상세보기
	 public ResponseEntity<?> findById(@PathVariable Long pdcode) {
		 
		 return new ResponseEntity<>(pdservice.select(pdcode),HttpStatus.OK);
	 }
	 
	@DeleteMapping("/delete/{pdcode}")//글삭제
	public ResponseEntity<?> deleteById(@PathVariable Long pdcode){
		pdservice.delete(pdcode);
		return new ResponseEntity<>(pdservice.delete(pdcode),HttpStatus.OK);
	}
	
	@PutMapping("/update/{pdcode}")//글수정
	public ResponseEntity<?> update(@PathVariable Long pdcode,@RequestBody Pdmodel pdregist){
		pdservice.update(pdcode, pdregist);
		return new ResponseEntity<>(pdservice.update(pdcode, pdregist),HttpStatus.OK);
	}
	
}
