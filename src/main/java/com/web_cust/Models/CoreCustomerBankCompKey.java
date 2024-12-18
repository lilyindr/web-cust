package com.web_cust.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CoreCustomerBankCompKey  implements Serializable{
	
	private BigDecimal ccbaId;
	
	private String ccbaCustNo;

}
