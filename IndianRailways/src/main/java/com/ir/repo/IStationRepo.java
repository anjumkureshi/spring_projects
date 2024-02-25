package com.ir.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ir.entity.StationsDetails;

public interface IStationRepo  extends JpaRepository<StationsDetails, Long>
{

	//public List<StationsDetails> findByStationname(String stationName);
	@Query("select stationName from StationsDetails")
	public List<String> fetchStationNames();
	@Query("select stdId from StationsDetails where stationName in(:fromSta,:endSta)")
   public List<Long> fetchStattionIds(@Param("fromSta") String fromSta,@Param("endSta")String endSta);
	
	@Query(value="select Train_Passing_by_Stations from train_passing_bystation where std_id in (:ids) ",nativeQuery=true)
	public List<String> getTrainNames(@Param("ids") List<Long> ids);
	
	@Query("from StationsDetails where stdId=:id")
	public StationsDetails getStationDetails(@Param("id")Long id);
	
	}
