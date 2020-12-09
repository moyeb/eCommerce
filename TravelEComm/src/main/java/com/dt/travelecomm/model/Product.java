package com.dt.travelecomm.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Data
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	@Entity

public class Product {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "product_id")
	    private Long id;


}
