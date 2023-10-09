package org.anudip.hospitalManagement.dao;

import java.util.List;
import org.anudip.hospitalManagement.bean.Patient;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Repository
@Service
public class PatientDaoImpl implements PatientDao {
	@Autowired
	private PatientRepository repository;

	@Override
	public void save(Patient patient) {
		repository.save(patient); 

	}

	@Override
	public List<Patient> displayAllPatients() {
		return repository.findAll(); 
	}

	@Override
	public Patient findSinglePatient(Integer id) {
		return repository.findById(id).get(); 
	}

	@Override
	public Integer generatePatientId() {
		Integer id=repository.getCountId();
		
			
		id++;
		return id;
	}

}
