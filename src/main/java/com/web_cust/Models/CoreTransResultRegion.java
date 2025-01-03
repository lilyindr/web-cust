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
@Table(name = "core_trans_result_region")
@IdClass(CoreTransResultRegionCompKey.class)
public class CoreTransResultRegion {
	
	@Id
	@Column(name="ctrr_ctrbh_id", length = 20, nullable = false)
	private String ctrrCtrbhId;
	
	@Id
	@Column(name="ctrr_ctrbd_id", nullable = false)
	private Integer ctrrCtrbdId;
	
	@Column(name="ctrr_ctbh_id", length = 20)
	private String ctrrCtbhId;
	
	@Column(name="ctrr_supp_no", length=20)
	private String ctrrSuppNo;
	
	@Column(name="ctrr_product_code")
	private Integer ctrrProductCode;
	
	@Column(name="ctrr_product_name", length=60)
	private String ctrrProductName;
	
	@Column(name="ctrr_producttype_code")
	private Integer ctrrProducttypeCode;
	
	@Column(name="ctrr_producttype_name", length=60)
	private String ctrrProducttypeName;
	
	@Column(name="ctrr_producttype_price")
	private BigDecimal ctrrProducttypePrice;
	
	@Column(name="ctrr_producttype_qty")
	private Integer ctrrProducttypeQty;
	
	@Column(name="ctrr_revise_price")
	private BigDecimal ctrrRevisePrice;
	
	@Column(name="ctrr_revise_qty")
	private Integer ctrrReviseQty;
	
	@Column(name="ctrr_is_flag", length=1)
	private String ctrrIsFlag;
	
	@Column(name="ctrr_notes", length=100)
	private String ctrrNotes;
	
	@Column(name="ctrr_delivery_addr_id")
	private Integer ctrrDeliveryAddrId;
	
	@Column(name="ctrr_provinsi", length=20)
	private String ctrrProvinsi;
	
	@Column(name="ctrr_city", length=20)
	private String ctrrCity;
	
	@Column(name="ctrr_kecamatan", length=20)
	private String ctrrKecamatan;
	
	@Column(name="ctrr_created_by", length=40)
	private String ctrrCreateBy;
	
	@Column(name="ctrr_created_date")
	private Date ctrrCreateDate;
	
	@Column(name="ctrr_updated_by", length=40)
	private String ctrrUpdateBy;
	
	@Column(name="ctrr_updated_date")
	private Date ctrrUpdateDate;	

}
