package com.web_cust.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.web_cust.Models.CoreCustomerGeneral;

@Repository
public interface ICoreCustomerGeneralRepository extends JpaRepository<CoreCustomerGeneral, String>{

}
