package com.web_cust.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.web_cust.Models.CoreCustomerGeneral;
import com.web_cust.Models.CoreCustomerPic;
import com.web_cust.Models.CoreCustomerPicCompKey;

@Repository
public interface ICoreCustomerPicRepository extends JpaRepository<CoreCustomerPic,CoreCustomerPicCompKey>{

}
