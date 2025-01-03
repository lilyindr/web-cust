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
@Table(name = "core_trans_request_ec_dtl")
@IdClass(CoreTransRequestEcDtlCompKey.class)
public class CoreTransRequestEcDtl {
	
	@Id
	@Column(name="ctecd_ctech_id", length=20, nullable = false)
	private String ctecdCtechId;
	
	@Id
	@Column(name="ctecd_id", length=20, nullable = false)
	private String ctecdId;
	
	@Column(name="ctecd_product_code")
	private Integer ctecdProductCode;
	
	@Column(name="ctecd_product_name", length=60)
	private String ctecdProductName;
	
	@Column(name="ctecd_producttype_code")
	private Integer ctecdProducttypeCode;
	
	@Column(name="ctecd_producttype_name", length=60)
	private String ctecdProducttypeName;
	
	@Column(name="ctecd_producttype_stock_qty")
	private Integer ctecdProducttypeStockQty;
	
	@Column(name="ctecd_producttype_min_qty")
	private Integer ctecdProducttypeMinQty;
	
	@Column(name="ctecd_producttype_price")
	private BigDecimal ctecdProducttypePrice;
	
	@Column(name="ctecd_producttype_range_qty1")
	private Integer ctecdProducttypeRangeQty1;
	
	@Column(name="ctecd_producttype_range_price1")
	private BigDecimal ctecdProducttypeRangePrice1;
	
	@Column(name="ctecd_producttype_range_qty2")
	private Integer ctecdProducttypeRangeQty2;
	
	@Column(name="ctecd_producttype_range_price2")
	private BigDecimal ctecdProducttypeRangePrice2;
		
	@Column(name="ctecd_producttype_desc", length=500)
	private String ctecdProducttypeDesc;
	
	@Column(name="ctecd_product_type_size", length=60)
	private String ctecdProductTypeSize;
	
	@Column(name="ctecd_product_type_spec", length=60)
	private String ctecdProductTypeSpec;
	
	@Column(name="ctecd_product_type_alias", length=60)
	private String ctecdProductTypeAlias;
	
	@Column(name="ctecd_prod_type_img1_filename", length=100)
	private String ctecdProdTypeImg1Filename;
	
	@Column(name="ctecd_prod_type_img1_filepath", length=100)
	private String ctecdProdTypeImg1Filepath;
	
	@Column(name="ctecd_prod_type_img2_filename", length=100)
	private String ctecdProdTypeImg2Filename;
	
	@Column(name="ctecd_prod_type_img2_filepath", length=100)
	private String ctecdProdTypeImg2Filepath;
	
	@Column(name="ctecd_prod_type_img3_filename", length=100)
	private String ctecdProdTypeImg3Filename;
	
	@Column(name="ctecd_prod_type_img3_filepath", length=100)
	private String ctecdProdTypeImg3Filepath;
	
	@Column(name="ctecd_prod_type_img4_filename", length=100)
	private String ctecdProdTypeImg4Filename;
	
	@Column(name="ctecd_prod_type_img4_filepath", length=100)
	private String ctecdProdTypeImg4Filepath;
	
	@Column(name="ctecd_new_used", length=1)
	private String ctecdNewUsed;
	
	@Column(name="ctecd_status", length=1)
	private String ctecdStatus;
	
	@Column(name="ctecd_reason", length=100)
	private String ctecdReason;
	
	@Column(name="ctecd_created_by", length=40)
	private String ctecdCreateBy;
	
	@Column(name="ctecd_created_date")
	private Date ctecdCreateDate;
	
	@Column(name="ctecd_updated_by", length=40)
	private String ctecdUpdateBy;
	
	@Column(name="ctecd_updated_date")
	private Date ctecdUpdateDate;
	
	@Column(name="ctecd_best_price", length=1)
	private String ctecdBestPrice;
	
	@Column(name="ctecd_best_product", length=1)
	private String ctecdBestProduct;
	
	@Column(name="ctecd_new_product", length=1)
	private String ctecdNewProduct;
	
	@Column(name="ctecd_sale", length=1)
	private String ctecdSale;
	
	@Column(name="ctecd_img1_ctpic_ref_no")
	private Integer ctecdImg1CtpicRefNo;
	
	@Column(name="ctecd_img1_ctpic_seq_no")
	private Integer ctecdImg1CtpicSeqNo;
	
	@Column(name="ctecd_img2_ctpic_ref_no")
	private Integer ctecdImg2CtpicRefNo;
	
	@Column(name="ctecd_img2_ctpic_seq_no")
	private Integer ctecdImg2CtpicSeqNo;
	
	@Column(name="ctecd_img3_ctpic_ref_no")
	private Integer ctecdImg3CtpicRefNo;
	
	@Column(name="ctecd_img3_ctpic_seq_no")
	private Integer ctecdImg3CtpicSeqNo;
	
	@Column(name="ctecd_img4_ctpic_ref_no")
	private Integer ctecdImg4CtpicRefNo;
	
	@Column(name="ctecd_img4_ctpic_seq_no")
	private Integer ctecdImg4CtpicSeqNo;

}
