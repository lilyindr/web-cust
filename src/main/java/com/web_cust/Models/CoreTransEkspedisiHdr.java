package com.web_cust.Models;

import java.math.BigDecimal;
import java.util.Date;

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
@Table(name = "core_trans_ekspedisi_hdr")
public class CoreTransEkspedisiHdr {
	
	@Id
	@Column(name="cteksh_id", length=40, nullable = false)
	private String ctekshId;
	
	@Column(name="cteksh_date")
	private Date ctekshDate;
	
	@Column(name="cteksh_ctqh_id", length=20)
	private String ctekshCtqhId;
	
	@Column(name="cteksh_ctqh_date")
	private Date ctekshCtqhDate;
	
	@Column(name="cteksh_ekspedisi_id", length=20)
	private String ctekshEkspedisiId;
	
	@Column(name="cteksh_ekspedisi", length=60)
	private String ctekshEkspedisi;
	
	@Column(name="cteksh_delivery_date")
	private Date ctekshDeliveryDate;
	
	@Column(name="cteksh_arrival_date")
	private Date ctekshArrivalDate;
	
	@Column(name="cteksh_send_image1_filename", length=100)
	private String ctekshSendImage1Filename;
	
	@Column(name="cteksh_send_image1_filepath", length=100)
	private String ctekshSendImage1Filepath;
	
	@Column(name="cteksh_send_image2_filename", length=100)
	private String ctekshSendImage2Filename;
	
	@Column(name="cteksh_send_image2_filepath", length=100)
	private String ctekshSendImage2Filepath;
	
	@Column(name="cteksh_send_image3_filename", length=100)
	private String ctekshSendImage3Filename;
	
	@Column(name="cteksh_send_image3_filepath", length=100)
	private String ctekshSendImage3Filepath;
	
	@Column(name="cteksh_send_image4_filename", length=100)
	private String ctekshSendImage4Filename;
	
	@Column(name="cteksh_send_image4_filepath", length=100)
	private String ctekshSendImage4Filepath;
	
	@Column(name="cteksh_received_img1_filename", length=100)
	private String ctekshReceivedImg1Filename;
	
	@Column(name="cteksh_received_img1_filepath", length=100)
	private String ctekshReceivedImg1Filepath;
	
	@Column(name="cteksh_received_img2_filename", length=100)
	private String ctekshReceivedImg2Filename;
	
	@Column(name="cteksh_received_img2_filepath", length=100)
	private String ctekshReceivedImg2Filepath;
	
	@Column(name="cteksh_received_img3_filename", length=100)
	private String ctekshReceivedImg3Filename;
	
	@Column(name="cteksh_received_img3_filepath", length=100)
	private String ctekshReceivedImg3Filepath;
	
	@Column(name="cteksh_received_img4_filename", length=100)
	private String ctekshReceivedImg4Filename;
	
	@Column(name="cteksh_received_img4_filepath", length=100)
	private String ctekshReceivedImg4Filepath;
	
	@Column(name="cteksh_created_by", length=40)
	private String ctekshCreatedBy;
	
	@Column(name="cteksh_created_date")
	private Date ctekshCreateDate;
	
	@Column(name="cteksh_updated_by", length=40)
	private String ctekshUpdateBy;
	
	@Column(name="cteksh_updated_date")
	private Date ctekshUpdateDate;

}
