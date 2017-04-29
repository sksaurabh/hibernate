package baba.arun.omkar.hib.DAO;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



import baba.arun.omkar.hib.DTO.MovieDTO;

public class MovieDAO 
{
	public static void main(String[] args) 
{	
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the details");
	String movie_name= scn.next();
	String movie_type = scn.next();
	String movie_duration = scn.next();
	MovieDTO ref =new MovieDTO();
	
	ref.setName(movie_name);
	ref.setType(movie_type);
	ref.setDuration(movie_duration);
	
	/*ref.setName("I");
	ref.setType("U/A");
	ref.setDuration("2hrs 30mins");*/
	
	Configuration configuration = new Configuration();
	configuration.configure();
	configuration.addResource("MovieDTO.xml");
	SessionFactory factory = configuration.buildSessionFactory();
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	transaction.begin();
	session.save(ref);
	MovieDTO delete=new MovieDTO();
	delete.setId(4);
	transaction.commit();
	session.close();

}

}