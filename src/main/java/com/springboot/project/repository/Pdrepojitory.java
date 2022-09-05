package com.springboot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.project.model.Pdmodel;

@Repository
public interface Pdrepojitory extends JpaRepository<Pdmodel, Long>{

	

	
}
