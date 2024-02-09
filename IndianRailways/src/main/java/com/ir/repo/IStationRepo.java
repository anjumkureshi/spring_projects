package com.ir.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ir.entity.StationsDetails;

public interface IStationRepo  extends JpaRepository<StationsDetails, Long>
{

	//public List<StationsDetails> findByStationname(String stationName);
	@Query("select stationName from StationsDetails")
	public List<String> fetchStationNames();
	

}
