package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransResultBlastDtl;
import com.web_cust.Repository.ICoreTransResultBlastDtlRepository;

@RestController
public class ControllerCoreTransResultBlastDtl {
	
	@Autowired
	ICoreTransResultBlastDtlRepository servCtrbd;
	
	@GetMapping("/webcust/getCtrbdListAll")
	public List<CoreTransResultBlastDtl> getCtrbdListAll(){
		return servCtrbd.findAll();
	}
	
	@GetMapping("/webcust/getCtrbdListByctrbdCtrbhId")
	public List<CoreTransResultBlastDtl> getReqVeriDtlListByctrbdCtrbhId(String CtrbhId){
		return servCtrbd.findByctrbdCtrbhId(CtrbhId);
	}

}
