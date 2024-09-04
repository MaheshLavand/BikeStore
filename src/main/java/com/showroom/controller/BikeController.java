package com.showroom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.showroom.entity.Bike;
import com.showroom.service.BikeServise;

@RestController
public class BikeController {

	@Autowired
	BikeServise bikeServise;
	
	@GetMapping("feachAllBikes")
	public List<Bike> feachAllBikes(){
		return bikeServise.feachAllBikes();
	}
	
	@GetMapping("feachBikesPerId/{id}")
	public List<Bike> feachBikesPerId(int bikeId){
		return bikeServise.feachAllBikes();
	}
	
	@GetMapping("feachBikePerName/{name}")
	public List<Bike> feachBikePerName(String bikeName){
		return bikeServise.feachAllBikes();
	}
	
	@GetMapping("feachBikespPerCompany/{bikeCompany}")
	public List<Bike> feachBikespPerCompany(String bikeCompany){
		return bikeServise.feachAllBikes();
	}
	
	@GetMapping("feachBikespPerAboveMillage/{bikeMillage}")
	public List<Bike> AboveMillage(){
		return bikeServise.feachAllBikes();
	}
	
	
	
}
