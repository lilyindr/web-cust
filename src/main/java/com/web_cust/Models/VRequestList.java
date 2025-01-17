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
@Table(name = "v_request_list")
public class VRequestList {
	
	@Id
	@Column(name="vrl_reqno", length=20, nullable = false)
	private String vrlReqno;
	
	@Column(name="vrl_custno", length=20)
	private String vrlCustno;
	
	@Column(name="vrl_date", length=20)
	private String vrlDate;
	
	
	@Column(name="vrl_datesort", length=20)
	private String vrlDateSort;
	
	@Column(name="vrl_status", length=20)
	private String vrlStatus;
	
	@Column(name="vrl_productno")
	private Integer vrlProductNo;
	

}
