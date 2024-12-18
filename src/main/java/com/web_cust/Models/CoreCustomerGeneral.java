package com.web_cust.Models;

import java.math.BigDecimal;
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
@Table(name = "core_customer_general")
public class CoreCustomerGeneral {
	@Id
	@Column(name="ccust_reg_id", nullable = false)
	private BigDecimal ccustRegId;
	
	@Column(name="ccust_no", length=20, nullable = false)
	private String ccustNo;
	
	@Column(name="ccust_type", length=3, nullable = false)
	private String ccustType;
	
	@Column(name="ccust_name", length=60, nullable = false)
	private String ccustName;
	
	@Column(name="ccust_alias", length=60)
	private String ccustAlias;
	
	@Column(name="ccust_email", length=60, nullable = false)
	private String ccustEmail;
	
	@Column(name="ccust_phone", length=20)
	private String ccustPhone;
	
	@Column(name="ccust_handphone", length=20, nullable = false)
	private String ccustHandPhone;
	
	@Column(name="ccust_password", length=20, nullable = false)
	private String ccustPassword;
	
	@Column(name="ccust_status", length=1, nullable = false)
	private String ccustStatus;
	
	@Column(name="ccust_area_name", length=50)
	private String ccustAreaName;
	
	@Column(name="ccust_npwp_no", length=20)
	private String ccustNpwpNo;
	
	@Column(name="ccust_nib_no", length=30)
	private String ccustNibNo;
	
	@Column(name="ccust_pkp_no", length=20)
	private String ccustPkbNo;
	
	@Column(name="ccust_ktp_no", length=20)
	private String ccustKtpNo;
	
	@Column(name="ccust_grade", length=20)
	private String ccustGrade;
	
	@Column(name="ccust_created_by", length=40)
	private String ccustCreateBy;
	
	@Column(name="ccust_created_date")
	private Date ccustCreateDate;
	
	@Column(name="ccust_updated_by", length=40)
	private String ccustUpdateBay;
	
	@Column(name="ccust_updated_date")
	private Date ccustUpdateDate;
	
	@Column(name="ccust_need_approval")
	private Integer ccustNeedApproval;
	
	@Column(name="ccust_npwp_ctpic_ref_no")
	private Integer ccustNpwpPicRefNo;
	
	@Column(name="ccust_npwp_ctpic_seq_no")
	private Integer ccustNpwpPicSeqNo;
	
	@Column(name="ccust_nib_ctpic_ref_no")
	private Integer ccustNibPicRefNo;
	
	@Column(name="ccust_nib_ctpic_seq_no")
	private Integer ccustNibPicSeqNo;
	
	@Column(name="ccust_pkp_ctpic_ref_no")
	private Integer ccustPkpPicRefNo;
	
	@Column(name="ccust_pkp_ctpic_seq_no")
	private Integer ccustPkpPicSeqNo;
	
	@Column(name="ccust_ktp_ctpic_ref_no")
	private Integer ccustKtpPicRefNo;
	
	@Column(name="ccust_ktp_ctpic_seq_no")
	private Integer ccustKtpPicSeqNo;
}
