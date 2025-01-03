package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransWeb;
import com.web_cust.Repository.ICoreTransWebRepository;

@Service
public class ServiceCoreTransWeb {
	
	@Autowired
	ICoreTransWebRepository repoCtw;
	
	public List<CoreTransWeb> getCtwebListAll(){
		return repoCtw.findAll();
	}

}
