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
@Table(name = "core_trans_blast_hdr")
public class CoreTransBlastHdr {
	
	@Id
	@Column(name="ctbh_id", length=20, nullable = false)
	private String ctbhId;
	
	@Column(name="ctbh_date")
	private Date ctbhDate;
	
	@Column(name="ctbh_status", length=5)
	private String ctbhStatus;
	
	@Column(name="ctbh_type", length=3)
	private String ctbhType;
	
	@Column(name="ctbh_ccust_custno", length=20)
	private String ctbhCcustCustno;
	
	@Column(name="ctbh_veri_blast_date")
	private Date ctbhVeriBlastDate;
	
	@Column(name="ctbh_veri_blast_sts", length=5)
	private String ctbhVeriBlastSts;
	
	@Column(name="ctbh_veri_pymt_date")
	private Date ctbhVeriPymtDate;
	
	@Column(name="ctbh_veri_pymt_sts", length=5)
	private String ctbhVeriPymtSts;
	
	@Column(name="ctbh_veri_pymt_vndr_date")
	private Date ctbhVeriPymtVndrDate;
	
	@Column(name="ctbh_veri_pymt_vndr_sts", length=5)
	private String ctbhVeriPymtVndrSts;
	
	@Column(name="ctbh_payment_date")
	private Date ctbhPaymentDate;
	
	@Column(name="ctbh_veri_pymt_adm_vndr_date")
	private Date ctbhVeriPymtAdmVndrDate;
	
	@Column(name="ctbh_veri_pymt_adm_vndr_sts", length=5)
	private String ctbhVeriPymtAdmVndrSts;
	
	@Column(name="ctbh_delivery_date")
	private Date ctbhDeliveryDate;
	
	@Column(name="ctbh_receive_date")
	private Date ctbhReceiveDate;
	
	@Column(name="ctbh_end_process_date")
	private Date ctbhEndProcessDate;
	
	@Column(name="ctbh_created_by", length=40)
	private String ctbhCreatedBy;
	
	@Column(name="ctbh_created_date")
	private Date ctbhCreateDate;
	
	@Column(name="ctbh_updated_by", length=40)
	private String ctbhUpdateBy;
	
	@Column(name="ctbh_updated_date")
	private Date ctbhUpdateDate;
	
	@Column(name="ctbh_notes", length=100)
	private String ctbhNotes;
	
	@Column(name="ctbh_supp_no", length=20)
	private String ctbhSuppNo;
	
	@Column(name="ctbh_quo_no", length=20)
	private String ctbhQuoNo;
	
	@Column(name="ctbh_start_date")
	private Date ctbhStartDate;
	
	@Column(name="ctbh_end_date")
	private Date ctbhEndDate;

}
