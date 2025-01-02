package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.VListBannerCommercial;
import com.web_cust.Services.ServiceVListBannerCommercial;

@RestController
public class ControllerVListBannerCommercial {
	
	@Autowired
	ServiceVListBannerCommercial servVlbc;
	
	@GetMapping("/webcust/getVlbcListAll")
	public List<VListBannerCommercial> getVlbcListAll(){
		return servVlbc.getVlbcListAll();
	}

}
