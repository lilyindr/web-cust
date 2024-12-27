package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransCommercial;
import com.web_cust.Repository.ICoreTransCommercialRepository;

@Service
public class ServiceCoreTransCommercil {
	
	@Autowired
	ICoreTransCommercialRepository repoCtcmc;
	
	public List<CoreTransCommercial> getCtcmcListAll(){
		return repoCtcmc.findAll();
	}

}
