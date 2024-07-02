package com.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
	
	@Id
	private int id;
	private String brand;
	private String No;
	private String type;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Slots slot;
	
	
	

}
