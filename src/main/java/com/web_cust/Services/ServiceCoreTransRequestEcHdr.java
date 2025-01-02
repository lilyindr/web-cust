package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransRequestEcHdr;
import com.web_cust.Repository.ICoreTransRequestEcHdrRepository;

@Service
public class ServiceCoreTransRequestEcHdr {
	
	@Autowired
	ICoreTransRequestEcHdrRepository repoCtech;
	
	public List<CoreTransRequestEcHdr> getCtechListAll(){
		return repoCtech.findAll();
	}

}
