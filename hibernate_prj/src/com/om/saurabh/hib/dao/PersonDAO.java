package com.om.saurabh.hib.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.om.saurabh.hib.dto.PersonDTO;

public class PersonDAO {

	public static void main(String[] args) {

		PersonDTO dto = new PersonDTO();
		dto.setName("saurabh");
		dto.setEmail("sk@gmail.");
		dto.setAge(24);
		dto.setAddress("#139 9th F main  btm bangalore");

		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addResource("PersonDTO.xml");

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		/*Query hql=session.createQuery("From PersonDTO where P_Email= 'sk@gmail.'");
		List <PersonDTO> PersonDTOs=hql.list();
		if(PersonDTOs!=null)
			System.out.println("result found\t"+PersonDTOs.size()); /*size of projection depends upon the 
		for(PersonDTO PersonDTO:PersonDTOs){                         number of row)
			System.out.println(PersonDTO.getId());
			System.out.println(PersonDTO.getEmail());
			
		}*/
		/* MULTIPLE DATA TYPE THAN WE NEED TO MENTION RETURN TYPE
		Query hql=session.createQuery("select name FROM PersonDTO where P_Email= 'sk@gmail.'");
		List <String> list=hql.list();
		for(String name:list)
		{
			System.out.println(name);
		}*/
		
		/*Query hql=session.createQuery("select age,name From PersonDTO");
		List<Object[]> list=hql.list();
		for(Object[] Object:list)
		{
			Integer age=(Integer)Object[0];
			String name=(String)Object[1];
			System.out.println("Age\t"+age +"\t" + "name\t" +name);
		}*/
		
	/*	Query hql=session.createQuery(" update PersonDTO set P_Email='sk021@gmail.com' where id='2'");
		hql.executeUpdate();  */
		
	/*	Query hql=session.createQuery(" Delete PersonDTO  where id='5'");
		hql.executeUpdate(); */
		/*
		Query hql=session.createQuery(" update PersonDTO set P_Email=? where id=?");
		hql.setString(0,"new#123");
		hql.setInteger(1,1);
		*/
		Query hql=session.createQuery("update PersonDTO set email=:em where id=:id");
		hql.setParameter("em", "om@gmail.com");
		hql.setParameter("id", 1);
     	hql.executeUpdate(); 
     	
		
		transaction.commit();
		session.close(); 
		
  
	}
}
