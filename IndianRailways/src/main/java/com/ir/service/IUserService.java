package com.ir.service;

import java.util.List;

import com.ir.entity.TrainsDetails;
import com.ir.entity.UserDetails;

public interface IUserService {

	public List<TrainsDetails> fetchTrainNameStationNames(String fromSta,String EndSta);
	
	
}
