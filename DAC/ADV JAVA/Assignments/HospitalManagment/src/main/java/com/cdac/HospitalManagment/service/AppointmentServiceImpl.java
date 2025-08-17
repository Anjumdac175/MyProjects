package com.cdac.HospitalManagment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.HospitalManagment.entity.Appointment;
import com.cdac.HospitalManagment.entity.Doctor;
import com.cdac.HospitalManagment.repository.AppointmentRepo;
import com.cdac.HospitalManagment.repository.DoctorRepo;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	DoctorRepo docRepo;

	@Autowired
	AppointmentRepo appRepo;
	
	@Override
	public Appointment addAppointmentByDoctorId(Long doctorId, Appointment appoint) {
		Doctor add = docRepo.findById(doctorId).orElseThrow();
		appoint.setDoctor(add);
		return appRepo.save(appoint);
	}

	@Override
	public List<Appointment> findByDoctorId(Long doctorId) {
		return appRepo.findByDoctorDoctorId(doctorId);
	}

	@Override
	public Appointment updateAppointmentById(Long appId, Appointment appoint) {
		Appointment updated = appRepo.findById(appId).orElseThrow();
		updated.setAppDate(appoint.getAppDate());
		updated.setPatientName(appoint.getPatientName());
		return appRepo.save(updated);
	}

}
