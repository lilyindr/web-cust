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
@Table(name = "core_trans_cart_dtl")
@IdClass(CoreTransCartDtlCompKey.class)
public class CoreTransCartDtl {
	
	@Id
	@Column(name="ctcd_ctch_id", length=20, nullable = false)
	private String ctcdCtchId;
	
	@Id
	@Column(name="ctcd_ctw_ctech_id", length=20, nullable = false)
	private String ctcdCtwCtechId;
	
	@Id
	@Column(name="ctcd_ctw_id", nullable = false)
	private Integer ctcdCtwId;
	
	@Column(name="ctcd_product_code")
	private Integer ctcdProductCode;
	
	@Column(name="ctcd_product_name", length=60)
	private String ctcdProductName;
	
	@Column(name="ctcd_producttype_code")
	private Integer ctcdProducttypeCode;
	
	@Column(name="ctcd_producttype_name", length=60)
	private String ctcdProducttypeName;
	
	@Column(name="ctcd_producttype_stock_qty")
	private Integer ctcdProducttypeStockQty;
	
	@Column(name="ctcd_producttype_min_qty")
	private Integer ctcdProducttypeMinQty;
	
	@Column(name="ctcd_producttype_price")
	private BigDecimal ctcdProducttypePrice;
	
	@Column(name="ctcd_producttype_range_qty1")
	private Integer ctcdProducttypeRangeQty1;
	
	@Column(name="ctcd_producttype_range_price1")
	private BigDecimal ctcdProducttypeRangePrice1;
	
	@Column(name="ctcd_producttype_range_qty2")
	private Integer ctcdProducttypeRangeQty2;
	
	@Column(name="ctcd_producttype_range_price2")
	private BigDecimal ctcdProducttypeRangePrice2;
	
	@Column(name="ctcd_producttype_desc", length=500)
	private String ctcdProducttypeDesc;
	
	@Column(name="ctcd_product_type_size", length=60)
	private String ctcdProductTypeSize;
	
	@Column(name="ctcd_product_type_spec", length=60)
	private String ctcdProductTypeSpec;
	
	@Column(name="ctcd_product_type_alias", length=60)
	private String ctcdProductTypeAlias;
	
	@Column(name="ctcd_prod_type_img1_filename", length=100)
	private String ctcdProdTypeImg1Filename;
	
	@Column(name="ctcd_prod_type_img1_filepath", length=100)
	private String ctcdProdTypeImg1Filepath;
	
	@Column(name="ctcd_prod_type_img2_filename", length=100)
	private String ctcdProdTypeImg2Filename;
	
	@Column(name="ctcd_prod_type_img2_filepath", length=100)
	private String ctcdProdTypeImg2Filepath;
	
	@Column(name="ctcd_prod_type_img3_filename", length=100)
	private String ctcdProdTypeImg3Filename;
	
	@Column(name="ctcd_prod_type_img3_filepath", length=100)
	private String ctcdProdTypeImg3Filepath;
	
	@Column(name="ctcd_prod_type_img4_filename", length=100)
	private String ctcdProdTypeImg4Filename;
	
	@Column(name="ctcd_prod_type_img4_filepath", length=100)
	private String ctcdProdTypeImg4Filepath;
	
	@Column(name="ctcd_new_used", length=1)
	private String ctcdNewUsed;
	
	@Column(name="ctcd_status", length=1)
	private String ctcdStatus;
	
	@Column(name="ctcd_upweb_date")
	private Date ctcdUpwebDate;
	
	@Column(name="ctcd_takedown_date")
	private Date ctcdTakedownDate;
	
	@Column(name="ctcd_qty")
	private Integer ctcdQty;
	
	@Column(name="ctcd_created_by", length=40)
	private String ctcdCreatedBy;
	
	@Column(name="ctcd_created_date")
	private Date ctcdCreateDate;
	
	@Column(name="ctcd_updated_by", length=40)
	private String ctcdUpdateBy;
	
	@Column(name="ctcd_updated_date")
	private Date ctcdUpdateDate;
	
	@Column(name="ctcd_delivery_addr_id")
	private Integer ctcdDeliveryAddrId;
	
	@Column(name="ctcd_notes", length=100)
	private String ctcdNotes;
	
	@Column(name="ctcd_img1_ctpic_ref_no")
	private Integer ctcdImg1CtpicRefNo;
	
	@Column(name="ctcd_img1_ctpic_seq_no")
	private Integer ctcdImg1CtpicSeqNo;
	
	@Column(name="ctcd_img2_ctpic_ref_no")
	private Integer ctcdImg2CtpicRefNo;
	
	@Column(name="ctcd_img2_ctpic_seq_no")
	private Integer ctcdImg2CtpicSeqNo;
	
	@Column(name="ctcd_img3_ctpic_ref_no")
	private Integer ctcdImg3CtpicRefNo;
	
	@Column(name="ctcd_img3_ctpic_seq_no")
	private Integer ctcdImg3CtpicSeqNo;
	
	@Column(name="ctcd_img4_ctpic_ref_no")
	private Integer ctcdImg4CtpicRefNo;
	
	@Column(name="ctcd_img4_ctpic_seq_no")
	private Integer ctcdImg4CtpicSeqNo;

}
