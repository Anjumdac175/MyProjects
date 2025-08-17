package com.cdac.HospitalManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.HospitalManagment.entity.Doctor;
import com.cdac.HospitalManagment.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	DoctorService doctorService;
	
	@PostMapping("/add-doctor")
	public Doctor addNewDoctor(@RequestBody Doctor doctor) {
		return doctorService.addNewDoctor(doctor);
	}
	
	@GetMapping("/view-doctors")
	public List<Doctor> getAllDoctors(){
		return doctorService.viewAllDoctors();
	}
}
