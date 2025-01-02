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
@Entity
@Table(name = "core_trans_reject")
@IdClass(CoreTransRejectCompKey.class)
public class CoreTransReject {
	
	@Id
	@Column(name="ctr_ctrqh_id", length=20, nullable = false)
	private String ctrCtrqhId;
	
	@Id
	@Column(name="ctr_ctrqd_id", length=20, nullable = false)
	private String ctrCtrqdId;
	
	@Column(name="ctr_status", length=5)
	private String ctrStatus;	
	
	@Column(name="ctr_created_by", length=40)
	private String ctrCreateBy;
	
	@Column(name="ctr_created_date")
	private Date ctrCreateDate;
	
	@Column(name="ctr_updated_by", length=40)
	private String ctrUpdateBy;
	
	@Column(name="ctr_updated_date")
	private Date ctrUpdateDate;  

}
