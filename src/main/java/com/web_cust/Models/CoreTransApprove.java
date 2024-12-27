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
@Table(name = "core_trans_approve")
@IdClass(CoreTransApproveCompKey.class)
public class CoreTransApprove {
	
	@Id
	@Column(name="cta_id", nullable = false)
	private Integer ctaId;
	
	@Id
	@Column(name="cta_ctrqh_id", length=20, nullable = false)
	private String ctaCtrqhId;
	
	@Column(name="cta_ctrqd_id", length=20)
	private String ctaCtrqdId;
	
	@Column(name="cta_status", length=5)
	private String ctaStatus;
	
	@Column(name="cta_created_by", length=40)
	private String ctaCreatedBy;
	
	@Column(name="cta_created_date")
	private Date ctaCreateDate;
	
	@Column(name="cta_updated_by", length=40)
	private String ctaUpdateBy;
	
	@Column(name="cta_updated_date")
	private Date ctaUpdateDate;

}
