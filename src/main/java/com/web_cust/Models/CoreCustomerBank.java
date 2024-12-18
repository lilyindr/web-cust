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
@Table(name = "core_customer_bank")
@IdClass(CoreCustomerBankCompKey.class)
public class CoreCustomerBank {
	@Id
	@Column(name="ccba_id", nullable = false)
	private BigDecimal ccbaId;
	
	@Id
	@Column(name="ccba_ccust_no", length=20, nullable = false)
	private String ccbaCustNo;
	
	@Column(name="ccba_type", length=50)
	private String ccbaType;
	
	@Column(name="ccba_bank_id", length=20)
	private String ccbaBankId;
	
	@Column(name="ccba_bank_name", length=60)
	private String ccbaBankName;
	
	@Column(name="ccba_bank_acct_no", length=20)
	private String ccbaBankAccount;
	
	@Column(name="ccba_bank_acct_name", length=60)
	private String ccbaBankAccountName;
	
	@Column(name="ccba_created_by", length=40)
	private String ccbaCreatedBy;
	
	@Column(name="ccba_created_date")
	private Date ccbaCreateDate;
	
	@Column(name="ccba_updated_by", length=40)
	private String ccbaUpdateBay;
	
	@Column(name="ccba_updated_date")
	private Date ccbaUpdateDate;
	

}
