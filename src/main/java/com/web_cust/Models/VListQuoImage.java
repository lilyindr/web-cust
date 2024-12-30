package com.web_cust.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "list_quo_image")
public class VListQuoImage {
	
	@Id
	@Column(name="lqi_quo_no", length=20, nullable = false)
	private String lqiQuoNo;
	
	@Column(name="lqi_seq_no", length=20)
	private String lqi_seq_no;
	
	@Column(name="lqi_img_id")
	private Integer lqiImgId;
	
	@Column(name="lqi_image_filename", length=100)
	private String lqiImageFilename;
	
	@Column(name="lqi_image_filepath", length=100)
	private String lqiImageFilepath;

}
