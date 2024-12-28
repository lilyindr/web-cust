package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransEkspedisiHdr;
import com.web_cust.Repository.ICoreTransEkspedisiHdrRepository;

@Service
public class ServiceCoreTransEkspedisiHdr {
	
	@Autowired
	ICoreTransEkspedisiHdrRepository repoCteksh;
	
	public List<CoreTransEkspedisiHdr> getCtekshListAll(){
		return repoCteksh.findAll();
	}

}
