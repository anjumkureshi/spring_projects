package com.ir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ir.entity.QueriesTable;
import com.ir.entity.StationsDetails;
import com.ir.entity.TrainsDetails;
import com.ir.repo.IStationRepo;
import com.ir.repo.ITrainMgmtRepo;
import com.ir.repo.IUserQueryRepo;
import com.ir.repo.ManagementRepo;

@Service
public class ManagementService  implements IMgmtService
{

	@Autowired
	ManagementRepo MRepo;
	
	@Autowired
	IStationRepo SRepo;
	
	@Autowired
	ITrainMgmtRepo TMgRepo;
	
	@Autowired
	IUserQueryRepo queryRepo;

	
	//public String createuser(ManagementRequest request) {
		//System.out.println(request);
		/*ManagementDetails mdetails=new ManagementDetails();
		mdetails.setFullname(request.getFullname());
		mdetails.setAddress(request.getAddress());
		mdetails.setDob(request.getDob());
		mdetails.setEmail(request.getEmail());
		mdetails.setGender(request.getGender());
		mdetails.setDivision(request.getDivision());
		mdetails.setMobile(request.getMobile());;
		mdetails.setUsername(request.getUsername());
		mdetails.setPassword(request.getPassword());;
		
		
		MRepo.save(mdetails);
	 
		String message=null;
		
		message = "User Registered Successfully...";
		
		return message;

	public String loginUser(String email, String password) {

		List<UserInformation> users = repository.findByEmailAndPassword(email, password);
		String message = null;
		if (users.size() == 0) {

			message = "Invalid User Credentials ";
		} else {
			message = "Welcome to HomePage, Please find your profile Details";

		}
		return message;
	}

	*/
	
		/*public List<StationsDetails> stationNames (String stationName) {
			List<StationsDetails> stationNames1=SRepo.findByStationname(stationName);
			return stationNames1;
		}*/
	
	@Override
	public List<String> fetchListOfStations() {
	   List<String> listOfStations = SRepo.fetchStationNames();
		return listOfStations;
	}

	@Override
	public List<String> fetchListOfTrainNames() {
		List<String> listOfTrainNames=TMgRepo.fetchListOfTrainNames();
		return listOfTrainNames;
	}

	@Override
	public List<QueriesTable> fetchListofQueries() 
	{
	List<QueriesTable>queries=queryRepo.findAll();

		return queries;
	}
	@Override
	public List<StationsDetails> fetchAllStationDetails() {
		// TODO Auto-generated method stub
		List<StationsDetails> station_details=SRepo.findAll();
		return station_details;
	}

	@Override
	public List<TrainsDetails> fetchAllTrainDetails() {
		return null;
	}

	 

	
}
