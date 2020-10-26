package com.groupsms.codetest.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table( name = "tbmstproduct")
public class Product {


	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "PRODUCTID")
	private Long productId;
	
	//@JsonDeserialize(using = LocalDateDeserializer.class)  
	//@JsonSerialize(using = LocalDateSerializer.class)
	
	 @JsonFormat(pattern = "yyyy-MM-dd HH:mm", shape = JsonFormat.Shape.STRING)
	@Column(name= "STARTDATE")
	private LocalDateTime startDate;
	
	//@JsonDeserialize(using = LocalDateDeserializer.class)  
	//@JsonSerialize(using = LocalDateSerializer.class)
	 @JsonFormat(pattern = "yyyy-MM-dd HH:mm", shape = JsonFormat.Shape.STRING)
	@Column(name= "ENDDATE")
	private LocalDateTime endDate;

	@Column(name= "PRICE")
	private Double price;

	@Column(name= "CITY")
	private String city;
	
	@Column(name= "COOLOR")
	private String color;
	
	@Column(name= "STATUS")
	private String status;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
