package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransBlastHdr;
import com.web_cust.Repository.ICoreTransBlastHdrRepository;

@Service
public class ServiceCoreTransBlastHdr {
	
	@Autowired
	ICoreTransBlastHdrRepository repoCtbh;
	
	public List<CoreTransBlastHdr> getCtbhListAll(){
		return repoCtbh.findAll();
	}

}
