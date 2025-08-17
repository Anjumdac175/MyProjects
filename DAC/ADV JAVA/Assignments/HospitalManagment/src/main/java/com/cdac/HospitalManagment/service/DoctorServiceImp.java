package com.cdac.HospitalManagment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.HospitalManagment.entity.Doctor;
import com.cdac.HospitalManagment.repository.DoctorRepo;

@Service
public class DoctorServiceImp implements DoctorService {
	
	@Autowired
	DoctorRepo docRepo;
	
	@Override
	public Doctor addNewDoctor(Doctor doctor) {
		return docRepo.save(doctor);
	}

	@Override
	public List<Doctor> viewAllDoctors() {
		return docRepo.findAll();
	}

}
