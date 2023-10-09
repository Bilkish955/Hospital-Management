package org.anudip.hospitalManagement.controller;

import java.util.List;
import org.anudip.hospitalManagement.bean.Doctor;
import org.anudip.hospitalManagement.dao.DoctorDao;
import org.anudip.hospitalManagement.dao.DoctorRepository;
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
public class DoctorController {
	@Autowired
	private DoctorDao doctorDao;
	@Autowired
	private DoctorRepository doctorRepository;
	
	@GetMapping("/doctor-index")
	public ModelAndView showIndexPage() {
		return new ModelAndView("doctorIndex");
	}

	@GetMapping("/doctor-addition")
	public ModelAndView showDoctorEntryForm() {
		ModelAndView mv = new ModelAndView("doctorAdditionPage");
		String newDoctorId=doctorDao.generateDoctorId();
		Doctor doctor = new Doctor(newDoctorId);
		mv.addObject("doctorRecord",doctor);
		return mv;
	}
	
	@PostMapping("/doctor-save")
	public ModelAndView saveDoctorRecord(@ModelAttribute("doctorRecord")Doctor doctor) {
		doctorDao.save(doctor);
		return new ModelAndView("redirect:/");
	}
	
	@GetMapping("/doctor-all")
	public ModelAndView showAllDoctorsPage() {
		ModelAndView mv = new ModelAndView("allDoctorsDisplayPage");
		List<Doctor> doctorList=doctorDao.displayAllDoctors();
		mv.addObject("doctorRecords",doctorList);
		return mv;
	}
	@GetMapping("/doctor-find")
	public ModelAndView showDoctorFindPage() {
		ModelAndView mv = new ModelAndView("doctorFindPage");
		return mv;
	}
	@PostMapping("/doctor-find")
	public ModelAndView showDoctorDisplayUpdatePage(@RequestParam("id") String id,@RequestParam(required=false,value="Find") String str, @RequestParam(required=false,value="Update") String stk ) {
		String filename="";
		if(str==null)
			filename="doctorUpdatePage";
		else
			filename="singleDoctorDisplayPage";
		Doctor doctor = doctorDao.findSingleDoctor(id);
		ModelAndView mv = new ModelAndView(filename);
		mv.addObject("doctorRecord",doctor);
		return mv;
	}

	

}
