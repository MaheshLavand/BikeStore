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

	public List<Bike> feachAllBikes() {
		// TODO Auto-generated method stub
		return null;
	}
}
