package com.web_cust.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_cust.Models.CoreTransPictures;
import com.web_cust.Models.CoreTransPicturesCompKey;

@Repository
public interface ICoreTransPicturesRepository extends JpaRepository<CoreTransPictures,CoreTransPicturesCompKey>{

}
