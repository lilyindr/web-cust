package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.VListReqImage;
import com.web_cust.Services.ServiceVListReqImage;

@RestController
public class ControllerVListReqImage {
	
	@Autowired
	ServiceVListReqImage servVlri;
	
	@GetMapping("/webcust/getVlriListAll")
	public List<VListReqImage> getVlriListAll(){
		return servVlri.getVlriListAll();
	}

}
