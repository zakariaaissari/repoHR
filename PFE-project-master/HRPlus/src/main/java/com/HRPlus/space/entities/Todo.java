package com.HRPlus.space.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
	
	@Id
	@GeneratedValue
	private long id ;
	private String title; 
	private String description;
	private LocalTime time;
	//private String description;
	private boolean completed=false;
	private Date createdAt;
	
	
	
	
	
	
	
	
	
}
