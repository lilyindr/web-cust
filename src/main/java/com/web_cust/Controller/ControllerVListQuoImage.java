package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.VListQuoImage;
import com.web_cust.Services.ServiceVListQuoImage;

@RestController
public class ControllerVListQuoImage {
	
	@Autowired
	ServiceVListQuoImage servVlqi;
	
	@GetMapping("/webcust/getVlqiListAll")
	public List<VListQuoImage> getVlqiListAll(){
		return servVlqi.getVlqiListAll();
	}

}
