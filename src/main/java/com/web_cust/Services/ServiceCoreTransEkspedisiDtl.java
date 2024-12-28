package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransEkspedisiDtl;
import com.web_cust.Repository.ICoreTransEkspedisiDtlRepository;

@Service
public class ServiceCoreTransEkspedisiDtl {
	
	@Autowired
	ICoreTransEkspedisiDtlRepository repoCteksd;
	
	public List<CoreTransEkspedisiDtl> getCteksdListAll(){
		return repoCteksd.findAll();
	}
	
	public List<CoreTransEkspedisiDtl> getCteksdListByCtekshId(String EkspId){
		return repoCteksd.findBycteksdCtekshId(EkspId);
	}

}
