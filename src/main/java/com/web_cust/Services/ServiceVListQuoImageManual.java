package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.VListQuoImageManual;
import com.web_cust.Repository.IVListQuoImageManualRepository;

@Service
public class ServiceVListQuoImageManual {
	
	@Autowired
	IVListQuoImageManualRepository repoVlqim;
	
	public List<VListQuoImageManual> getVlqimListAll(){
		return repoVlqim.findAll();
	}

}
