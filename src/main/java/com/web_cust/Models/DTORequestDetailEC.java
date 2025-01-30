package com.web_cust.Models;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
public class DTORequestDetailEC {
	
	
	private String requestNo;
	private Date requestDate;
	private String requestProductName;
	private String requestProductTypeName;
	private BigDecimal requestProductPrice;
	private String requestProductDesc;
	private String requestProductAlias;
	private String requestProductSize;
	private Integer requestProductStock;
	private Integer requestProductMinPurc;
	private String requestProductImage1;
	private String requestProductImage2;
	private String requestProductImage3;
	private String requestProductImage4;
	private String requestSeqNo;

}

