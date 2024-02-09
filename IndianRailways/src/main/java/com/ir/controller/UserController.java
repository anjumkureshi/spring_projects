package com.ir.controller;

import java.time.LocalDate;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ir.binders.LocalDateBinder;
import com.ir.dto.UserRequest;
import com.ir.entity.ManagementDetails;
import com.ir.entity.StationsDetails;
import com.ir.entity.TrainsDetails;
import com.ir.entity.UserDetails;
import com.ir.repo.IStationRepo;
import com.ir.repo.JPARepo;
import com.ir.repo.SampleInterface;
import com.ir.service.UserService;

@Controller
@RequestMapping("/railways")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	JPARepo repo;
	
	@Autowired
	IStationRepo srepo;
	
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
	@GetMapping("/searchtrains")
	public String findTrains(@ModelAttribute("search_trains_attribute") StationsDetails stationdetails) {
		return"search_trains";
	}
	
	@PostMapping("/userregister")
	public String Userregister(@ModelAttribute("register_Mattribute") UserDetails uDetails,RedirectAttributes attri) {
		repo.save(uDetails);
		attri.addFlashAttribute("registermsg","you have register successfully");
		return "redirect:register";
	}
	
	@PostMapping("/login")
	public String userlogin(@ModelAttribute("login_Mattribute") UserDetails uDetails,RedirectAttributes attri) {
	attri.addFlashAttribute("loginmsg","InValid credientials");
	Optional<UserDetails>userDetails=repo.findByUsernameAndPassword(uDetails.getUsername(), uDetails.getPassword());
	if(userDetails.isPresent()) {
		return "sample";
	}
	else {
	return"redirect:home";
	}
}	
/*@PostMapping("/findtrains")
public String findtrains(@ModelAttribute("search_trains_attribute") StationsDetails statDetails,RedirectAttributes attri) {
attri.addFlashAttribute("search_train_msg","Record not found");
//	Optional<String>trainNames=srepo.findByStationName(statDetails.getStationName());4

if(trainNames.isPresent()) {
	return "list_of_trains";
}
else {
return "redirect:searchtrains";
}

}*/
	 
	@InitBinder
	public void mydatebinder(WebDataBinder binder) {
		binder.registerCustomEditor(LocalDate.class, new LocalDateBinder());
	}


}
