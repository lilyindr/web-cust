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
@Table(name = "print_invoice_view")
public class VPrintInvoiceView {
	
	@Id
	@Column(name="piv_invoice_no", length=20, nullable = false)
	private String pivInvoiceNo;
	
	@Column(name="piv_invoice_date")
	private Date pivInvoiceDate;
	
	@Column(name="piv_reff_no", length=20)
	private String pivReffNo;
	
	@Column(name="piv_seq_no")
	private Integer pivSeqNo;
	
	@Column(name="piv_product_name", length=60)
	private String pivProductName;
	
	@Column(name="piv_producttype_name", length=60)
	private String pivProducttypeName;
	
	@Column(name="piv_product_type_size", length=60)
	private String pivProductTypeSize;
	
	@Column(name="piv_qty")
	private Integer pivQty;
	
	@Column(name="piv_price")
	private BigDecimal pivPrice;
	
	@Column(name="piv_total_price")
	private BigDecimal pivTotalPrice;
	
	@Column(name="piv_sub_total")
	private BigDecimal pivSubTotal;
	
	@Column(name="piv_ppn")
	private BigDecimal pivPpn;
	
	@Column(name="piv_grand_total")
	private BigDecimal pivGrandTotal;
	
	@Column(name="piv_coy_name", length=100)
	private String pivCoyName;
	
	@Column(name="piv_coy_addr", length=100)
	private String pivCoyAddr;
	
	@Column(name="piv_coy_bank_name", length=100)
	private String pivCoyBankName;
	
	@Column(name="piv_coy_acct_name", length=100)
	private String pivCoyAcctName;
	
	@Column(name="piv_coy_acct_no", length=20)
	private String pivCoyAcctNo;
	
	@Column(name="piv_cust_name", length=60)
	private String pivCustName;
	
	@Column(name="piv_cust_addr", length=100)
	private String pivCustAddr;

}
