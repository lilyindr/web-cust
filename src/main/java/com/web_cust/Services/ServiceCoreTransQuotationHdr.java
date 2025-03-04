package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransQuotationHdr;
import com.web_cust.Repository.ICoreTransQuotationHdrRepository;

@Service
public class ServiceCoreTransQuotationHdr {
	
	@Autowired
	ICoreTransQuotationHdrRepository repoCtqh;
	
	public List<CoreTransQuotationHdr> getCtqhListAll(){
		return repoCtqh.findAll();
	}

}
