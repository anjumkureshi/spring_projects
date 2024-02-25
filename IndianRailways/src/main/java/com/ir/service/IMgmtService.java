package com.ir.service;

import java.util.List;

import com.ir.entity.QueriesTable;
import com.ir.entity.StationsDetails;
import com.ir.entity.TrainsDetails;

public interface IMgmtService {

  public List<String> fetchListOfStations();
  public List<String> fetchListOfTrainNames();
  public List<QueriesTable> fetchListofQueries(); 
  public List<StationsDetails> fetchAllStationDetails();
  public List<TrainsDetails> fetchAllTrainDetails();
  
}
