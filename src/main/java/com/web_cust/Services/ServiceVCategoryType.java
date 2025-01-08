package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.VCategoryType;
import com.web_cust.Repository.IVCategoryTypeRepository;

@Service
public class ServiceVCategoryType {
	
	@Autowired
	IVCategoryTypeRepository repoVct;
	
	public List<VCategoryType> getVctListAll(){
		return repoVct.findAll();
	}
	
	public List<VCategoryType> getVctListByCtechIdAndCtwIdAndCtwcCmctId(String CtechId, Integer CtwId, Integer CtwcCmctId){
		return repoVct.findByVctCtechIdAndVctCtwIdAndVctCtwcCmctId(CtechId, CtwId, CtwcCmctId);
	}

}
