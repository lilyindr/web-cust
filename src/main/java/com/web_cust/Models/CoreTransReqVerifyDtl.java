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
@Table(name = "core_trans_reqverify_dtl")
@IdClass(CoreTransReqVerifyDtlCompKey.class)
public class CoreTransReqVerifyDtl {
	
	@Id
	@Column(name="ctrvd_ctrvh_ctech_id", length=20, nullable = false)
	private String ctrvdCtrvhCtechId;
	
	@Id
	@Column(name="ctrvd_ctecd_id", length=20, nullable = false)
	private String ctrvdCtecdId;
	
	@Column(name="ctrvd_product_code")
	private Integer ctrvdProductCode;
	
	@Column(name="ctrvd_product_name", length=60)
	private String ctrvdProductName;
	
	@Column(name="ctrvd_producttype_code")
	private Integer ctrvdProducttypeCode;
	
	@Column(name="ctrvd_producttype_name", length=60)
	private String ctrvdProducttypeName;
	
	@Column(name="ctrvd_producttype_stock_qty")
	private Integer ctrvdProducttypeStockQty;
	
	@Column(name="ctrvd_producttype_min_qty")
	private Integer ctrvdProducttypeMinQty;
	
	@Column(name="ctrvd_producttype_price")
	private BigDecimal ctrvdProducttypePrice;
	
	@Column(name="ctrvd_producttype_range_qty1")
	private Integer ctrvdProducttypeRangeQty1;
	
	@Column(name="ctrvd_producttype_range_price1")
	private BigDecimal ctrvdProducttypeRangePrice1;
	
	@Column(name="ctrvd_producttype_range_qty2")
	private Integer ctrvdProducttypeRangeQty2;
	
	@Column(name="ctrvd_producttype_range_price2")
	private BigDecimal ctrvdProducttypeRangePrice2;
	
	@Column(name="ctrvd_producttype_desc", length=500)
	private String ctrvdProducttypeDesc;
	
	@Column(name="ctrvd_product_type_size", length=60)
	private String ctrvdProductTypeSize;
	
	@Column(name="ctrvd_product_type_spec", length=60)
	private String ctrvdProductTypeSpec;
	
	@Column(name="ctrvd_product_type_alias", length=60)
	private String ctrvdProductTypeAlias;
	
	@Column(name="ctrvd_new_used", length=1)
	private String ctrvdNewUsed;
	
	@Column(name="ctrvd_status", length=1)
	private String ctrvdStatus;
	
	@Column(name="ctrvd_reason", length=100)
	private String ctrvdReason;
	
	@Column(name="ctrvd_best_price", length=1)
	private String ctrvdBestPrice;
	
	@Column(name="ctrvd_best_product", length=1)
	private String ctrvdBestProduct;
	
	@Column(name="ctrvd_new_product", length=1)
	private String ctrvdNewProduct;
	
	@Column(name="ctrvd_sale", length=1)
	private String ctrvdSale;
	
	@Column(name="ctrvd_created_by", length=40)
	private String ctrvdCreateBy;
	
	@Column(name="ctrvd_created_date")
	private Date ctrvdCreateDate;
	
	@Column(name="ctrvd_updated_by", length=40)
	private String ctrvdUpdateBy;
	
	@Column(name="ctrvd_updated_date")
	private Date ctrvdUpdateDate;

}
