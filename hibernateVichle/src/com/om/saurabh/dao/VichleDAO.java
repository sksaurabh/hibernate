package com.om.saurabh.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.om.saurabh.dto.BikeDTO;
import com.om.saurabh.dto.CarDTO;

public class VichleDAO {

	public static void main(String[] args) {
		CarDTO car = new CarDTO();
		car.setNoOfDoors(1);
		car.setMusic(true);
		car.setType("desiel");
		car.setName("bmw");
		
		BikeDTO b1=new BikeDTO();
		b1.setKick(1);
		b1.setColor("red");
		b1.setType("petrole");
		b1.setName("pulser");
		b1.setCc(150);
	
		Configuration configuration = new Configuration();
		//configuration.configure("hibernate.cfg.xml");
		configuration.addResource("car.xml");
		configuration.addResource("Bike.xml");
		configuration.addResource("Vichle.xml");
		

		SessionFactory factory = configuration.buildSessionFactory();

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			session.save(car);
			transaction.commit();
		} catch (HibernateException e) {
			System.err.println(e.getMessage());
			transaction.rollback();
		} finally {
			session.close();
		}
	}

}
