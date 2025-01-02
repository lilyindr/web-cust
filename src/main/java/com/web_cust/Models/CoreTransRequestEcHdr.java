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
@Entity
@Table(name = "core_trans_request_ec_hdr")
public class CoreTransRequestEcHdr {
	
	@Id
	@Column(name="ctech_id", length=20, nullable = false)
	private String ctechId;
	
	@Column(name="ctech_date")
	private Date ctechDate;
	
	@Column(name="ctech_type", length=3)
	private String ctechType;
	
	@Column(name="ctech_status", length=5)
	private String ctechStatus;
	
	@Column(name="ctech_send_date")
	private Date ctechSendDate;
	
	@Column(name="ctech_ccust_cusno", length=20)
	private String ctechCcustCusno;
	
	@Column(name="ctech_pic1_custno", length=20)
	private String ctechPic1Cusno;
	
	@Column(name="ctech_pic1_date")
	private Date ctechPic1Date;
	
	@Column(name="ctech_pic1_sts", length=3)
	private String ctechPic1Sts;
	
	@Column(name="ctech_pic2_custno", length=20)
	private String ctechPic2Cusno;
	
	@Column(name="ctech_pic2_date")
	private Date ctechPic2Date;
	
	@Column(name="ctech_pic2_sts", length=3)
	private String ctechPic2Sts;
	
	@Column(name="ctech_pic3_custno", length=20)
	private String ctechPic3Cusno;
	
	@Column(name="ctech_pic3_date")
	private Date ctechPic3Date;
	
	@Column(name="ctech_pic3_sts", length=3)
	private String ctechPic3Sts;
	
	@Column(name="ctech_created_by", length=40)
	private String ctechCreateBy;
	
	@Column(name="ctech_created_date")
	private Date ctechCreateDate;
	
	@Column(name="ctech_updated_by", length=40)
	private String ctechUpdateBy;
	
	@Column(name="ctech_updated_date")
	private Date ctechUpdateDate;

}
