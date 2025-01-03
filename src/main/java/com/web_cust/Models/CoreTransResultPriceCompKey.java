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
@Data

public class CoreTransResultPriceCompKey implements Serializable{
	
	private String ctrpCtrbhId;	
	private Integer ctrpCtrbdId;

}
