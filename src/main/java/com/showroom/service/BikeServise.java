package com.showroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.showroom.dao.BikeDao;
import com.showroom.entity.Bike;

@Service
public class BikeServise {

	@Autowired
	BikeDao bikeDao;

	public Bike insertBike(Bike bike) {
		return bikeDao.insertBike(bike);
	}
	
	public List<Bike> feachAllBikes() {
		return bikeDao.feachAllBikes();
	}

	public Bike feachBikesPerId(int bikeId) {
		return bikeDao.feachBikesPerId(bikeId);
	}

	public List<Bike> feachBikePerName(String bikeName) {
		return bikeDao.feachBikesPerName(bikeName);
	}

	public List<Bike> feachBikespPerCompany(String bikeCompany) {
		return bikeDao.feachBikespPerCompany(bikeCompany);
	}

	public List<Bike> feachBikespPerAboveMillage(int bikeMillage) {
		return bikeDao.feachBikespPerAboveMillage(bikeMillage);
	}

	public List<Bike> feachBikespPerBelowMillage(int bikeMillage) {
		return bikeDao.feachBikespPerBelowMillage(bikeMillage);
	}

	public List<Bike> feachBikespPerAbovePrice(int bikePrice) {
		return bikeDao.feachBikespPerAbovePrice(bikePrice);
	}

	public List<Bike> feachBikespPerBelowPrice(int bikePrice) {
		return bikeDao.feachBikespPerBelowPrice(bikePrice);
	}

	public Bike deleteBikesPerId(int bikeId) {
		return bikeDao.deleteBikesPerId(bikeId);
	}

	public Bike deleteBikePerName(String bikeName) {
		return bikeDao.deleteBikePerName(bikeName);
	}

	public List<Bike> deleteBikespPerCompany(String bikeCompany) {
		return bikeDao.deleteBikespPerCompany(bikeCompany);
	}
	
	
	
}
