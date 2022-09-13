package com.springboot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.project.model.Files;

public interface FilesRepository extends JpaRepository<Files, Integer>{

	Files findByFno(int pd_code);
	
}
