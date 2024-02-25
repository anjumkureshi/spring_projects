package com.ir.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ir.binders.LocalDateBinder;
import com.ir.entity.ManagementDetails;
import com.ir.entity.QueriesTable;
import com.ir.entity.QueryResponseTable;
import com.ir.entity.StationsDetails;
import com.ir.entity.TicketPrice;
import com.ir.entity.TrainsDetails;
import com.ir.model.TicketPriceModel;
import com.ir.repo.BookRepo;
import com.ir.repo.IStationRepo;
import com.ir.repo.ITrainsRepo;
import com.ir.repo.ManagementRepo;
import com.ir.repo.TicketPriceRepo;
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
	
	@Autowired
	BookRepo brepo;
	
	@Autowired
	TicketPriceRepo tPRepo;

	@GetMapping("/home")
	public String showManagementHomePage(@ModelAttribute("login") ManagementDetails details) {

		return "management_home";
	}

	@GetMapping("/signup")
	public String showManagement(@ModelAttribute("register") ManagementDetails md) {
		return "management_register";
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
		return "page1";

	}

	@InitBinder
	public void mydatebinder(WebDataBinder binder) {
		binder.registerCustomEditor(LocalDate.class, new LocalDateBinder());
	}

	@PostMapping("/managementlogin")
	public String login(@ModelAttribute("login") ManagementDetails md, RedirectAttributes attri) {
		// mrepo.findByUsernameAndPassword("","");
		System.out.println(md);
		/*	Optional<ManagementDetails> opt= mrepo.findByUsernameAndPassword(md);
			if(opt.isPresent()) {
			return "Adminpage";
			}*/
		attri.addFlashAttribute("invalidmessage", "Invalid credientials");
		Optional<ManagementDetails> mddetails = mrepo.findByUsernameAndPassword(md.getUsername(), md.getPassword());
		if (mddetails.isPresent()) {
			return "admin_home";
		} else {
			return "redirect:home";
		}
	}

	@PostMapping("/addstations")
	public String addstations(@ModelAttribute("addstations") StationsDetails stdDetails, RedirectAttributes attri) {
		attri.addFlashAttribute("msg", "Station Details added successfully");
		srepo.save(stdDetails);
		return "redirect:addstations";
	}

	@PostMapping("/addtrains")
	public String addtrains(@ModelAttribute("add_new_trains") TrainsDetails tDetails, RedirectAttributes attribute) {
		attribute.addFlashAttribute("msg", "Trains Details Added successfully");
		// Optional<StationsDetails> statDetails=srepo.findByStationname();
		trepo.save(tDetails);
		return "redirect:addtrains";

	}

	@GetMapping("/addtrains")
	public String showAddtrainspage(@ModelAttribute("add_new_trains") TrainsDetails tDetails) {

		
		return "addtrains";
	}

	@GetMapping("/edit_trains")
	public String showEditAddtrainspage(@ModelAttribute("add_new_trains") TrainsDetails tDetails) {

		return "edit_trains";
	}

	@GetMapping("/addstations")
	public String showAddStations(@ModelAttribute("addstations") StationsDetails sDetails) {

		return "addstations";
	}
	@GetMapping("/setprices_listofTrains")
	public String showlistofTrainsForPrice(Model model) {
	List <TrainsDetails>allTrain_details=trepo.findAll();
    model.addAttribute("train_details", allTrain_details);

		return "setprices_listofTrains";
	}

	@GetMapping("/editstationsDetails")
	public String showAddStationswithParams(@ModelAttribute("addstations") StationsDetails sDetails,
			@RequestParam("stdId") Long stdId) {

		// StationsDetails stations=srepo.findById(sDetails.getStdId());
		StationsDetails stations = srepo.getStationDetails(stdId);
		BeanUtils.copyProperties(stations, sDetails);
		return "addstations";
	}
	@PostMapping("/editstationsDetails")
	public String updateStation(@ModelAttribute("addstations")StationsDetails updateStaDetails,RedirectAttributes attri)
	{
		attri.addFlashAttribute("msg","Stations Details Updated Successfully...");
	
		 Optional< StationsDetails> uStations=srepo.findById(updateStaDetails.getStdId());
		 System.out.println(uStations);
		   if(uStations.isPresent()) {
			StationsDetails uSDetails=uStations.get();
			uSDetails.setStdCode(updateStaDetails.getStdCode());
			uSDetails.setStationName(updateStaDetails.getStationName());
			uSDetails.setStateName(updateStaDetails.getStateName());
			uSDetails.setPassByStations(updateStaDetails.getPassByStations());
		   try{
			   srepo.save(uSDetails);
		   }catch(Exception e) {
			   e.printStackTrace();
		   }

			   return "redirect:addstations";
		   }
		   return "edit_stations";
		}

	@GetMapping("/edit_stations")
	public String showEditStations(@ModelAttribute("edit_station") StationsDetails sDetails) {

		return "edit_stations";
	}

	@GetMapping("/helpdesk")
	public String showHelpDeskPage() {

		return "helpdesk";
	}

	@GetMapping("/emergency")
	public String showEmergency() {

		return "emergency";
	}

	@GetMapping("/view_queries")
	public String showPassengerQueries(Map<String, Object> map) {
		List<QueriesTable> userQueries = mgSerivce.fetchListofQueries();
		map.put("queries", userQueries);
		return "view_queries";
	}

	@GetMapping("/logout")
	public String showlogout() {
		return "management_home";
	}

	@ModelAttribute("stations_names")
	public List<String> showListOfStations() {
		List<String> stations = mgSerivce.fetchListOfStations();
		return stations;

	}

	@ModelAttribute("train_names")
	public List<String> showListOfTrains() {
		List<String> trainNames = mgSerivce.fetchListOfTrainNames();
		return trainNames;
	}
	

	@ModelAttribute("station_details")
	public List<StationsDetails> showStationDetails() {
		List<StationsDetails> sDetails = mgSerivce.fetchAllStationDetails();
		return sDetails;
	}

	@GetMapping("/solve_query")
	public String solveQueries() {
		return "solveQueriespage";
	}

	@PostMapping("/solvequery")
	public String solveUserQueries(@ModelAttribute("solve_query_attribute") QueryResponseTable solvequery,
			RedirectAttributes solve_attribute) {
		solve_attribute.addFlashAttribute("msg", "Response send to user successfully");
		// Optional<StationsDetails> statDetails=srepo.findByStationname();
		// trepo.save(tDetails);
		return "redirect:addtrains";
	}
	
	@GetMapping("/ticket_prices")
	public String showticketsprices(@ModelAttribute("setPrices") TicketPrice pTrains,@RequestParam("trainId") int trainId) 
	{
		TrainsDetails td= trepo.getOne(trainId);
		pTrains.setTrainNumber(td.getTrainnumber());
		pTrains.setTrainName(td.getTrainname());
		pTrains.setTrain_starting_from(td.getStarting());
		pTrains.setTrain_ending_at(td.getEnding());
		pTrains.setDistance(td.getDistance());
		return "ticket_prices";
	}

	@GetMapping("/ticketprices")
	public String ticketprice(@ModelAttribute("setPrices")TicketPrice setPrices_oftrains) 
	{
		return"ticket_prices";
	}
	
	@PostMapping("/ticket_prices")
	public String setprices(@ModelAttribute("setPrices")TicketPriceModel setPrices_oftrains,RedirectAttributes attri)
	{
		attri.addFlashAttribute("msg","Price set Successfully...");
	

	        TicketPrice ticketPrice = new TicketPrice();
	        ticketPrice.setTrainName(setPrices_oftrains.getTrainName());
	        ticketPrice.setTrainNumber(setPrices_oftrains.getTrainNumber());
	        ticketPrice.setTrain_starting_from(setPrices_oftrains.getTrainStartingFrom());
	        ticketPrice.setTrain_ending_at(setPrices_oftrains.getTrainEndingAt());
	        ticketPrice.setDistance(setPrices_oftrains.getDistance());
	        ticketPrice.setSourceName(setPrices_oftrains.getSourceName());
	        ticketPrice.setDestination(setPrices_oftrains.getDestination());
	        ticketPrice.setCoach(setPrices_oftrains.getSelectedCoach());
	        ticketPrice.setPrice(setPrices_oftrains.getPrice());

	        tPRepo.save(ticketPrice);
			

		   
			return "redirect:ticketprices";

		   }

}
