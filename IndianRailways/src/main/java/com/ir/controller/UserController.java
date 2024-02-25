package com.ir.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ir.binders.LocalDateBinder;
import com.ir.entity.QueriesTable;
import com.ir.entity.TrainsDetails;
import com.ir.entity.UserDetails;
import com.ir.model.SearchTrains;
import com.ir.repo.IStationRepo;
import com.ir.repo.IUserQueryRepo;
import com.ir.repo.JPARepo;
import com.ir.service.IUserService;

@Controller
@RequestMapping("/railways")
public class UserController {

	
	
	@Autowired
	JPARepo repo;
	
	@Autowired
	IStationRepo srepo;
	
	@Autowired
	private IUserService iUserService;
	
	@Autowired
	private IUserQueryRepo iuserQuery;
	
	@Autowired
	private HttpSession session;
	
	@GetMapping("/home")
	public String displayHomePage(@ModelAttribute("login_Mattribute") UserDetails uDetails)
	{
		return "home";
	}
	@GetMapping("/register")
	public String userRegister(@ModelAttribute("register_Mattribute") UserDetails uDetails)
	{
		
		return "register";
	 }
	@GetMapping("/findtrains")
	public String findTrains(@ModelAttribute("search_trains_attribute") SearchTrains trains) {
		return"list_of_trains";
	}
	@GetMapping("/writequeries")
	public String writeQueries(@ModelAttribute("query_attribute") QueriesTable query,@RequestParam("email") String email ,Map<String,Object> map) {
		map.put("email",email);
		return"write_queries";
	}
	@GetMapping("/write_queries_card")
	public String writeQueriesmethod() {
		return"write_queries";
	}

	
	@PostMapping("/userregister")
	public String Userregister(@ModelAttribute("register_Mattribute") UserDetails uDetails,RedirectAttributes attri) {
		repo.save(uDetails);
		attri.addFlashAttribute("registermsg","you have register successfully");
		return "redirect:register";
	}
	
	
	/*@GetMapping("/login")
	public String upadateuserGetRequest(RedirectAttributes uAttri,@ModelAttribute("modify") UserDetails modify) {
		uAttri.addFlashAttribute("msg", "user updated successfully");
		return "sample";
	}*/
		@PostMapping("/update_user")
	public String updateUser(RedirectAttributes uAttri,@ModelAttribute("modify") UserDetails modify) {
		uAttri.addFlashAttribute("updatemsg","User Details Updated Successfully login again...");
	   Optional<UserDetails> user=repo.findById(modify.getEmail());
	   
		if(user.isPresent()) {
		  UserDetails userDetails = user.get();	
		  userDetails.setDob(modify.getDob());
		  userDetails.setFullname(modify.getFullname());
		  userDetails.setAddress(modify.getAddress());
		  userDetails.setGender(modify.getGender());
		  userDetails.setMobile(modify.getMobile());
		  userDetails.setEmail(modify.getEmail());
		//  BeanUtils.copyProperties(modify,userDetails);
		
		repo.save(userDetails);
		return"redirect:home";

		}
		else
		{
			throw new IllegalArgumentException("user not found");
			
		}
		
	}

	
	@PostMapping("/login")
	public String userlogin(@ModelAttribute("login_Mattribute") UserDetails uDetails,RedirectAttributes attri,Map<String,Object> map,@ModelAttribute("modify") UserDetails modify,@ModelAttribute("search_trains_attribute") SearchTrains stations) {
	attri.addFlashAttribute("loginmsg","InValid credientials");
	Optional<UserDetails>userDetails=repo.findByUsernameAndPassword(uDetails.getUsername(), uDetails.getPassword());
	if(userDetails.isPresent()) {
		UserDetails userDetails2 = userDetails.get();
		
		map.put("user_details",userDetails2);
		BeanUtils.copyProperties(userDetails2, modify);
		session.setAttribute("user_details", userDetails2);
		return "sample";
	}
	else {
	return"redirect:home";
	}
}	

	@PostMapping("/findtrains")
	public String findtrains(@ModelAttribute("search_trains_attribute") SearchTrains stations,RedirectAttributes attri,Map<String,Object> map)
	{
		     
		List<TrainsDetails> trainNames = iUserService.fetchTrainNameStationNames(stations.getFromStation(), stations.getToStation());
	
		if(!(trainNames.isEmpty()))
		{
			map.put("train_details", trainNames);
			return "list_of_trains";
		}
		else
		{
			attri.addFlashAttribute("search_train_msg", "Record not found");
			return "redirect:findtrains";
			
		}	
	}
	@PostMapping("/submitquery")
	public String SubmitQuery(@ModelAttribute("query_attribute") QueriesTable Qtable ,RedirectAttributes query_attri) {
		System.out.println(Qtable);
			iuserQuery.save(Qtable);
			query_attri.addFlashAttribute("query_submission_Msg","Query Submitted Successfully....");
			return "userhomePage";
		
	}
	@GetMapping("/submitquery")
	public String submitqueryGet(@ModelAttribute("query_attribute") QueriesTable Qtable) {
		return"submitquery";
	}
	 
	@GetMapping("/view_profile")
	public String viewprofile() {
		return "view_profile";
	}
	@GetMapping("/booktickets")
	public String booking() {
		return "bookTickets";
	}
	@InitBinder
	public void mydatebinder(WebDataBinder binder) {
		binder.registerCustomEditor(LocalDate.class, new LocalDateBinder());
	}
	
	

}
