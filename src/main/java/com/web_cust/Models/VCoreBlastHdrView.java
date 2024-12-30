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
@Table(name = "core_blast_hdr_view")
public class VCoreBlastHdrView {
	
	@Id
	@Column(name="cbhv_id", length=20, nullable = false)
	private String cbhvId;
	
	@Column(name="cbhv_date")
	private Date cbhvDate;
	
	@Column(name="cbhv_status", length=5)
	private String cbhvStatus;
	
	@Column(name="cbhv_type", length=3)
	private String cbhvType;
	
	@Column(name="cbhv_ccust_custno", length=20)
	private String cbhvCcustCustno;
	
	@Column(name="cbhv_veri_blast_date")
	private Date cbhvVeriBlastDate;
	
	@Column(name="cbhv_veri_blast_sts", length=5)
	private String cbhvVeriBlastSts;
	
	@Column(name="cbhv_veri_pymt_date")
	private Date cbhvVeriPymtDate;
	
	@Column(name="cbhv_veri_pymt_sts", length=5)
	private String cbhvVeriPymtSts;
	
	@Column(name="cbhv_veri_pymt_vndr_date")
	private Date cbhvVeriPymtVndrDate;
	
	@Column(name="cbhv_veri_pymt_vndr_sts", length=5)
	private String cbhvVeriPymt_vndrSts;
	
	@Column(name="cbhv_payment_date")
	private Date cbhvPaymentDate;
	
	@Column(name="cbhv_veri_pymt_adm_vndr_date")
	private Date cbhvVeriPymtAdmVndrDate;
	
	@Column(name="cbhv_veri_pymt_adm_vndr_sts", length=5)
	private String cbhvVeriPymtAdmVndrSts;
	
	@Column(name="cbhv_delivery_date")
	private Date cbhvDeliveryDate;
	
	@Column(name="cbhv_receive_date")
	private Date cbhvReceiveDate;
	
	@Column(name="cbhv_end_process_date")
	private Date cbhvEndProcessDate;
	
	@Column(name="cbhv_created_by", length=40)
	private String cbhvCreatedBy;
	
	@Column(name="cbhv_created_date")
	private Date cbhvCreatedDate;
	
	@Column(name="cbhv_updated_by", length=40)
	private String cbhvUpdatedBy;
	
	@Column(name="cbhv_updated_date")
	private Date cbhvUpdatedDate;
	
	@Column(name="cbhv_notes", length=100)
	private String cbhvNotes;
	
	@Column(name="cbhv_supp_no", length=20)
	private String cbhvSuppNo;
	
	@Column(name="cbhv_quo_no", length=20)
	private String cbhvQuoNo;
	
	@Column(name="cbhv_start_date")
	private Date cbhvStartDate;
	
	@Column(name="cbhv_end_date")
	private Date cbhvEndDate;
	
	@Column(name="cbhv_remain_time")
	private Date cbhvRemainTime;

}
