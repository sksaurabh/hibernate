package com.om.saurabh.hib.dao;

import java.util.Collection;
import java.util.HashSet;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.om.saurabh.hib.dto.BeerDTO;
import com.om.saurabh.hib.dto.KingfisherDTO;

public class TestDAO {

	public static void main(String[] args) {
      KingfisherDTO k1=new KingfisherDTO();
      k1.setLocation("BNG");
      k1.setName("KF");
      k1.setOner("mally");
     
      Collection<BeerDTO> beerDTOs=new HashSet<BeerDTO>();
      BeerDTO b1=new BeerDTO();
      b1.setPrice(65);
      b1.setQuality(330);
      b1.setType("strong");
      
      BeerDTO b2=new BeerDTO();
      b2.setPrice(66);
      b2.setQuality(335);
      b2.setType("ST");
      beerDTOs.add(b1);
      beerDTOs.add(b2);
      k1.setBeerDTOs(beerDTOs);
      
      Configuration configuration=new Configuration();
      configuration.configure();
      SessionFactory factory=configuration.buildSessionFactory();
      
      Session session = factory.openSession();
      
      Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			session.save(k1);
			transaction.commit();
		} catch (HibernateException e) {
			System.err.println(e.getMessage());

		} finally {
			session.close();
		}
	}
}