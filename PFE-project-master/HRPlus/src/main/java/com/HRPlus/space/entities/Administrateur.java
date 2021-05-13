package com.HRPlus.space.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

@EqualsAndHashCode(callSuper = false)
@Table(name = "admins")
@NoArgsConstructor
@AllArgsConstructor
public class Administrateur extends UserInformation {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idArv",referencedColumnName = "idArv")
	private Archive archive;

	
}
