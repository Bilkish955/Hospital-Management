package org.anudip.hospitalManagement.dao;

import org.springframework.stereotype.Repository;
import org.anudip.hospitalManagement.bean.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
	@Query("select count(patientId) from Patient")
	 public Integer getCountId();

}

