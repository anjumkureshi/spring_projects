package com.ir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ir.dto.UserRequest;
import com.ir.entity.Sample;
import com.ir.entity.UserDetails;
import com.ir.repo.JPARepo;
import com.ir.repo.SampleInterface;

@Service
public class UserService 
{
	@Autowired
	JPARepo repository;
	
	/*@Autowired
	SampleInterface sample;
	public void saveSample()
	{
		Sample s=new Sample();
		s.setName("siva");
		s.setSid(102);
		sample.save(s);
	}*/
	
	/*public String createuser(UserRequest request) {
		System.out.println(request);
		UserDetails userdetails=new UserDetails();
		userdetails.setFullname(request.getFullname());
		userdetails.setAddress(request.getAddress());
		userdetails.setDob(request.getDob());
		userdetails.setEmail(request.getEmail());
		userdetails.setGender(request.getGender());
		userdetails.setMobile(request.getMobile());;
		userdetails.setUsername(request.getUsername());
		userdetails.setPassword(request.getPassword());;
		

					
		    repository.save(userdetails);
		    
		   String message=null;

			message = "User Registered Successfully...";
		
		return message;

	}

/*	public String loginuser(String username, String password) {
		
		repository.findByUsernameAndPassword(username,password);
		List<UserDetails> user=	repository.findByUsernameAndPassword(username,password);

		String message=null;
		if(user.size()==0) {
			message="Invalid User Credentials";
		}
		
		return message;

	}*/
	
}
