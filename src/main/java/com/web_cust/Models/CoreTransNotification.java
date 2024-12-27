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
@Table(name = "core_trans_notification")
public class CoreTransNotification {
	
	@Id
	@Column(name="ctnotif_id", nullable = false)
	private Integer ctnotifId;
	
	@Column(name="ctnotif_type", length=5)
	private String ctnotifType;
	
	@Column(name="ctnotif_ccust_custno", length=20)
	private String ctnotifCcustCustno;
	
	@Column(name="ctnotif_status", length=5)
	private String ctnotifStatus;
	
	@Column(name="ctnotif_desc", length=500)
	private String ctnotifDesc;
	
	@Column(name="ctnotif_admin_no", length=20)
	private String ctnotifAdminNo;
	
	@Column(name="ctnotif_from_custno", length=20)
	private String ctnotifFromCustno;
	
	@Column(name="ctnotif_from_adminno", length=20)
	private String ctnotifFromAdminno;
	
	@Column(name="ctnotif_created_by", length=40)
	private String ctnotifCreatedBy;
	
	@Column(name="ctnotif_created_date")
	private Date ctnotifCreateDate;
	
	@Column(name="ctnotif_updated_by", length=40)
	private String ctnotifUpdateBy;
	
	@Column(name="ctnotif_updated_date")
	private Date ctnotifUpdateDate;
	
	@Column(name="ctnotif_supp_no", length=20)
	private String ctnotifSuppNo;

}
