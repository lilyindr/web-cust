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
@Table(name = "core_trans_invoice_dtl")
@IdClass(CoreTransInvoiceDtlCompKey.class)
public class CoreTransInvoiceDtl {
	
	@Id
	@Column(name="ctid_invoice_no", length=20, nullable = false)
	private String ctidInvoiceNo;
	
	@Id
	@Column(name="ctid_sequence_no", nullable = false)
	private Integer ctidSequenceNo;
	
	@Column(name="ctid_refference_no", length=20)
	private String ctidRefferenceNo;
	
	@Column(name="ctid_product_code")
	private Integer ctidProductCode;
	
	@Column(name="ctid_product_name", length=60)
	private String ctidProductName;
	
	@Column(name="ctid_producttype_code")
	private Integer ctidProducttypeCode;
	
	@Column(name="ctid_producttype_name", length=60)
	private String ctidProducttypeName;
	
	@Column(name="ctid_producttype_price")
	private BigDecimal ctidProducttypePrice;
	
	@Column(name="ctid_producttype_qty")
	private Integer ctidProducttypeQty;
	
	@Column(name="ctid_supp_no", length=20)
	private String ctidSuppNo;
	
	@Column(name="ctid_invoice_amount")
	private BigDecimal ctidInvoiceAmount;
	
	@Column(name="ctid_created_by", length=40)
	private String ctidCreatedBy;
	
	@Column(name="ctid_created_date")
	private Date ctidCreateDate;
	
	@Column(name="ctid_updated_by", length=40)
	private String ctidUpdateBy;
	
	@Column(name="ctid_updated_date")
	private Date ctidUpdateDate;

}
