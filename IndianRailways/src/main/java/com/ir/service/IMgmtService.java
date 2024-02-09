package com.ir.service;

import java.util.List;

import com.ir.entity.TrainsDetails;

public interface IMgmtService {

  public List<String> fetchListOfStations();
  public List<String> fetchListOfTrainNames();
  
}
