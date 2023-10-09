package org.anudip.hospitalManagement.controller;

import java.util.List;
import org.anudip.hospitalManagement.bean.Patient;
import org.anudip.hospitalManagement.dao.PatientDao;
import org.anudip.hospitalManagement.dao.PatientRepository;
import org.anudip.hospitalManagement.exception.PayStatusException;
import org.anudip.hospitalManagement.exception.NoSuchElementException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
@RestController
public class PatientController {
	@Autowired
	private PatientDao patientDao;
	@Autowired
	private PatientRepository patientRepository;
	
    
    @GetMapping("/")
    public ModelAndView showIndex() {
		return new ModelAndView("index");
    }
    
    @GetMapping("/patient-index")
	public ModelAndView showIndexPage() {
		return new ModelAndView("patientIndex");
	}
    
    @GetMapping("/patient-addition")
    public ModelAndView showPatientEntryForm() {
        ModelAndView mv = new ModelAndView("patientAdditionPage");
        Integer newPatientId = patientDao.generatePatientId();
        Patient patient = new Patient(newPatientId);
        mv.addObject("patientRecord", patient);
        return mv;
    }
    @PostMapping("/patient-save")
	public ModelAndView savePatientRecord(@ModelAttribute("patientRecord")Patient patient) {
		patientDao.save(patient);
		return new ModelAndView("redirect:/");
	}
	
	@GetMapping("/patient-all")
	public ModelAndView showAllPatientsPage() {
		ModelAndView mv = new ModelAndView("patientDisplayPage");
		List<Patient> patientList=patientDao.displayAllPatients();
		mv.addObject("patientRecords",patientList);
		return mv;
	}
	@GetMapping("/patient-find")
	public ModelAndView showPatientFindPage() {
		ModelAndView mv = new ModelAndView("patientFindPage");
		return mv;
	}
	@PostMapping("/patient-find")
	public ModelAndView showPatienttDisplayUpdatePage(@RequestParam("id") Integer id,@RequestParam(required=false,value="Find") String str, @RequestParam(required=false,value="Update") String stk ) {
		String filename="";
		if(str==null)
			filename="patientUpdatePage";
		else
			filename="singlePatientDisplayPage";
		Patient patient = patientDao.findSinglePatient(id);
		ModelAndView mv = new ModelAndView(filename);
		mv.addObject("patientRecord",patient);
		return mv;
	}
	@ExceptionHandler(value = PayStatusException.class)
	   public ModelAndView showPayStatusErrorPage() {
		ModelAndView mv = new ModelAndView("payStatusErrorPage");
		String message="Fees has already been paid";
		mv.addObject("errorMessage",message);
		return mv;
	   }
	@ExceptionHandler(value = NoSuchElementException.class)
	   public ModelAndView showPatientErrorPage() {
		ModelAndView mv = new ModelAndView("patientErrorPage");
		String message="Patient is not found";
		mv.addObject("errorMessage",message);
		return mv;
	   }




}
