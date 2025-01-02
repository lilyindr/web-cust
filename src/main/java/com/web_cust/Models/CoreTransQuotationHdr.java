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
@Entity
@Table(name = "core_trans_quotatian_hdr")
public class CoreTransQuotationHdr {
	
	@Id
	@Column(name="ctqh_id", length=20, nullable = false)
	private String ctqhId;
	
	@Column(name="ctqh_date")
	private Date ctqhDate;
	
	@Column(name="ctqh_type", length=3)
	private String ctqhType;
	
	@Column(name="ctqh_status", length=5)
	private String ctqhStatus;
	
	@Column(name="ctqh_send_date")
	private Date ctqhSendDate;
	
	@Column(name="ctqh_ccust_cusno", length=20)
	private String ctqhCcustCusno;
	
	@Column(name="ctqh_pic1_custno", length=20)
	private String ctqhPic1Cusno;
	
	@Column(name="ctqh_pic1_date")
	private Date ctqhPic1Date;
	
	@Column(name="ctqh_pic1_sts", length=3)
	private String ctqhPic1Sts;
	
	@Column(name="ctqh_pic2_custno", length=20)
	private String ctqhPic2Cusno;
	
	@Column(name="ctqh_pic2Date")
	private Date ctqhPic2Date;
	
	@Column(name="ctqh_pic2_sts", length=3)
	private String ctqhPic2Sts;
	
	@Column(name="ctqh_pic3_custno", length=20)
	private String ctqhPic3Cusno;
	
	@Column(name="ctqh_pic3_date")
	private Date ctqhPic3Date;
	
	@Column(name="ctqh_pic3_sts", length=3)
	private String ctqhPic3Sts;
	
	@Column(name="ctqh_type_manual_filename", length=100)
	private String ctqhTypeManualFilename;
	
	@Column(name="ctqh_type_manual_filepath", length=100)
	private String ctqhTypeManualFilepath;
	
	@Column(name="ctqh_created_by", length=40)
	private String ctqhCreateBy;
	
	@Column(name="ctqh_created_date")
	private Date ctqhCreateDate;
	
	@Column(name="ctqh_updated_by", length=40)
	private String ctqhUpdateBy;
	
	@Column(name="ctqh_updated_date")
	private Date ctqhUpdateDate;
	
	@Column(name="ctqh_type_manual2_filename", length=100)
	private String ctqhTypeManual2Filename;
	
	@Column(name="ctqh_type_manual2_filepath", length=100)
	private String ctqhTypeManual2Filepath;
	
	@Column(name="ctqh_notes", length=400)
	private String ctqhNotes;
	
	@Column(name="ctqh_reason", length=50)
	private String ctqhReason;
	
	@Column(name="ctqh_delivery_addr_id")
	private Integer ctqhDlvrAddrId;
	
	@Column(name="ctqh_order_id", length=20)
	private String ctqhOrderId;
	
	@Column(name="ctqh_order_date")
	private Date ctqhOrderDate;
	
	@Column(name="ctqh_manual1_ctpic_ref_no")
	private Integer ctqhManual1CtpicRefNo;
	
	@Column(name="ctqh_manual1_ctpic_seq_no")
	private Integer ctqhManual1CtpicSeqNo;
	
	@Column(name="ctqh_manual2_ctpic_ref_no")
	private Integer ctqhManual2CtpicRefNo;
	
	@Column(name="ctqh_manual2_ctpic_seq_no")
	private Integer ctqhManual2CtpicSeqNo;
	
	@Column(name="ctqh_updated_by_admin", length=40)
	private String ctqhUpdateByAdmin;
	
	@Column(name="ctqh_updated_date_admin")
	private Date ctqhUpdateDateAdmin;	

}
