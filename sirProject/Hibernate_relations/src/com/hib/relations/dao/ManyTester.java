package com.hib.relations.dao;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.relations.dto.BeerDTO;
import com.hib.relations.dto.KingfisherDTO;
import com.hib.relations.util.DAOUtil;

public class ManyTester {

	public static void main(String[] args) {

		KingfisherDTO kingfisherDTO = new KingfisherDTO();
		kingfisherDTO.setLocation("BNG");
		kingfisherDTO.setName("KF");
		kingfisherDTO.setOwner("Malla");

		Collection<BeerDTO> beerDTOs = new HashSet<BeerDTO>();

		BeerDTO beerDTO = new BeerDTO();
		beerDTO.setPrice(65);
		beerDTO.setQuantity(330);
		beerDTO.setType("ST");

		BeerDTO beerDTO1 = new BeerDTO();
		beerDTO1.setPrice(65);
		beerDTO1.setQuantity(330);
		beerDTO1.setType("ST");

		beerDTOs.add(beerDTO);
		beerDTOs.add(beerDTO1);

		kingfisherDTO.setBeerDTOs(beerDTOs);

		Session session = DAOUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			KingfisherDTO dtoFromDB=(KingfisherDTO)session.load(KingfisherDTO.class, 1);
		System.out.println(dtoFromDB.getOwner());
		BeerDTO beerDTO2=(BeerDTO)session.load(BeerDTO.class, 2);
		System.out.println(beerDTO2.getPrice());
		System.out.println(beerDTO2.getKingfisherDTO().getOwner());
		
	/*	Collection<BeerDTO> dtos=dtoFromDB.getBeerDTOs();
		System.out.println(dtos.size());
		for (BeerDTO beerDTO2 : dtos) {
			System.out.println(beerDTO2.getPrice());
		}
	*/	
			transaction.commit();
			
			

		} catch (HibernateException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}

	}

}
