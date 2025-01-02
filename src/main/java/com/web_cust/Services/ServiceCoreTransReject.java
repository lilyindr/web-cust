package com.web_cust.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.web_cust.Models.CoreTransReject;
import com.web_cust.Repository.ICoreTransRejectRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceCoreTransReject {
	
	@Autowired
	ICoreTransRejectRepository repoCtr;
	
	public List<CoreTransReject> getCtrListAll(){
		return repoCtr.findAll();
	}

}
