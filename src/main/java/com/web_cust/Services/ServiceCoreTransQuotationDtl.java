package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransQuotationDtl;
import com.web_cust.Repository.ICoreTransQuotationDtlRepository;

@Service
public class ServiceCoreTransQuotationDtl {
	
	@Autowired
	ICoreTransQuotationDtlRepository repoCtqd;
	
	public List<CoreTransQuotationDtl> getCtqdListAll(){
		return repoCtqd.findAll();
	}
	
	public List<CoreTransQuotationDtl> getCtqdListByCtqhId(String CtqhId){
		return repoCtqd.findByctqdCtqhId(CtqhId);
	}
	
}
