package com.ir.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ir.entity.TrainsDetails;

public interface ITrainsRepo extends JpaRepository<TrainsDetails, Integer> 
{
 @Query("from TrainsDetails where trainname in(:names)")
 public List<TrainsDetails> fetchTrainDetails(@Param("names")List<String> names);

}
