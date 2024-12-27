package com.web_cust.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Repository.ICoreCustomerGeneralRepository;
import com.web_cust.Services.ServiceCoreCustomerPic;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerCoreCustomerPic {
	@Autowired
	ServiceCoreCustomerPic servCcPic;
}
