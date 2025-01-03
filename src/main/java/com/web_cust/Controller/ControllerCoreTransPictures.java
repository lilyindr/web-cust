package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransPictures;
import com.web_cust.Services.ServiceCoreTransPictures;

@RestController
public class ControllerCoreTransPictures {
	
	@Autowired
	ServiceCoreTransPictures servCtpic;
	
	@GetMapping("/webcust/getCtpicListAll")
	public List<CoreTransPictures> getCtpicListAll(){
		return servCtpic.getCtpicListAll();
	}

}
