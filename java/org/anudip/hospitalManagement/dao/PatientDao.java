package org.anudip.hospitalManagement.dao;

import org.anudip.hospitalManagement.bean.Patient;
import java.util.List;
public interface PatientDao {
	public void save(Patient patient);
	public List<Patient> displayAllPatients();
	public Patient findSinglePatient(Integer id);
	public Integer generatePatientId();

}

