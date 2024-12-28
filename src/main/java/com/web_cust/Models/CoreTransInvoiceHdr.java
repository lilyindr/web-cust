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
@Table(name = "core_trans_invoice_hdr")
public class CoreTransInvoiceHdr {
	
	@Id
	@Column(name="ctih_invoice_no", length=20, nullable = false)
	private String ctihInvoiceNo;
	
	@Column(name="ctih_invoice_date")
	private Date ctihInvoiceDate;
	
	@Column(name="ctih_invoice_status", length=5)
	private String ctihInvoiceStatus;
	
	@Column(name="ctih_ccust_custno", length=20)
	private String ctihCcustCustno;
	
	@Column(name="ctih_po_refference_no", length=20)
	private String ctihPoRefferenceNo;
	
	@Column(name="ctih_bank_id", length=5)
	private String ctihBankId;
	
	@Column(name="ctih_bank_acct", length=30)
	private String ctihBankAcct;
	
	@Column(name="ctih_bank_acct_name", length=60)
	private String ctihBankAcctName;
	
	@Column(name="ctih_inv_paid_date")
	private Date ctihInvPaidDate;
	
	@Column(name="ctih_inv_paid_status", length=5)
	private String ctihInvPaidStatus;
	
	@Column(name="ctih_total_amount")
	private BigDecimal ctihTotalAmount;
	
	@Column(name="ctih_total_tax_amount")
	private BigDecimal ctihTotalTaxAmount;
	
	@Column(name="ctih_total_invoice_amount")
	private BigDecimal ctihTotalInvoiceAmount;
	
	@Column(name="ctih_created_by", length=40)
	private String ctchCreatedBy;
	
	@Column(name="ctih_created_date")
	private Date ctihCreateDate;
	
	@Column(name="ctih_updated_by", length=40)
	private String ctihUpdateBy;
	
	@Column(name="ctih_updated_date")
	private Date ctihUpdateDate;
	
	@Column(name="ctih_ctrbh_id", length=20)
	private String ctihCtrbhId;

}
