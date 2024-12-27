package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransNotification;
import com.web_cust.Repository.ICoreTransNotificationRepository;

@Service
public class ServiceCoreTransNotification {
	
	@Autowired
	ICoreTransNotificationRepository repoCtnotif;
	
	public List<CoreTransNotification> getCtnotifListAll(){
		return repoCtnotif.findAll();
	}

}
