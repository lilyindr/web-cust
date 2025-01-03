package com.web_cust.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_cust.Models.CoreTransResultRegion;
import com.web_cust.Models.CoreTransResultRegionCompKey;

@Repository
public interface ICoreTransResultRegionRepository extends JpaRepository<CoreTransResultRegion,CoreTransResultRegionCompKey>{

}
