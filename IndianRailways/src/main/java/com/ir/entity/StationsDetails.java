package com.ir.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ListIndexBase;

@Entity
@Table(name="station_details_infromation")
public class StationsDetails
{
	@Id
	@SequenceGenerator(name="seq",sequenceName = "seq1",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "seq", strategy = GenerationType.SEQUENCE)
	private Long stdId;
	@Column(name="Station_Name",unique=true,nullable=false)
	private String stationName;
	@Column(name="State_Name")
	private String stateName;
	@Column(name="Station_Code",unique = true, nullable=false)
	private Long stdCode;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name = "train_passing_bystation",joinColumns = @JoinColumn(name="std_id",referencedColumnName = "stdId"))
	@OrderColumn(name="station_index")
	@ListIndexBase(value= 1)
	@Column(length=50 ,name="Train_Passing_by_Stations")	
	private List<String> passByStations;
	
	
	public Long getStdId() {
		return stdId;
	}
	public void setStdId(Long stdId) {
		this.stdId = stdId;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Long getStdCode() {
		return stdCode;
	}
	public void setStdCode(Long stdCode) {
		this.stdCode = stdCode;
	}
	public List<String> getPassByStations() {
		return passByStations;
	}
	public void setPassByStations(List<String> passByStations) {
		this.passByStations = passByStations;
	}
	
	
}
