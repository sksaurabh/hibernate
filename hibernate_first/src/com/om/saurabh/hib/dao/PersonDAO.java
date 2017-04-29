package com.om.saurabh.hib.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.om.saurabh.hib.dto.PersonDTO;

public class PersonDAO {

	public static void main(String[] args) {

		PersonDTO dto = new PersonDTO();
		dto.setName("Ashok");
		dto.setEmail(".hsk@gmail");
		dto.setAge(25);
		dto.setId(0);

		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addResource("PersonDTO.hbm.xml");

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.save(dto);
		transaction.commit();
		session.close();

	}
}
