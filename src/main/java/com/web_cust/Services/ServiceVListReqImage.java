package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.VListReqImage;
import com.web_cust.Repository.IVListReqImageRepository;

@Service
public class ServiceVListReqImage {
	
	@Autowired
	IVListReqImageRepository repoVlri;
	
	public List<VListReqImage> getVlriListAll(){
		return repoVlri.findAll();
	}

}
