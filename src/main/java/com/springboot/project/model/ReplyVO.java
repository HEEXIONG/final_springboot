package com.springboot.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;


@Entity
@Data
@Table(name = "tbl_reply")
@EntityListeners(AuditingEntityListener.class)
public class ReplyVO {

	
	@Id
	@GeneratedValue
	@Column(name = "rno")
	private Long rno;
	
	//글번호 참조키
	@ManyToOne
	@JoinColumn(name = "qno")
	private QnaVO qno;
	
	@Column(name = "reply")
	private String reply;
	
	@Column(name = "replyer")
	private String replyer;
	
	@CreatedDate
	private Date replyDate;
	
	@CreatedDate
	private Date updateDate;
	
}
