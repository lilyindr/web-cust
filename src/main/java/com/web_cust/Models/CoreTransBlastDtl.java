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
@Table(name = "core_trans_blast_dtl")
@IdClass(CoreTransBlastDtlCompKey.class)
public class CoreTransBlastDtl {
	
	@Id
	@Column(name="ctbd_ctbh_id", length=20, nullable = false)
	private String ctbdCtbhId;
	
	@Id
	@Column(name="ctbd_id", nullable = false)
	private Integer ctbdId;
	
	@Id
	@Column(name="ctbd_ctqh_id", length=20, nullable = false)
	private String ctbdCtqhId;
	
	@Id
	@Column(name="ctbd_ctqd_id", length=20, nullable = false)
	private String ctbdCtqdId;
	
	@Column(name="ctbd_supp_no", length=20)
	private String ctbdSuppNo;
	
	@Column(name="ctbd_product_code")
	private Integer ctbdProductCode;
	
	@Column(name="ctbd_product_name", length=60)
	private String ctbdProductName;
	
	@Column(name="ctbd_producttype_code")
	private Integer ctbdProductTypeCode;
	
	@Column(name="ctbd_producttype_name", length=60)
	private String ctbdProducttypeName;
	
	@Column(name="ctbd_producttype_price")
	private BigDecimal ctbdProducttypePrice;
	
	@Column(name="ctbd_producttype_qty")
	private Integer ctbdProducttypeQty;
	
	@Column(name="ctbd_flag_asuransi", length=1)
	private String ctbdFlagAsuransi;
	
	@Column(name="ctbd_asuransi_name", length=150)
	private String ctbdAsuransiName;
	
	@Column(name="ctbd_status", length=5)
	private String ctbdStatus;
	
	@Column(name="ctbd_reason", length=100)
	private String ctbdReason;
	
	@Column(name="ctbd_reqno", length=20)
	private String ctbdReqno;
	
	@Column(name="ctbd_created_by", length=40)
	private String ctbdCreatedBy;
	
	@Column(name="ctbd_created_date")
	private Date ctbdCreateDate;
	
	@Column(name="ctbd_updated_by", length=40)
	private String ctbdUpdateBy;
	
	@Column(name="ctbd_updated_date")
	private Date ctbdUpdateDate;
	
	@Column(name="ctbd_revise_price")
	private BigDecimal ctbdRevisePrice;
	
	@Column(name="ctbd_revise_qty")
	private Integer ctbdReviseQty;
	
	@Column(name="ctbd_is_flag", length=1)
	private String ctbdIsFlag;
	
	@Column(name="ctbd_notes", length=100)
	private String ctbdNotes;
	
	@Column(name="ctbd_delivery_addr_id")
	private Integer ctbdDeliveryAddrId;

}
