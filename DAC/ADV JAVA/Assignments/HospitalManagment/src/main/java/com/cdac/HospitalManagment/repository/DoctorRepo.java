package com.cdac.HospitalManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.HospitalManagment.entity.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Long> {

}
