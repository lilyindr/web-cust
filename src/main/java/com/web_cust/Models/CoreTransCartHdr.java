package com.web_cust.Models;

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
@Table(name = "core_trans_cart_hdr")
public class CoreTransCartHdr {
	
	@Id
	@Column(name="ctch_id", length=20, nullable = false)
	private String ctchId;
	
	@Column(name="ctch_date")
	private Date ctchDate;
	
	@Column(name="ctch_ccust_custno", length=20)
	private String ctchCcustCustno;
	
	@Column(name="ctch_status", length=5)
	private String ctchStatus;
	
	@Column(name="ctch_supp_no", length=20)
	private String ctchSuppNo;
	
	@Column(name="ctch_created_by", length=40)
	private String ctchCreatedBy;
	
	@Column(name="ctch_created_date")
	private Date ctchCreateDate;
	
	@Column(name="ctch_updated_by", length=40)
	private String ctchUpdateBy;
	
	@Column(name="ctch_updated_date")
	private Date ctchUpdateDate;

}
