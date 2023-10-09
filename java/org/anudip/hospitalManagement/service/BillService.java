package org.anudip.hospitalManagement.service;
import org.springframework.stereotype.Service;
import org.anudip.hospitalManagement.bean.Patient;
@Service
public class BillService {
	public Patient generateBill(Patient patient) {
		double bedRent = calculateBedRent(patient);
        double doctorFees = calculateDoctorFees(patient);
        double totalMedicalExp = calculateTotalMedicalExp(patient);
        double totalExpenses = bedRent + doctorFees + totalMedicalExp;
		
        Bill bill = new Bill();
        bill.setPatient(patient);
        bill.setBedRent(bedRent);
        bill.setDoctorFees(doctorFees);
        bill.setTotalMedicalExpenses(totalMedicalExpenses);
        bill.setTotalMedicineExpenses(totalMedicineExpenses);
        bill.setTotalExpenses(totalExpenses);
        bill.setReleaseDate(getCurrentDate());

        

        return bill;
    }
	}



