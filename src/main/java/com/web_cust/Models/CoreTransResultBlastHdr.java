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
@Table(name = "core_trans_result_blast_hdr")
public class CoreTransResultBlastHdr {
	
	@Id
	@Column(name="ctrbh_id", length=20, nullable = false)
	private String ctrbhId;
	
	@Column(name="ctrbh_ctbh_id", length=20)
	private String ctrbhCtbhId;
	
	@Column(name="ctrbh_date")
	private Date ctrbhDate;
	
	@Column(name="ctrbh_status", length=5)
	private String ctrbhStatus;
	
	@Column(name="ctrbh_type", length=3)
	private String ctrbhType;
	
	@Column(name="ctrbh_ctqh_id", length=20)
	private String ctrbhCtqhId;
	
	@Column(name="ctrbh_supp_no", length=20)
	private String ctrbhSuppNo;
	
	@Column(name="ctrbh_ccust_custno", length=20)
	private String ctrbhCcustCustno;
	
	@Column(name="ctrbh_notes", length=100)
	private String ctrbhNotes;
	
	@Column(name="ctrbh_veri_blast_date")
	private Date ctrbhVeriBlastDate;
	
	@Column(name="ctrbh_veri_blast_sts", length=5)
	private String ctrbhVeriBlastSts;
	
	@Column(name="ctrbh_veri_pymt_date")
	private Date ctrbhVeriPymtDate;
	
	@Column(name="ctrbh_veri_pymt_sts", length=5)
	private String ctrbhVeriPymtSts;
	
	@Column(name="ctrbh_veri_pymt_vndr_date")
	private Date ctrbhVeriPymtVndrDate;
	
	@Column(name="ctrbh_veri_pymt_vndr_sts", length=5)
	private String ctrbhVeriPymtVndrSts;
	
	@Column(name="ctrbh_payment_date")
	private Date ctrbhPaymentDate;
	
	@Column(name="ctrbh_payment_sts", length=5)
	private String ctrbhPaymentSts;
	
	@Column(name="ctrbh_delivery_date")
	private Date ctrbhDeliveryDate;
	
	@Column(name="ctrbh_receive_date")
	private Date ctrbhReceiveDate;
	
	@Column(name="ctrbh_veri_pymt_adm_vndr_date")
	private Date ctrbhVeriPymtAdmVndrDate;
	
	@Column(name="ctrbh_veri_pymt_adm_vndr_sts", length=5)
	private String ctrbhVeriPymtAdmVndrSts;
	
	@Column(name="ctrbh_created_by", length=40)
	private String ctrbhCreateBy;
	
	@Column(name="ctrbh_created_date")
	private Date ctrbhCreateDate;
	
	@Column(name="ctrbh_updated_by", length=40)
	private String ctrbhUpdateBy;
	
	@Column(name="ctrbh_updated_date")
	private Date ctrbhUpdateDate;
	
	@Column(name="ctrbh_is_fulfilled", length=1)
	private String ctrbhIsFulfilled;
	
	@Column(name="ctrbh_inv_no", length=20)
	private String ctrbhInvNo;
	
	@Column(name="ctrbh_inv_date")
	private Date ctrbhInvDate;
	

}
