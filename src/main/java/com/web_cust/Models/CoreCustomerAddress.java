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
@Table(name = "core_customer_address")
@IdClass(CoreCustomerAddressCompKey.class)
public class CoreCustomerAddress {
	
	@Id
	@Column(name="CCADDR_ID", nullable = false)
	private BigDecimal ccaddrId;
	
	@Id
	@Column(name="CCADDR_CCUST_NO", length=20, nullable = false)
	private String ccaddrCustNo;
	
	@Column(name="CCADDR_TYPE", length=50)
	private String ccaddrType;
	
	@Column(name="CCADDR_ADDRESS", length=100)
	private String ccaddrAddress;
	
	@Column(name="CCADDR_RT", length=4)
	private String ccaddrRt;
	
	@Column(name="CCADDR_RW", length=4)
	private String ccaddrRw;
	
	@Column(name="CCADDR_PROV_CODE", length=10)
	private String ccaddrProvCode;
	
	@Column(name="CCADDR_CITY_CODE", length=10)
	private String ccaddrCityCode;
	
	@Column(name="CCADDR_KEC_CODE", length=10)
	private String ccaddrKecCode;
	
	@Column(name="CCADDR_KEL_CODE", length=10)
	private String ccaddrKelCode;
	
	@Column(name="CCADDR_ZIP_CODE", length=6)
	private String ccaddrZipCode;
	
	@Column(name="CCADDR_LONGLAT", length=100)
	private String ccaddrLongLat;
	
	@Column(name="CCADDR_AREA_NAME", length=100)
	private String ccaddrArea;

	@Column(name="CCADDR_CREATED_BY", length=40)
	private String ccpAddrCreatedBy;
	
	@Column(name="CCADDR_CREATED_DATE")
	private Date ccAddrCreateDate;
	
	@Column(name="CCADDR_UPDATED_BY", length=40)
	private String ccAddrUpdateBay;
	
	@Column(name="CCADDR_UPDATED_DATE")
	private Date ccAddrUpdateDate;   

}
