package org.anudip.hospitalManagement.controller;

import java.util.List;
import org.anudip.hospitalManagement.bean.Ward;
import org.anudip.hospitalManagement.dao.WardDao;
import org.anudip.hospitalManagement.dao.WardRepository;
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
public class WardController {
	@Autowired
	private WardDao wardDao;
	@Autowired
	private WardRepository wardRepository;
	
	@GetMapping("/ward-index")
	public ModelAndView showIndexPage() {
		return new ModelAndView("wardIndex");
	}

	@GetMapping("/ward-addition")
	public ModelAndView showWardEntryForm() {
		ModelAndView mv = new ModelAndView("wardAdditionPage");
		String newWardId=wardDao.generateWardId();
		Ward ward = new Ward(newWardId);
		mv.addObject("wardRecord",ward);
		return mv;
	}
	
	@PostMapping("/ward-save")
	public ModelAndView saveWardRecord(@ModelAttribute("wardRecord")Ward ward) {
		wardDao.save(ward);
		return new ModelAndView("redirect:/");
	}
	
	@GetMapping("/ward-all")
	public ModelAndView showAllWardsPage() {
		ModelAndView mv = new ModelAndView("allWardsDisplayPage");
		List<Ward> wardList=wardDao.displayAllWards();
		mv.addObject("wardRecords",wardList);
		return mv;
	}
	
	@GetMapping("/ward-find")
	public ModelAndView showWardFindPage() {
		ModelAndView mv = new ModelAndView("wardFindPage");
		return mv;
	}
	
	@PostMapping("/ward-find")
	public ModelAndView showWardDisplayUpdatePage(@RequestParam("id") String id,@RequestParam(required=false,value="Find") String str, @RequestParam(required=false,value="Update") String stk ) {
		String filename="";
		if(str==null)
			filename="wardUpdatePage";
		else
			filename="singleWardDisplayPage";
		Ward ward = wardDao.findSingleWard(id);
		ModelAndView mv = new ModelAndView(filename);
		mv.addObject("wardRecord",ward);
		return mv;
	}

}	


	


