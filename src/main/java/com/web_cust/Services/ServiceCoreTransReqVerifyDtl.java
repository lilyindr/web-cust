package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransReqVerifyDtl;
import com.web_cust.Repository.ICoreTransReqVerifyDtlRepository;

@Service
public class ServiceCoreTransReqVerifyDtl {
	
	@Autowired
	ICoreTransReqVerifyDtlRepository repoCtrvd;
	
	public List<CoreTransReqVerifyDtl> getCtrvdListAll(){
		return repoCtrvd.findAll();
	}
	
	public List<CoreTransReqVerifyDtl> getCtrvdListByCtrvhCtechId(String CtrvhCtechId){
		return repoCtrvd.findByctrvdCtrvhCtechId(CtrvhCtechId);
	}

}
