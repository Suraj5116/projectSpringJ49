package com.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	
	@Id
	private int id;
	private String name;
	private String email;
	private String password;
	private Date date;
	
	@Lob
	@Column(length=10000000)
    private byte[] imageData;

	
	

}
