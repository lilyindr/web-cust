package com.web_cust.Models;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "core_trans_web_category")
@IdClass(CoreTransWebCategoryCompKey.class)
public class CoreTransWebCategory {
	
	@Id
	@Column(name="ctwc_ctech_id", length = 20, nullable = false)
	private String ctwcCtechId;
	
	@Id
	@Column(name="ctwc_ctw_id", nullable = false)
	private Integer ctwcCtwId;
	
	@Id
	@Column(name="ctwc_cmct_id", nullable = false)
	private Integer ctwcCmctId;
	
	@Column(name="ctwc_cmct_category", length = 100)
	private String ctwcCmctCategory;	

}
