package com.om.saurabh.hib.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.om.saurabh.hib.dto.Bike;
import com.om.saurabh.hib.dto.Car;

public class VehicleDAO {

	public static void main(String[] args) {

	/*	Bike b1 = new Bike();
		b1.setCc(150);
		b1.setColor("red");
		b1.setId(1);
		b1.setKick(true);
		b1.setName("puser");
		b1.setType("Petrol");
		*/
		Car c1 = new Car();
		c1.setColor("orange");
		//c1.setId(1);
		c1.setModel("FORD");
		c1.setMusic_sys(true);
		c1.setName("scarpo");
		c1.setNoOfDoor(2);
		c1.setType("desiel");

		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addResource("Vehicle.hbm.xml");
		configuration.addResource("car.hbm.xml");
		configuration.addResource("bike.hbm.xml");
		SessionFactory factory = configuration.buildSessionFactory();

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			session.save(c1);
			transaction.commit();
		} catch (HibernateException e) {
			System.err.println(e.getMessage());
			transaction.rollback();
		} finally {
			session.close();
		}
	}
}
