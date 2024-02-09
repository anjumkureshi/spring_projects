package com.ir.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ir.binders.LocalDateBinder;
import com.ir.entity.ManagementDetails;
import com.ir.entity.StationsDetails;
import com.ir.entity.TrainsDetails;
import com.ir.model.TrainsInfo;
import com.ir.repo.IStationRepo;
import com.ir.repo.ITrainsRepo;
import com.ir.repo.ManagementRepo;
import com.ir.service.IMgmtService;

@RequestMapping("/management")
@Controller
public class ManagementController {
	
	
    @Autowired
	private IMgmtService mgSerivce;

	@Autowired
	ManagementRepo mrepo;
	
	@Autowired
	IStationRepo srepo;

	@Autowired
	ITrainsRepo trepo;
	
	
	
	@GetMapping("/home")
	public String showManagementHomePage(@ModelAttribute("login") ManagementDetails details)
	{
		
		return "management_home";
	}
	@GetMapping("/signup")
	public String showManagement(@ModelAttribute("register") ManagementDetails md) {
		return"management_register";
	}
	/*@RequestMapping(value="/managementregister",method=RequestMethod.POST)
	public String userregister(Model model,HttpServletRequest request) {
		String name=request.getParameter("fullname");
		String address=request.getParameter("address");
		String  gender=request.getParameter("gender");
		String dob=request.getParameter("dob");
		String division=request.getParameter("division");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
        /*SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		try {
			dobDate = (Date) dateFormat.parse(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	/*
		ManagementRequest manginfo=new ManagementRequest(name,address,username,division,dob,password,email,mobile,gender);
		System.out.println(manginfo);
		
		String regmessge= managementService.createuser(manginfo);
		model.addAttribute("message",regmessge);
		return "page1";
		@PostMapping("/emp_register")
	public String createuser(@ModelAttribute("emp") Employee emp) {
		repo.save(emp);
		return "successfulRegister";
		
	}
		
	}*/
	@PostMapping("/managementregister")
	public String createuser(@ModelAttribute("register") ManagementDetails md) {
	mrepo.save(md);
	return"page1";
	
	}

	
	@InitBinder
	public void mydatebinder(WebDataBinder binder) {
		binder.registerCustomEditor(LocalDate.class, new LocalDateBinder());
	}
	
	@PostMapping("/managementlogin")
	public String login(@ModelAttribute("login") ManagementDetails md,RedirectAttributes attri) {
		//mrepo.findByUsernameAndPassword("","");
		System.out.println(md);
		/*	Optional<ManagementDetails> opt= mrepo.findByUsernameAndPassword(md);
			if(opt.isPresent()) {
			return "Adminpage";
			}*/
		attri.addFlashAttribute("invalidmessage","Invalid credientials");
		Optional<ManagementDetails> mddetails = mrepo.findByUsernameAndPassword(md.getUsername(),md.getPassword());
		if(mddetails.isPresent())
		{
			return "admin_home";
		}
		else {
		return "redirect:home";
		}
	}
	
	@PostMapping("/add_stations")
	public String addstations(@ModelAttribute("addstations") StationsDetails stdDetails,RedirectAttributes attri) {
		attri.addFlashAttribute("msg","Station Details added successfully" );
		srepo.save(stdDetails);
		return"redirect:addstations";
	}
	@PostMapping("/addtrains")
	public String addtrains(@ModelAttribute("add_new_trains")TrainsDetails tDetails ,RedirectAttributes attribute) {
		attribute.addFlashAttribute("msg", "Trains Details Added successfully");
		//Optional<StationsDetails> statDetails=srepo.findByStationname();
		trepo.save(tDetails);
		return"redirect:addtrains";

	}
	@GetMapping("/addtrains")
	public String showAddtrainspage(@ModelAttribute("add_new_trains") TrainsDetails tDetails)
	{
		
		return "addtrains";
	}
	@GetMapping("/addstations")
	public String showAddStations(@ModelAttribute("addstations") StationsDetails sDetails)
	{
		
		return "addstations";
	}
	@GetMapping("/helpdesk")
	public String showHelpDeskPage()
	{
		
		return "helpdesk";
	}
	@GetMapping("/emergency")
	public String showEmergency()
	{
		
		return "emergency";
	}

	@GetMapping("/view_passenger_queries")
	public String showaddtrainspage()
	{
		
		return "view_passenger_queries";
	}
	
	@GetMapping("/logout")
	public String showlogout() {
		return"management_home";
	}
	/*//@RequestMapping(value="/managementregister",method=RequestMethod.POST)
	public List<StationsDetails> statNames(@ModelAttribute("addstations") StationsDetails sDetails) {
	List<StationsDetails> regmessage= managementService.stationNames(sDetails.getStationName());
	return regmessage;
	
	}
	*/
	@ModelAttribute("stations_names")
	public List<String> showListOfStations()
	{
		List<String> stations = mgSerivce.fetchListOfStations();
		return stations;	
		
	}
	@ModelAttribute("train_names")
	public List<String>showListOfTrains()
	{
		List<String>trainNames=mgSerivce.fetchListOfTrainNames();
		return trainNames;
	}
	

	
}
