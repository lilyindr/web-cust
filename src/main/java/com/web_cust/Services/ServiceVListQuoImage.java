package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.VListQuoImage;
import com.web_cust.Repository.IVListQuoImageRepository;

@Service
public class ServiceVListQuoImage {
	
	@Autowired
	IVListQuoImageRepository repoVlqi;
	
	public List<VListQuoImage> getVlqiListAll(){
		return repoVlqi.findAll();
	}

}
