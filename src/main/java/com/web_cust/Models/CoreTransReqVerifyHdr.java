package com.web_cust.Models;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "core_trans_reqverify_hdr")
public class CoreTransReqVerifyHdr {
	
	@Id
	@Column(name="ctrvh_ctech_id", length=20, nullable = false)
	private String ctrvhCtechId;
	
	@Column(name="ctrvh_date")
	private Date ctrvhDate;
	
	@Column(name="ctrvh_ccust_no", length=20)
	private String ctrvhCcustNo;
	
	@Column(name="ctrvh_status", length=5)
	private String ctrvhStatus;
	
	@Column(name="ctrvh_created_by", length=40)
	private String ctrvhCreateBy;
	
	@Column(name="ctrvh_created_date")
	private Date ctrvhCreateDate;
	
	@Column(name="ctrvh_updated_by", length=40)
	private String ctrvhUpdateBy;
	
	@Column(name="ctrvh_updated_date")
	private Date ctrvhUpdateDate;

}
