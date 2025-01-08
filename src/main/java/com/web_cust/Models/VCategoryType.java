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
@Table(name = "v_category_type")
@IdClass(VCategoryTypeCompKey.class)
public class VCategoryType {
	
	@Id
	@Column(name="vct_ctech_id", length=20, nullable = false)
	private String vctCtechId;
	
	@Id
	@Column(name="vct_ctw_id", nullable = false)
	private Integer vctCtwId;
	
	@Id
	@Column(name="vct_ctwc_cmct_id", nullable = false)
	private Integer vctCtwcCmctId;
	
	@Column(name="vct_prodcode")
	private Integer vctProdCode;
	
	@Column(name="vct_prodname", length=60)
	private String vctProdName;
	
	@Column(name="vct_prodtypecode")
	private Integer vctProdTypeCode;
	
	@Column(name="vct_prodtypename", length=60)
	private String vctProdTypeName;
	
	@Column(name="vct_stock_qty")
	private Integer vctStockQty;
	
	@Column(name="vct_min_qty")
	private Integer vctMinQty;
	
	@Column(name="vct_price")
	private BigDecimal vctPrice; 
	
	@Column(name="vct_range_qty1")
	private Integer vctRangeQty1;
	
	@Column(name="vct_price1")
	private BigDecimal vctPrice1; 
	
	@Column(name="vct_range_qty2")
	private Integer vctRangeQty2;
	
	@Column(name="vct_price2")
	private BigDecimal vctPrice2; 
	
	@Column(name="vct_prodtypedesc", length=500)
	private String vctProdTypeDesc;
	
	@Column(name="vct_prodtypesize", length=60)
	private String vctProdTypeSize;
	
	@Column(name="vct_prodtypespec", length=60)
	private String vctProdTypeSpec;
	
	@Column(name="vct_prodtypealias", length=60)
	private String vctProdTypeAlias;
	
	@Column(name="vct_img1_filename", length=60)
	private String vctImg1Filename;
	
	@Column(name="vct_img1_filepath", length=150)
	private String vctImg1Filepath;
	
	@Column(name="vct_img2", length=60)
	private String vctImg2;
	
	@Column(name="vct_img3", length=60)
	private String vctImg3;
	
	@Column(name="vct_img4", length=60)
	private String vctImg4;
	
	@Column(name="vct_newused", length=1)
	private String vctNewUsed;
	
	@Column(name="vct_status", length=1)
	private String vctStatus;
	
	@Column(name="vct_upwebdate")
	private Date vctUpwebDate;
	
	@Column(name="vct_takedowndate")
	private Date vctTakedownDate;
	
	@Column(name="vct_categorydesc", length=100)
	private String vctCategoryDesc;
	
	@Column(name="vct_cust_no", length=20)
	private String vctCustNo;

}
