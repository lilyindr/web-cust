package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransHeader;
import com.web_cust.Repository.ICoreTransHeaderRepository;

@Service
public class ServiceCoreTransHeader {
	
	@Autowired
	ICoreTransHeaderRepository repoCthdr;
	
	public List<CoreTransHeader> getCthdrListAll(){
		return repoCthdr.findAll();
	}

}
