package com.springboot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.project.model.ReplyVO;

@Repository
public interface ReplyRepository extends JpaRepository<ReplyVO, Long>{

}
