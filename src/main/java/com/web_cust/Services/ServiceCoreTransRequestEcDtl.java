package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransRequestEcDtl;
import com.web_cust.Repository.ICoreTransRequestEcDtlRepository;

@Service
public class ServiceCoreTransRequestEcDtl {
	
	@Autowired
	ICoreTransRequestEcDtlRepository repoCtecd;
	
	public List<CoreTransRequestEcDtl> getCtecdListAll(){
		return repoCtecd.findAll();
	}
	
	public List<CoreTransRequestEcDtl> getCtecdListByCtechId(String CtechId){
		return repoCtecd.findByctecdCtechId(CtechId);
	}

}
