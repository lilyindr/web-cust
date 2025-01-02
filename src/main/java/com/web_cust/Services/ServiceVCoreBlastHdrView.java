package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.VCoreBlastHdrView;
import com.web_cust.Repository.IVCoreBlastHdrViewRepository;

@Service
public class ServiceVCoreBlastHdrView {
	
	@Autowired
	IVCoreBlastHdrViewRepository repoVcbhv;
	
	public List<VCoreBlastHdrView> getVcbhvListAll(){
		return repoVcbhv.findAll();
	}

}
