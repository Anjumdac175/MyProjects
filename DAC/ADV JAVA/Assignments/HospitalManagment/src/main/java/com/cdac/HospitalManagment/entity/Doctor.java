package com.cdac.HospitalManagment.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long doctorId;

	private String doctorName;
	private String specialization;
	private int experience;

	@OneToMany(mappedBy= "doctor", cascade=CascadeType.ALL)
	List<Appointment> appointments = new ArrayList<>();
	public Doctor() {
		super();
	}


	public Doctor(Long doctorId, String doctorName, String specialization, int experience) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.experience = experience;
	}
	
	
	public Long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
}
