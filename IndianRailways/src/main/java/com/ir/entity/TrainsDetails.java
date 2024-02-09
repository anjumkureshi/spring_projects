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
@Table(name="train_details_information")
public class TrainsDetails 
{
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "tns_seq",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator="gen1",strategy = GenerationType.SEQUENCE)
	private int trainId;
	@Column(length=50,name="Train_name",unique = true, nullable = false)
	private String trainname;
	@Column(name="Train_Number",unique = true,nullable=false)
	private Long trainnumber;
	@Column(length=50,name="Train_starts_from")
	private String starting;
	@Column(length=50,name="Train_ends_at")
	private String ending;
	
	/*@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name = "station_names_information",joinColumns = @JoinColumn(name="tns_id",referencedColumnName = "trainId"))
	@OrderColumn(name="station_index")
	@ListIndexBase(value= 1)
	@Column(length=50 ,name="Passing_by_Stations")	
	private List<String> passByStations;*/
	@Column(name="Total_Distance")
	private Long distance;
	@Column(name="Train_Fare")
	private Long fare;
	public int getTrainId() {
		return trainId;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	public String getTrainname() {
		return trainname;
	}
	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}
	public Long getTrainnumber() {
		return trainnumber;
	}
	public void setTrainnumber(Long trainnumber) {
		this.trainnumber = trainnumber;
	}
	public String getStarting() {
		return starting;
	}
	public void setStarting(String starting) {
		this.starting = starting;
	}
	public String getEnding() {
		return ending;
	}
	public void setEnding(String ending) {
		this.ending = ending;
	}

	/*public List<String> getPassByStations() {
		return passByStations;
	}
	public void setPassByStations(List<String> passByStations) {
		this.passByStations = passByStations;
	}*/
	public Long getDistance() {
		return distance;
	}
	public void setDistance(Long distance) {
		this.distance = distance;
	}
	public Long getFare() {
		return fare;
	}
	public void setFare(Long fare) {
		this.fare = fare;
	}

	
	
}
