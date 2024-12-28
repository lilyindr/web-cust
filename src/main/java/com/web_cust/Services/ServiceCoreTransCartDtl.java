package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransCartDtl;
import com.web_cust.Repository.ICoreTransCartDtlRepository;

@Service
public class ServiceCoreTransCartDtl {
	
	@Autowired
	ICoreTransCartDtlRepository repoCtcd;
	
	public List<CoreTransCartDtl> getCtcdListAll(){
		return repoCtcd.findAll();
	}
	
	public List<CoreTransCartDtl> getCtcdListByCtchId(String CtchId){
		return repoCtcd.findByctcdCtchId(CtchId);
	}

}
