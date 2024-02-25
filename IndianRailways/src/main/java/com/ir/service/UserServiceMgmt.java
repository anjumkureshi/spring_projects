package com.ir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ir.entity.QueriesTable;
import com.ir.entity.TrainsDetails;
import com.ir.repo.IStationRepo;
import com.ir.repo.ITrainsRepo;
import com.ir.repo.IUserQueryRepo;

@Service("IuserService")
public class UserServiceMgmt implements IUserService{
	
	@Autowired
	 private IStationRepo repo;
	@Autowired
	private ITrainsRepo trepo;
	
	@Override
	public List<TrainsDetails> fetchTrainNameStationNames(String fromSta, String EndSta) {
		List<Long>listofStationIds=repo.fetchStattionIds(fromSta, EndSta);
		System.out.println(listofStationIds);
		List<String> trainNames = repo.getTrainNames(listofStationIds);
		System.out.println(trainNames);
		List<TrainsDetails> listOfTrains = trepo.fetchTrainDetails(trainNames);
		System.out.println(listOfTrains);
		return listOfTrains;
	}
	

	
}
