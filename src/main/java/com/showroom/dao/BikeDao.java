package com.showroom.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.showroom.entity.Bike;

@Repository
public class BikeDao {

	@Autowired
	SessionFactory factory;

	public Bike insertBike(Bike bike) {
		Session session = factory.openSession();
		session.save(bike);
		session.beginTransaction().commit();
		System.out.println(bike);
		System.out.println("Record Saved!!!");
		return bike;
	}

	public List<Bike> feachAllBikes() {
		Session session = factory.openSession();
		Query query = session.createQuery("from Bike");
		List<Bike> list = query.list();
		return list;
	}

	public Bike feachBikesPerId(int bikeId) {
		Session session = factory.openSession();
		Bike bike = session.load(Bike.class, bikeId);
		return bike;
	}

	public List<Bike> feachBikesPerName(String bikeName) {
		Session session = factory.openSession();
		Query query = session.createQuery("from Bike where bikeName = '" + bikeName + "'");
		List<Bike> bikes = query.list();
		return bikes;
	}

	public List<Bike> feachBikespPerCompany(String bikeCompany) {
		Session session = factory.openSession();
		Query query = session.createQuery("from Bike where bikeCompany = '" + bikeCompany + "'");
		List<Bike> bikes = query.list();
		return bikes;
	}

	public List<Bike> feachBikespPerAboveMillage(int bikeMillage) {
		Session session = factory.openSession();
		Query query = session.createQuery("from Bike where bikeMillage > " + bikeMillage + "");
		List<Bike> bikes = query.list();
		return bikes;
	}

	public List<Bike> feachBikespPerBelowMillage(int bikeMillage) {
		Session session = factory.openSession();
		Query query = session.createQuery("from Bike where bikeMillage < " + bikeMillage + "");
		List<Bike> bikes = query.list();
		return bikes;
	}

	public List<Bike> feachBikespPerAbovePrice(int bikePrice) {
		Session session = factory.openSession();
		Query query = session.createQuery("from Bike where bikeMillage > " + bikePrice + "");
		List<Bike> bikes = query.list();
		return bikes;
	}

	public List<Bike> feachBikespPerBelowPrice(int bikePrice) {
		Session session = factory.openSession();
		Query query = session.createQuery("from Bike where bikeMillage < " + bikePrice + "");
		List<Bike> bikes = query.list();
		return bikes;
	}

	public Bike deleteBikesPerId(int bikeId) {
		Session session = factory.openSession();
		Bike bike = session.get(Bike.class, bikeId);
		if (bike != null) {
			session.delete(bike);
			System.out.println(bike);
			System.out.println("Record Deleted!!!");
			session.beginTransaction().commit();
		} else {
			System.out.println("Record Not Exists!!!");
		}
		return bike;
	}

	public Bike deleteBikePerName(String bikeName) {
		Session session = factory.openSession();
		Query query = session.createQuery("from Bike where bikeName = '" + bikeName + "'");
		Bike bike = null;
		List<Bike> bikes = query.list();
		for (Bike bike2 : bikes) {
			if (bike2 != null) {
				bike = bike2;
				session.delete(bike);
				System.out.println(bike);
				System.out.println("Record Deleted!!!");
				session.beginTransaction().commit();
			} else {
				System.out.println("Record Not Exists!!!");
			}
		}
		return bike;
	}

	public List<Bike> deleteBikespPerCompany(String bikeCompany) {
//		Session session = factory.openSession();
//		Query query =session.createQuery("from Bike where bikeCompany = '"+bikeCompany+"'");
//		List<Bike> bikes = query.list();
		return null;
	}

}
