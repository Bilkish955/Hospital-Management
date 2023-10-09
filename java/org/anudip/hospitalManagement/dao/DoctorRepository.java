package org.anudip.hospitalManagement.dao;

import org.springframework.stereotype.Repository;
import org.anudip.hospitalManagement.bean.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String> {
	@Query("select count(doctorId) from Doctor")
	 public Integer getCountId();
	

}

