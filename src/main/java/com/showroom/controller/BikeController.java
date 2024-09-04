package com.showroom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.showroom.entity.Bike;
import com.showroom.service.BikeServise;

@RestController
public class BikeController {

	@Autowired
	BikeServise bikeServise;
	
	@PostMapping("insertBike")
	public Bike insertBike(@RequestBody Bike bike){
		return bikeServise.insertBike(bike);
	}
	
	@GetMapping("feachAllBikes")
	public List<Bike> feachAllBikes(){
		return bikeServise.feachAllBikes();
	}
	
	@GetMapping("feachBikesPerId/{id}")
	public Bike feachBikesPerId(@PathVariable("id") int bikeId){
		return bikeServise.feachBikesPerId(bikeId);
	}
	
	@GetMapping("feachBikePerName/{name}")
	public List<Bike> feachBikePerName(@PathVariable("name") String bikeName){
		return bikeServise.feachBikePerName(bikeName);
	}
	
	@GetMapping("feachBikespPerCompany/{bikeCompany}")
	public List<Bike> feachBikespPerCompany(@PathVariable("bikeCompany") String bikeCompany){
		return bikeServise.feachBikespPerCompany(bikeCompany);
	}
	
	@GetMapping("feachBikespPerAboveMillage/{bikeMillage}")
	public List<Bike> feachBikespPerAboveMillage(@PathVariable("bikeMillage") int bikeMillage){
		return bikeServise.feachBikespPerAboveMillage(bikeMillage);
	}
	
	@GetMapping("feachBikespPerBelowMillage/{bikeMillage}")
	public List<Bike> feachBikespPerBelowMillage(@PathVariable("bikeMillage") int bikeMillage){
		return bikeServise.feachBikespPerBelowMillage(bikeMillage);
	}
	
	@GetMapping("feachBikespPerAbovePrice/{bikePrice}")
	public List<Bike> feachBikespPerAbovePrice(@PathVariable("bikePrice") int bikePrice){
		return bikeServise.feachBikespPerAbovePrice(bikePrice);
	}
	
	@GetMapping("feachBikespPerBelowPrice/{bikePrice}")
	public List<Bike> feachBikespPerBelowPrice(@PathVariable("bikePrice") int bikePrice){
		return bikeServise.feachBikespPerBelowPrice(bikePrice);
	}
	
	@DeleteMapping("deleteBikesPerId/{id}")
	public Bike deleteBikesPerId(@PathVariable("id") int bikeId){
		return bikeServise.deleteBikesPerId(bikeId);
	}
	
	@DeleteMapping("deleteBikePerName/{name}")
	public Bike deleteBikePerName(@PathVariable("name") String bikeName){
		return bikeServise.deleteBikePerName(bikeName);
	}
	
	@DeleteMapping("deleteBikespPerCompany/{bikeCompany}")
	public List<Bike> deleteBikespPerCompany(@PathVariable("bikeCompany") String bikeCompany){
		return bikeServise.deleteBikespPerCompany(bikeCompany);
	}
	
}
