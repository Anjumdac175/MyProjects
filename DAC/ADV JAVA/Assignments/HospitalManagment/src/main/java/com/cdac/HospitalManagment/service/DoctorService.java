package com.cdac.HospitalManagment.service;

import java.util.List;

import com.cdac.HospitalManagment.entity.Doctor;

public interface DoctorService {
	public Doctor addNewDoctor(Doctor doctor);
	public List<Doctor> viewAllDoctors();
}
