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
@Table(name = "list_quo_image_manual")
public class VListQuoImageManual {
	
	@Id
	@Column(name="lqim_quo_no", length=20, nullable = false)
	private String lqimQuoNo;
	
	@Column(name="lqim_img_id")
	private Integer lqimImgId;
	
	@Column(name="lqim_image_filename", length=100)
	private String lqimImageFilename;
	
	@Column(name="lqim_image_filepath", length=100)
	private String lqimImageFilepath;

}
