package com.web_cust.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.web_cust.Repository.ICoreCustomerAddressRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceCoreCustomerAddress {
	@Autowired
	ICoreCustomerAddressRepository repoCcAddr;
}