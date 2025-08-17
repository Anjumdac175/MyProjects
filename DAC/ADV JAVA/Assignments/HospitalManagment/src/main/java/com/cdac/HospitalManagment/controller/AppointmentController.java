package com.cdac.HospitalManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.HospitalManagment.entity.Appointment;
import com.cdac.HospitalManagment.service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired
	AppointmentService appService;
	
	@PostMapping("/add-appoint/{doctorId}")
	public Appointment addAppByDoctorId(@PathVariable Long doctorId,@RequestBody Appointment app) {
		return appService.addAppointmentByDoctorId(doctorId, app);
	}
	
	@GetMapping("/get-appoint/{doctorId}")
	public List<Appointment> AllAppointmentsOfDoctor(@PathVariable Long doctorId){
		return appService.findByDoctorId(doctorId);
	}
	
	@PutMapping("/update-appoint/{appId}")
	public Appointment updateAppointment(@PathVariable Long appId, @RequestBody Appointment appoint) {
		return appService.updateAppointmentById(appId, appoint);
	}
}
