package com.springboot.project.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//JPA의 엔티티 설정
@Entity									
@Table(name = "pd_regist") // 테이블의 이름을 설정 (pd_regist)
@Getter // @Getter, @Setter : getter과 setter을 자동으로 만들어주는 Lombok 애노테이션 설정
@Setter	
@Data
@EntityListeners(AuditingEntityListener.class)
public class Pdmodel {
	
	@Id	// PK 설정
	@GeneratedValue
	@Column(name = "pdcode")
	private Long pdcode;
	
	@Column(name = "pd_title")
	private String title;
	
	@Column(name = "pd_content")
	private String content;
	
	@Column(name = "price")
	private Long price;
	
	@CreatedDate
	private LocalDate regdate;
	
	@Column(name = "admin")
	private String admin;
	

}
