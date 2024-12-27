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
@Table(name = "core_trans_customer_otp")
public class CoreTransCustomerOtp {
	
	@Id
	@Column(name="ctcotp_id", nullable = false)
	private Integer ctcotpId;
	
	@Column(name="ctcotp_email", length=30)
	private String ctcotpEmail;
	
	@Column(name="ctcotp_hp", length=15)
	private String ctcotpHp;
	
	@Column(name="ctcotp_no")
	private Integer ctcotpNo;
	
	@Column(name="ctcotp_type", length=2)
	private String ctcotpType;
	
	@Column(name="ctcotp_status", length=2)
	private String ctcotpStatus;

}
