package com.web_cust.Models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "core_trans_pictures")
@IdClass(CoreTransPicturesCompKey.class)
public class CoreTransPictures {
	
	@Id
	@Column(name="ctpic_ref_no", nullable = false)
	private Integer ctpicRefNo;
	
	@Id
	@Column(name="ctpic_seq_no", nullable = false)
	private Integer ctpicSeqNo;
	
	@Column(name="ctpic_upload_type", length=30)
	private String ctpicUploadType;
	
	@Column(name="ctpic_file_name", length=60)
	private String ctpicFileName;
	
	@Column(name="ctpic_server_path", length=150)
	private String ctpicServerPath;	
	
	@Column(name="ctpic_created_by", length=40)
	private String ctpicCreateBy;	
	
	@Column(name="ctpic_created_date")
	private Date ctpicCreateDate;	
	
	@Column(name="ctpic_updated_by", length=40)
	private String ctpicUpdateBy;	
	
	@Column(name="ctpic_updated_date")
	private Date ctpicUpdateDate;	
	
	@Column(name="ctpic_custno", length=40)
	private String ctpicCustNo;	
	
	@Column(name="ctpic_trans_no", length=40)
	private String ctpicTransNo;
	
	@Column(name="ctpic_status", length=1)
	private String ctpicStatus;	
	
	@Column(name="ctpic_image_seq", length=1)
	private String ctpicImageSeq;	

}
