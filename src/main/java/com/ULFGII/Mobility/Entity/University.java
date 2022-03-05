package com.ULFGII.Mobility.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class University {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	
	@ManyToOne(fetch = FetchType.EAGER , optional =false)
	@JoinColumn(name = "city_id", nullable = false)
	private City city;

	@ManyToMany
	@JoinTable(name = "speciality_master", joinColumns = @JoinColumn(name = "university_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "master_id", referencedColumnName = "id"))
	private List<Master> masters;
}
