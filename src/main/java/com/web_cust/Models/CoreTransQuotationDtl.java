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
@Entity
@Table(name = "core_trans_quotation_dtl")
@IdClass(CoreTransQuotationDtlCompKey.class)
public class CoreTransQuotationDtl {
	
	@Id
	@Column(name="ctqd_ctqh_id", length=20, nullable = false)
	private String ctqdCtqhId;
	
	@Id
	@Column(name="ctqd_id", length=20, nullable = false)
	private String ctqdId;
	
	@Column(name="ctqd_product_code")
	private Integer ctqdProductCode;
	
	@Column(name="ctqd_product_name", length=60)
	private String ctqdProductName;
	
	@Column(name="ctqd_producttype_code")
	private Integer ctqdProducttypeCode;
	
	@Column(name="ctqd_producttype_name", length=60)
	private String ctqdProducttypeName;
	
	@Column(name="ctqd_producttype_price")
	private BigDecimal ctqdProducttypePrice;
	
	@Column(name="ctqd_producttype_qty")
	private Integer ctqdProducttypeQty;
	
	@Column(name="ctqd_producttype_min_qty")
	private Integer ctqdProducttypeMinQty;
	
	@Column(name="ctqd_producttype_max_price")
	private BigDecimal ctqdProducttypeMaxPrice;
	
	@Column(name="ctqd_producttype_desc", length=500)
	private String ctqdProducttypeDesc;
	
	@Column(name="ctqd_product_type_size", length=60)
	private String ctqdProductTypeSize;
	
	@Column(name="ctqd_product_type_spec", length=60)
	private String ctqdProductTypeSpec;
	
	@Column(name="ctqd_product_type_alias", length=60)
	private String ctqdProductTypeAlias;
	
	@Column(name="ctqd_prod_type_img1_filename", length=100)
	private String ctqdProdTypeImg1Filename;
	
	@Column(name="ctqd_prod_type_img1_filepath", length=100)
	private String ctqdProdTypeImg1Filepath;
	
	@Column(name="ctqd_prod_type_img2_filename", length=100)
	private String ctqdProdTypeImg2Filename;
	
	@Column(name="ctqd_prod_type_img2_filepath", length=100)
	private String ctqdProdTypeImg2Filepath;
	
	@Column(name="ctqd_new_used", length=1)
	private String ctqdNewUsed;
	
	@Column(name="ctqd_flag_asuransi", length=1)
	private String ctqdFlagAsuransi;
	
	@Column(name="ctqd_asuransi_name", length=150)
	private String ctqdAsuransiName;
	
	@Column(name="ctqd_ekspedisi", length=150)
	private String ctqdEkspedisi;
	
	@Column(name="ctqd_status", length=1)
	private String ctqdStatus;
	
	@Column(name="ctqd_reason", length=100)
	private String ctqdReason;
	
	@Column(name="ctqd_created_by", length=40)
	private String ctqdCreateBy;
	
	@Column(name="ctqd_created_date")
	private Date ctqdCreateDate;
	
	@Column(name="ctqd_updated_by", length=40)
	private String ctqdUpdateBy;
	
	@Column(name="ctqd_updated_date")
	private Date ctqdUpdateDate;
	
	@Column(name="ctqd_best_price", length=1)
	private String ctqdBestPrice;
	
	@Column(name="ctqd_best_product", length=1)
	private String ctqdBestProduct;
	
	@Column(name="ctqd_new_product", length=1)
	private String ctqdNewProduct;
	
	@Column(name="ctqd_sale", length=1)
	private String ctqdSale;
	
	@Column(name="ctqd_reqno", length=20)
	private String ctqdReqno;
	
	@Column(name="ctqd_prod_type_img3_filename", length=100)
	private String ctqdProdTypeImg3Filename;
	
	@Column(name="ctqd_prod_type_img3_filepath", length=100)
	private String ctqdProdTypeImg3Filepath;
	
	@Column(name="ctqd_prod_type_img4_filename", length=100)
	private String ctqdProdTypeImg4Filename;
	
	@Column(name="ctqd_prod_type_img4_filepath", length=100)
	private String ctqdProdTypeImg4Filepath;
	
	@Column(name="ctqd_notes", length=400)
	private String ctqdNotes;
	
	@Column(name="ctqd_delivery_addr_id")
	private Integer ctqdDeliveryAddrId;
	
	@Column(name="ctqd_img1_ctpic_ref_no")
	private Integer ctqdImg1CtpicRefNo;
	
	@Column(name="ctqd_img1_ctpic_seq_no")
	private Integer ctqdImg1CtpicSeqNo;
	
	@Column(name="ctqd_img2_ctpic_ref_no")
	private Integer ctqdImg2CtpicRefNo;
	
	@Column(name="ctqd_img2_ctpic_seq_no")
	private Integer ctqdImg2CtpicSeqNo;
	
	@Column(name="ctqd_img3_ctpic_ref_no")
	private Integer ctqdImg3CtpicRefNo;
	
	@Column(name="ctqd_img3_ctpic_seq_no")
	private Integer ctqdImg3CtpicSeqNo;
	
	@Column(name="ctqd_img4_ctpic_ref_no")
	private Integer ctqdImg4CtpicRefNo;
	
	@Column(name="ctqd_img4_ctpic_seq_no")
	private Integer ctqdImg4CtpicSeqNo;

}
