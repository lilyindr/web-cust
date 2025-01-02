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
@Table(name = "list_banner_commercial")
public class VListBannerCommercial {
	
	@Id
	@Column(name="lbc_id", nullable = false)
	private Integer lbcId;
	
	@Column(name="lbc_name", length=100)
	private String lbcName;
	
	@Column(name="lbc_desc", length=200)
	private String lbcDesc;
	
	@Column(name="lbc_img_filename", length=100)
	private String lbcImgFilename;
	
	@Column(name="lbc_img_filepath", length=100)
	private String lbcImgFilepath;
	
	@Column(name="lbc_startdate")
	private Date lbcStartdate;
	
	@Column(name="lbc_enddate")
	private Date lbcEnddate;

}
