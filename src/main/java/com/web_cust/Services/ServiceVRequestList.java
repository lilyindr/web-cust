package com.web_cust.Services;

import java.nio.file.Files;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.web_cust.Models.VRequestList;
import com.web_cust.Repository.IVRequestListRepository;




@Service
public class ServiceVRequestList {
	@Autowired
	IVRequestListRepository repoVrl;
	
	public List<VRequestList> getRequestByUser (String usr){
		return repoVrl.findByVrlCustnoOrderByVrlDateSort(usr);
	}
	
	public List<VRequestList> getRequestByUserStatus (String usr, String stat){
		return repoVrl.findByVrlCustnoAndVrlStatusOrderByVrlDateSort(usr, stat);
	}
	
	public List<VRequestList> getRequestByRequst (String req){
		return repoVrl.findByVrlReqno(req);
	}
	
	
}
