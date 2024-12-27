package com.web_cust.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_cust.Models.CoreCustomerBank;
import com.web_cust.Models.CoreCustomerBankCompKey;

@Repository
public interface ICoreCustomerBankRepository extends JpaRepository<CoreCustomerBank,CoreCustomerBankCompKey> {

}
