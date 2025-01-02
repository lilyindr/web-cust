package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransPictures;
import com.web_cust.Repository.ICoreTransPicturesRepository;

@Service
public class ServiceCoreTransPictures {
	
	@Autowired
	ICoreTransPicturesRepository repoCtpic;
	
	public List<CoreTransPictures> getCtpicListAll(){
		return repoCtpic.findAll();
	}

}
