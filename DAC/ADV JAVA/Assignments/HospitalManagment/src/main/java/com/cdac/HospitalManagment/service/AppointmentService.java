package com.cdac.HospitalManagment.service;

import java.util.List;

import com.cdac.HospitalManagment.entity.Appointment;

public interface AppointmentService {
	public Appointment addAppointmentByDoctorId(Long doctorId,Appointment appoint);
	public List<Appointment> findByDoctorId(Long doctorId);
	public Appointment updateAppointmentById(Long appId,Appointment appoint);
}
