package com.web_cust.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_cust.Models.CoreTransResultPrice;
import com.web_cust.Models.CoreTransResultPriceCompKey;

@Repository
public interface ICoreTransResultPriceRepository extends JpaRepository<CoreTransResultPrice,CoreTransResultPriceCompKey>{

}
