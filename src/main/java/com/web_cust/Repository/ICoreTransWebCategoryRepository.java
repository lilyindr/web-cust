package com.web_cust.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_cust.Models.CoreTransWebCategory;
import com.web_cust.Models.CoreTransWebCategoryCompKey;

@Repository
public interface ICoreTransWebCategoryRepository extends JpaRepository<CoreTransWebCategory,CoreTransWebCategoryCompKey>{

}
