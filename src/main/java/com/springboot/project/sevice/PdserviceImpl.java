package com.springboot.project.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.project.model.Pdmodel;
import com.springboot.project.repository.Pdrepojitory;

@Service
public class PdserviceImpl implements Pdservice{

	@Autowired
	private Pdrepojitory dao;
	
	
	
	  @Override//리스트 
	  public List<Pdmodel> findAll() { 
		  return (List<Pdmodel>) dao.findAll(); 
		  }



	@Override//글작성
	public Pdmodel save(Pdmodel Products) {
		
		return dao.save(Products);
	}


	@Transactional(readOnly = true)
	@Override//상세보기
	public Pdmodel select(Long pdcode) {
		
		return dao.findById(pdcode)
				.orElseThrow(null);
	}


	
	@Override//삭제
	public String delete(Long pdcode) {
		dao.deleteById(pdcode);
		return "ok";
	}


	@Transactional
	@Override
	public Pdmodel update(Long pdcode, Pdmodel products) {
		Pdmodel Product = dao.findById(pdcode)
				.orElseThrow(null);
		
		products.setTitle(products.getTitle());
		products.setContent(products.getContent());
		products.setPrice(products.getPrice());
	//	products.setAdmin(products.getAdmin());
		
		return Product;
		
	}
	 
	  
	  
	
	

	


	
	

	
	
	
}
