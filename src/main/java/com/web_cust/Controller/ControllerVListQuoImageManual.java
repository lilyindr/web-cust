package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.VListQuoImageManual;
import com.web_cust.Services.ServiceVListQuoImageManual;

@RestController
public class ControllerVListQuoImageManual {
	
	@Autowired
	ServiceVListQuoImageManual servVlqim;
	
	@GetMapping("/webcust/getVlqimListAll")
	public List<VListQuoImageManual> getVlqimListAll(){
		return servVlqim.getVlqimListAll();
	}

}
