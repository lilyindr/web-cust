package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransResultRegion;
import com.web_cust.Repository.ICoreTransResultRegionRepository;

@Service
public class ServiceCoreTransResultRegion {
	
	@Autowired
	ICoreTransResultRegionRepository repoCtrr;
	
	public List<CoreTransResultRegion> getCtrrListAll(){
		return repoCtrr.findAll();
	}

}
