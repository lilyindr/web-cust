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
@Table(name = "core_trans_web")
@IdClass(CoreTransWebCompKey.class)
public class CoreTransWeb {
	
	@Id
	@Column(name="ctw_ctech_id", length = 20, nullable = false)
	private String ctwCtechId;
	
	@Id
	@Column(name="ctw_id", nullable = false)
	private Integer ctwId;
	
	@Column(name="ctw_product_code")
	private Integer ctwProductCode;
	
	@Column(name="ctw_product_name", length=60)
	private String ctwProductName;
	
	@Column(name="ctw_producttype_code")
	private Integer ctwProducttypeCode;
	
	@Column(name="ctw_producttype_name", length=60)
	private String ctwProducttypeName;
	
	@Column(name="ctw_producttype_stock_qty")
	private Integer ctwProducttypeStockQty;
	
	@Column(name="ctw_producttype_min_qty")
	private Integer ctwProducttypeMinQty;
	
	@Column(name="ctw_producttype_price")
	private BigDecimal ctwProducttypePrice;
	
	@Column(name="ctw_producttype_range_qty1")
	private Integer ctwProducttypeRangeQty1;
	
	@Column(name="ctw_producttype_range_price1")
	private BigDecimal ctwProducttypeRangePrice1;
	
	@Column(name="ctw_producttype_range_qty2")
	private Integer ctwProducttypeRangeQty2;
	
	@Column(name="ctw_producttype_range_price2")
	private BigDecimal ctwProducttypeRangePrice2;
	
	@Column(name="ctw_producttype_desc", length=500)
	private String ctwProducttypeDesc;
	
	@Column(name="ctw_product_type_size", length=60)
	private String ctwProductTypeSize;
	
	@Column(name="ctw_product_type_spec", length=60)
	private String ctwProductTypeSpec;
	
	@Column(name="ctw_product_type_alias", length=60)
	private String ctwProductTypeAlias;
	
	@Column(name="ctw_new_used", length=1)
	private String ctwNewUsed;
	
	@Column(name="ctw_status", length=1)
	private String ctwStatus;
	
	@Column(name="ctw_upweb_date")
	private Date ctwUpwebDate;
	
	@Column(name="ctw_takedown_date")
	private Date ctwTakedownDate;
	
	@Column(name="ctw_created_by", length=40)
	private String ctwCreateBy;
	
	@Column(name="ctw_created_date")
	private Date ctwCreateDate;
	
	@Column(name="ctw_updated_by", length=40)
	private String ctwUpdateBy;
	
	@Column(name="ctw_updated_date")
	private Date ctwUpdateDate;
	
	@Column(name="ctw_img1_ctpic_ref_no")
	private Integer ctwImg1CtpicRefNo;
	
	@Column(name="ctw_img1_ctpic_seq_no")
	private Integer ctwImg1CtpicSeqNo;
	
	@Column(name="ctw_img2_ctpic_ref_no")
	private Integer ctwImg2CtpicRefNo;
	
	@Column(name="ctw_img2_ctpic_seq_no")
	private Integer ctwImg2CtpicSeqNo;
	
	@Column(name="ctw_img3_ctpic_ref_no")
	private Integer ctwImg3CtpicRefNo;
	
	@Column(name="ctw_img3_ctpic_seq_no")
	private Integer ctwImg3CtpicSeqNo;
	
	@Column(name="ctw_img4_ctpic_ref_no")
	private Integer ctwImg4CtpicRefNo;
	
	@Column(name="ctw_img4_ctpic_seq_no")
	private Integer ctwImg4CtpicSeqNo;

}
