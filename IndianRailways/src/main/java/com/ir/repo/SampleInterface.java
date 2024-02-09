package com.ir.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ir.entity.Sample;

public interface SampleInterface extends JpaRepository<Sample, Integer> {

}
