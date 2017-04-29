package com.hib.relations.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.relations.dto.ComputerDTO;
import com.hib.relations.dto.CpuDTO;

public class TestDao {

	public static void main(String[] args) {

		ComputerDTO computer = new ComputerDTO();
		// computer.setId(7);
		computer.setHardDiskSize(500);
		computer.setNoOfProccessor(3);

		CpuDTO cpu = new CpuDTO();
		// cpu.setId(7);
		cpu.setFrequency(200);
		cpu.setNoOfFan(1);

		computer.setCpuDTO(cpu);
		cpu.setComputerDTO(computer);

		Configuration configuration = new Configuration();
		configuration.configure("config/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			ComputerDTO frmDB = (ComputerDTO) session.load(ComputerDTO.class,
					new Integer(99));
			System.out.println(frmDB.getNoOfProccessor());

			//System.out.println(frmDB.getCpuDTO().getFrequency());
			transaction.commit();

		} catch (HibernateException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}

	}

}
