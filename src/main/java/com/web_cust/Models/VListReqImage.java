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
@Table(name = "list_req_image")
public class VListReqImage {
	
	@Id
	@Column(name="lri_req_no", length=20, nullable = false)
	private String lriReqNo;
	
	@Column(name="lri_seq_no", length=20)
	private String lriSeqNo;
	
	@Column(name="lri_img_id")
	private Integer lriImgId;
	
	@Column(name="lri_image_filename", length=100)
	private String lriImageFilename;
	
	@Column(name="lri_image_filepath", length=100)
	private String lriImageFilepath;

}
