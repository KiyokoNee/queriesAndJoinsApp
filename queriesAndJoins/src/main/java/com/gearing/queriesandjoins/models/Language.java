package com.gearing.queriesandjoins.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="languages")
public class Language {
	// Generic Tracking variables for the class
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// Other variables here
	private String country_code;
	private String language;
	private String is_Official;
	private Double percentage;
	private Integer country_id;
	
	// Empty constructor to meet Bean requirements
	public Language() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public Integer getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getIs_Official() {
		return is_Official;
	}

	public void setIs_Official(String is_Official) {
		this.is_Official = is_Official;
	}

}
