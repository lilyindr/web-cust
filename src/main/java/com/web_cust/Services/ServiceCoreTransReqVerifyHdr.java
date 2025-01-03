package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransReqVerifyHdr;
import com.web_cust.Repository.ICoreTransReqVerifyHdrRepository;

@Service
public class ServiceCoreTransReqVerifyHdr {
	
	@Autowired
	ICoreTransReqVerifyHdrRepository repoCtrvh;
	
	public List<CoreTransReqVerifyHdr> getCtrvhListAll(){
		return repoCtrvh.findAll();
	}

}
