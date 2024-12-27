package com.web_cust.Models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "core_trans_header")
public class CoreTransHeader {
	
	@Id
	@Column(name="cthdr_id", nullable = false)
	private Integer cthdrId;
	
	@Column(name="cthdr_type", length=3)
	private String cthdrType;
	
	@Column(name="cthdr_ccust_no", length=20)
	private String cthdrCcustNo;
	
	@Column(name="cthdr_req_date")
	private Date cthdrReqDate;
	
	@Column(name="cthdr_req_id", length=20)
	private String cthdrReqId;
	
	@Column(name="cthdr_req_send_date")
	private Date cthdrReqSendDate;
	
	@Column(name="cthdr_req_verify_date")
	private Date cthdrReqVerifyDate;
	
	@Column(name="cthdr_req_verify_sts", length=2)
	private String cthdrReqVerifySts;
	
	@Column(name="cthdr_quo_date")
	private Date cthdrQuoDate;
	
	@Column(name="cthdr_quo_id", length=20)
	private String cthdrQuoId;
	
	@Column(name="cthdr_quo_send_date")
	private Date cthdrQuoSendDate;
	
	@Column(name="cthdr_quo_verify_date")
	private Date cthdrQuoVerifyDate;
	
	@Column(name="cthdr_quo_verify_sts", length=2)
	private String cthdrQuoVerifySts;
	
	@Column(name="cthdr_blast_id", length=20)
	private String cthdrBlastId;
	
	@Column(name="cthdr_blast_date")
	private Date cthdrBlastDate;
	
	@Column(name="cthdr_created_by", length=40)
	private String cthdrCreatedBy;
	
	@Column(name="cthdr_created_date")
	private Date cthdrCreateDate;
	
	@Column(name="cthdr_updated_by", length=40)
	private String cthdrUpdateBy;
	
	@Column(name="cthdr_updated_date")
	private Date cthdrUpdateDate;
	
	@Column(name="cthdr_takedown_date")
	private Date cthdrTakedownDate;
	
	@Column(name="cthdr_upweb_date")
	private Date cthdrUpwebDate;
	
	@Column(name="cthdr_veri_quo_date")
	private Date cthdrVeriQuoDate;
	
	@Column(name="cthdr_order_id", length=20)
	private String cthdrOrderId;
	
	@Column(name="cthdr_order_date")
	private Date cthdrOrderDate;

}
