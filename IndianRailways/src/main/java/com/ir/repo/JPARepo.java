package com.ir.repo;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ir.entity.TrainsDetails;
import com.ir.entity.UserDetails;

public interface JPARepo extends JpaRepository<UserDetails, String>
{

	public Optional<UserDetails> findByUsernameAndPassword(String username, String password);





}
