package com.showroom.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class Bike {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int bikeId;
	String bikeName;
	String bikeCompany;
	int bikeMillage;
	int bikeCost;

	public Bike() {
		super();
	}

	public Bike(String bikeName, String bikeCompany, int bikeMillage, int bikeCost) {
		super();
		this.bikeName = bikeName;
		this.bikeCompany = bikeCompany;
		this.bikeMillage = bikeMillage;
		this.bikeCost = bikeCost;
	}

	public int getBikeId() {
		return bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public String getBikeCompany() {
		return bikeCompany;
	}

	public void setBikeCompany(String bikeCompany) {
		this.bikeCompany = bikeCompany;
	}

	public int getBikeMillage() {
		return bikeMillage;
	}

	public void setBikeMillage(int bikeMillage) {
		this.bikeMillage = bikeMillage;
	}

	public int getBikeCost() {
		return bikeCost;
	}

	public void setBikeCost(int bikeCost) {
		this.bikeCost = bikeCost;
	}

	@Override
	public String toString() {
		return "Bike [bikeId=" + bikeId + ", bikeName=" + bikeName + ", bikeCompany=" + bikeCompany + ", bikeMillage="
				+ bikeMillage + ", bikeCost=" + bikeCost + "]";
	}

}
