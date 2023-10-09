package org.anudip.hospitalManagement.dao;

import java.util.List;
import org.anudip.hospitalManagement.bean.Doctor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Repository
@Service
public class DoctorDaoImpl implements DoctorDao {
	@Autowired
	private DoctorRepository repository;

	@Override
	public void save(Doctor doctor) {
		repository.save(doctor); 
		

	}

	@Override
	public List<Doctor> displayAllDoctors() {
		return repository.findAll(); 
	}

	@Override
	public Doctor findSingleDoctor(String id) {
		return repository.findById(id).get(); 
		
		
	}

	@Override
	public String generateDoctorId() {
		int n=repository.getCountId();
		String id="";
		if (n==0)
			id="D1001";
		else {
			n++;
			n=1000+n;
			id="D"+n;
			
		System.out.println(id);
		}
		return id;
	}
		
}		


