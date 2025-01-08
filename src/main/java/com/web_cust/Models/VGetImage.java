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
@AllArgsConstructor
@Entity
@Table(name = "v_get_image")
public class VGetImage {
	
	@Id
	@Column(name="ctpic_ref_no", nullable = false)
	private Integer vgiCtpicRefNo;
	
	@Id
	@Column(name="ctpic_seq_no", nullable = false)
	private Integer vgiCtpicSeqNo;
	
	@Column(name="ctpic_upload_type", length=60)
	private String vgiCtpicUploadType;
	
	@Column(name="ctpic_custno", length=60)
	private String vgiCtpicCustno;
	
	@Column(name="ctpic_trans_no", length=60)
	private String vgiCtpicTransNo;
	
	@Column(name="ctpic_blob_filename", length=60)
	private String vgiCtpicBlobFilename;
	
	@Column(name="ctpic_blob_filepath", length=60)
	private String vgiCtpicBlobFilepath;
	
	@Column(name="ctpic_image_seq", length=60)
	private String vgiCtpicImageSeq;

}
