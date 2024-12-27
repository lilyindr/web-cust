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
@Table(name = "core_customer_pic")
@IdClass(CoreCustomerPicCompKey.class)
public class CoreCustomerPic {
	@Id
	@Column(name="CCPIC_ID", nullable = false)
	private BigDecimal ccpicId;
	
	@Id
	@Column(name="CCPIC_CCUST_NO", length=20, nullable = false)
	private String ccpicCustNo;
	
	@Column(name="CCPIC_PIC_CUSTNO", length=20, nullable = false)
	private String ccpicPicCustNo;
	
	@Column(name="CCPIC_PIC_NAME", length=60, nullable = false)
	private String ccpicPicName;
	
	@Column(name="CCPIC_PIC_PASSWORD", length=20, nullable = false)
	private String ccpicPicPass;
	
	@Column(name="CCPIC_PIC_EMAIL", length=60, nullable = false)
	private String ccpicPicEmail;
	
	@Column(name="CCPIC_PIC_PHONE", length=20, nullable = false)
	private String ccpicPicPhone;
	
	@Column(name="CCPIC_IS_SAME_MAIN", length=1, nullable = false)
	private String ccpicPicIsSameMain;
	
	@Column(name="CCPIC_CREATED_BY", length=40)
	private String ccpicCreatedBy;
	
	@Column(name="CCPIC_CREATED_DATE")
	private Date ccpicCreateDate;
	
	@Column(name="CCPIC_UPDATED_BY", length=40)
	private String ccpicUpdateBay;
	
	@Column(name="CCPIC_UPDATED_DATE")
	private Date ccpicUpdateDate;

}
