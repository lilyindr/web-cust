package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransResultBlastDtl;
import com.web_cust.Repository.ICoreTransResultBlastDtlRepository;

@Service
public class ServiceCoreTransResultBlastDtl {
	
	@Autowired
	ICoreTransResultBlastDtlRepository repoCtrbd;
	
	public List<CoreTransResultBlastDtl> getCtrbdListAll(){
		return repoCtrbd.findAll();
	}
	
	public List<CoreTransResultBlastDtl> getCtrbdListByctrbdCtrbhId(String CtrbhId){
		return repoCtrbd.findByctrbdCtrbhId(CtrbhId);
	}

}
