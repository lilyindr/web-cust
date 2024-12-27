package com.web_cust.Repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_cust.Models.CoreCustomerAddress;
import com.web_cust.Models.CoreCustomerAddressCompKey;
import com.web_cust.Models.CoreCustomerBank;
import com.web_cust.Models.CoreCustomerBankCompKey;
import com.web_cust.Models.CoreTransUser;

@Repository
public interface ICoreTransUserRepository extends JpaRepository<CoreTransUser, BigDecimal>{

}
