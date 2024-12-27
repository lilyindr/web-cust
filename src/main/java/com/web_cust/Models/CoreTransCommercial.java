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
@Table(name = "core_trans_commercial")
public class CoreTransCommercial {
	
	@Id
	@Column(name="ctcmc_id", nullable = false)
	private Integer ctcmcId;
	
	@Column(name="ctcmc_name", length=100)
	private String ctcmcName;
	
	@Column(name="ctcmc_desc", length=200)
	private String ctcmcDesc;
	
	@Column(name="ctcmc_imd_filename", length=100)
	private String ctcmcImdFilename;
	
	@Column(name="ctcmc_imd_filepath", length=100)
	private String ctcmcImdFilepath;
	
	@Column(name="ctcmc_startdate")
	private Date ctcmcStartdate;
	
	@Column(name="ctcmc_enddate")
	private Date ctcmcEnddate;
	
	@Column(name="ctcmc_createby", length=40)
	private String ctcmcCreatedBy;
	
	@Column(name="ctcmc_createdate")
	private Date ctcmcCreateDate;
	
	@Column(name="ctcmc_updateby", length=40)
	private String ctcmcUpdateBy;
	
	@Column(name="ctcmc_updatedate")
	private Date ctcmcUpdateDate;

}
