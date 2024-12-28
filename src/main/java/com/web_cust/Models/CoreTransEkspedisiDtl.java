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
@Table(name = "core_trans_ekspedisi_dtl")
@IdClass(CoreTransEkspedisiDtlCompKey.class)
public class CoreTransEkspedisiDtl {
	
	@Id
	@Column(name="cteksd_cteksh_id", length=20, nullable = false)
	private String cteksdCtekshId;
	
	@Id
	@Column(name="cteksd_id", nullable = false)
	private Integer cteksdId;
	
	@Id
	@Column(name="cteksd_type", length=10, nullable = false)
	private String cteksdType;
	
	@Column(name="cteksd_scale", length=10)
	private String cteksdScale;
	
	@Column(name="cteksd_product_code")
	private Integer cteksdProductCode;
	
	@Column(name="cteksd_product_name", length=60)
	private String cteksdProductName;
	
	@Column(name="cteksd_producttype_code")
	private Integer cteksdProducttypeCode;
	
	@Column(name="cteksd_producttype_name", length=60)
	private String cteksdProducttypeName;
	
	@Column(name="cteksd_producttype_price")
	private BigDecimal cteksdProducttypePrice;
	
	@Column(name="cteksd_producttype_qty")
	private Integer cteksdProducttypeQty;
	
	@Column(name="cteksd_notes_send", length=100)
	private String cteksdNotesSend;
	
	@Column(name="cteksd_notes_received", length=100)
	private String cteksdNotesReceived;
	
	@Column(name="cteksd_created_by", length=40)
	private String cteksdCreatedBy;
	
	@Column(name="cteksd_created_date")
	private Date cteksdCreateDate;
	
	@Column(name="cteksd_updated_by", length=40)
	private String cteksdUpdateBy;
	
	@Column(name="cteksd_updated_date")
	private Date cteksdUpdateDate;

}
