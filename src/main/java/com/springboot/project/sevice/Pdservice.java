package com.springboot.project.sevice;

import java.util.List;

import com.springboot.project.model.Pdmodel;

public interface Pdservice {

	 List<Pdmodel> findAll(); //글목록
	
	public Pdmodel save(Pdmodel Products);//글쓰기
	
	public Pdmodel select(Long pdcode);//상세보기
	
	public String delete(Long pdcode);//글 삭제
	
	public Pdmodel update(Long pdcode,Pdmodel pdregist);//글수정
}
