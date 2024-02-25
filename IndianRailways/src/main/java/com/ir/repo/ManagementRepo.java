package com.ir.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ir.entity.ManagementDetails;
@Repository
public interface ManagementRepo extends JpaRepository<ManagementDetails,String >
{

	public Optional<ManagementDetails> findByUsernameAndPassword(String username,String password);
	
	

}
