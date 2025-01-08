package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.VCategoryType;
import com.web_cust.Services.ServiceVCategoryType;

@RestController
public class ControllerVCategoryType {
	
	@Autowired
	ServiceVCategoryType servVct;
	
	@GetMapping("/webcust/getVctListAll")
	public List<VCategoryType> getVctListAll(){
		return servVct.getVctListAll();
	}
	
	@GetMapping("/webcust/getVctListByCtechIdAndCtwIdAndCtwcCmctId")
	public List<VCategoryType> getVctListByCtechIdAndCtwIdAndCtwcCmctId(String CtechId, Integer CtwId, Integer CtwcCmctId){
		return servVct.getVctListByCtechIdAndCtwIdAndCtwcCmctId(CtechId, CtwId, CtwcCmctId);
	}

}
