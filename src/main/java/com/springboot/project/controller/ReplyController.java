package com.springboot.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project.model.ReplyVO;
import com.springboot.project.sevice.ReplyService;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@RestController
@RequestMapping("/reply")
public class ReplyController {
	
	@Autowired
	private ReplyService service;
	
	
	@PostMapping("/enroll")
	public void enrollReplyPost(ReplyVO vo) {
		service.enrollReply(vo);
	}
	

}
