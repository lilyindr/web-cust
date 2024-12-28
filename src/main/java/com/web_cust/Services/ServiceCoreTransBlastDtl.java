package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransBlastDtl;
import com.web_cust.Repository.ICoreTransBlastDtlRepository;

@Service
public class ServiceCoreTransBlastDtl {
	
	@Autowired
	ICoreTransBlastDtlRepository repoCtbd;
	
	public List<CoreTransBlastDtl> getCtbdListAll(){
		return repoCtbd.findAll();
	}
	
	public List<CoreTransBlastDtl> getCtbdListByCtbhId(String CtbhId){
		return repoCtbd.findByctbdCtbhId(CtbhId);
	}

}
