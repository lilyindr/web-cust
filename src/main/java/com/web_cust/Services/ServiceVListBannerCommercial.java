package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.VListBannerCommercial;
import com.web_cust.Repository.IVListBannerCommercialRepository;

@Service
public class ServiceVListBannerCommercial {
	
	@Autowired
	IVListBannerCommercialRepository repoVlbc;
	
	public List<VListBannerCommercial> getVlbcListAll(){
		return repoVlbc.findAll();
	}

}
