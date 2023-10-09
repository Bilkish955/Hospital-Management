package org.anudip.hospitalManagement.dao;

import org.anudip.hospitalManagement.bean.Doctor;
import java.util.List;
public interface DoctorDao {
	public void save(Doctor doctor);
	public List<Doctor> displayAllDoctors();
	public Doctor findSingleDoctor(String id);
	public String generateDoctorId();
	//public void update(Doctor doctor);

}

