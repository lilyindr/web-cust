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
@Table(name = "core_trans_result_blast_dtl")
@IdClass(CoreTransResultBlastDtlCompKey.class)
public class CoreTransResultBlastDtl {
	
	@Id
	@Column(name="ctrbd_ctrbh_id", length=20, nullable = false)
	private String ctrbdCtrbhId;
	
	@Id
	@Column(name="ctrbd_id", nullable = false)
	private Integer ctrbdId;
	
	@Column(name="ctrbd_ctbh_id", length=20)
	private String ctrbdCtbhId;
	
	@Column(name="ctrbd_product_code")
	private Integer ctrbdProductCode;
	
	@Column(name="ctrbd_product_name", length=60)
	private String ctrbdProductName;
	
	@Column(name="ctrbd_producttype_code")
	private Integer ctrbdProducttypeCode;
	
	@Column(name="ctrbd_producttype_name", length=60)
	private String ctrbdProducttypeName;
	
	@Column(name="ctrbd_producttype_price")
	private BigDecimal ctrbdProducttypePrice;
	
	@Column(name="ctrbd_producttype_qty")
	private Integer ctrbdProducttypeQty;
	
	@Column(name="ctrbd_revise_price")
	private BigDecimal ctrbdRevisePrice;
	
	@Column(name="ctrbd_revise_qty")
	private Integer ctrbdReviseQty;	
	
	@Column(name="ctrbd_is_flag", length=1)
	private String ctrbdIsFlag;
	
	@Column(name="ctrbd_created_by", length=40)
	private String ctrbdCreateBy;
	
	@Column(name="ctrbd_created_date")
	private Date ctrbdCreateDate;
	
	@Column(name="ctrbd_updated_by", length=40)
	private String ctrbdUpdateBy;
	
	@Column(name="ctrbd_updated_date")
	private Date ctrbdUpdateDate;	
	
	@Column(name="ctrbd_notes", length=100)
	private String ctrbdNotes;
	
	@Column(name="ctrbd_delivery_addr_id")
	private Integer ctrbdDeliveryAddrId;
	
	@Column(name="ctrbd_is_choose", length=1)
	private String ctrbdIsChoose;
	
}