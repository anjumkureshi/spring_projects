package com.ir.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ir.entity.TrainsDetails;

public interface ITrainsRepo extends JpaRepository<TrainsDetails, Long> 
{

}
