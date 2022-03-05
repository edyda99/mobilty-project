package com.ULFGII.Mobility.Entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class AdmitedStudent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@ManyToOne(fetch = FetchType.EAGER , optional =false)
	@JoinColumn(name = "student_id", nullable = false)
	private Student student;
	
	@ManyToOne(fetch = FetchType.EAGER , optional =false)
	@JoinColumn(name = "university_id", nullable = false)
	private University university;
	
	@ManyToOne(fetch = FetchType.EAGER , optional =false)
	@JoinColumn(name = "scholarship_id", nullable = false)
	private Scholarship scholarship;
	
	
	
	
}
