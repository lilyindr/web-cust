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
@Table(name = "core_trans_result_price")
@IdClass(CoreTransResultPriceCompKey.class)
public class CoreTransResultPrice {
	
	@Id
	@Column(name="ctrp_ctrbh_id", length = 20, nullable = false)
	private String ctrpCtrbhId;
	
	@Id
	@Column(name="ctrp_ctrbd_id", nullable = false)
	private Integer ctrpCtrbdId;
	
	@Column(name="ctrp_ctbh_id", length = 20)
	private String ctrpCtbhId;
	
	@Column(name="ctrp_supp_no", length=20)
	private String ctrpSuppNo;
	
	@Column(name="ctrp_product_code")
	private Integer ctrpProductCode;
	
	@Column(name="ctrp_product_name", length=60)
	private String ctrpProductName;
	
	@Column(name="ctrp_producttype_code")
	private Integer ctrpProducttypeCode;
	
	@Column(name="ctrp_producttype_name", length=60)
	private String ctrpProducttypeName;
	
	@Column(name="ctrp_producttype_price")
	private BigDecimal ctrpProducttypePrice;
	
	@Column(name="ctrp_producttype_qty")
	private Integer ctrpProducttypeQty;
	
	@Column(name="ctrp_revise_price")
	private BigDecimal ctrpRevisePrice;
	
	@Column(name="ctrp_revise_qty")
	private Integer ctrpReviseQty;
	
	@Column(name="ctrp_is_flag", length=1)
	private String ctrpIsFlag;
	
	@Column(name="ctrp_notes", length=100)
	private String ctrpNotes;
	
	@Column(name="ctrp_delivery_addr_id")
	private Integer ctrpDeliveryAddrId;
	
	@Column(name="ctrp_created_by", length=40)
	private String ctrpCreateBy;
	
	@Column(name="ctrp_created_date")
	private Date ctrpCreateDate;
	
	@Column(name="ctrp_updated_by", length=40)
	private String ctrpUpdateBy;
	
	@Column(name="ctrp_updated_date")
	private Date ctrpUpdateDate;

}
