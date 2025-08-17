package com.cdac.HospitalManagment.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long appId;
	private String patientName;
	private LocalDate appDate;
	
	@ManyToOne
	@JoinColumn(name="doctor_id")
	private Doctor doctor;

	public Appointment() {
		super();
	}


	public Appointment(Long appId, String patientName, LocalDate appDate, Doctor doctor) {
		super();
		this.appId = appId;
		this.patientName = patientName;
		this.appDate = appDate;
		this.doctor = doctor;
	}



	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public LocalDate getAppDate() {
		return appDate;
	}

	public void setAppDate(LocalDate appDate) {
		this.appDate = appDate;
	}

	public Doctor getDoctor() {
		return doctor;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
}
