package com.ir.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ir.entity.TrainsDetails;

public interface ITrainMgmtRepo extends JpaRepository<TrainsDetails, Integer>{
	
	/*	@Query(value="select * from train_details_information where train_starts_from=?1 AND train_ends_at=?2", nativeQuery=true)
		public List<TrainsDetails> fetchListOfTrains(String train_starts_from,String train_end_at);
	*/
	@Query("select trainname from TrainsDetails")
	public List<String> fetchListOfTrainNames();
}
