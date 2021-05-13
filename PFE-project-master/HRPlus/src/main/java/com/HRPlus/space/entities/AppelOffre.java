package com.HRPlus.space.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppelOffre implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idOffre;
	private String titre;
	private String description;
	private String typeOffre;
	private Date expirationDate;

	@OneToMany(mappedBy ="appelOffre")
	private List<CandidateAppelOffre> candidateAppelOffre ; 
}
