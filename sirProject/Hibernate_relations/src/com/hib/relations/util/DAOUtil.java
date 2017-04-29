package com.hib.relations.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class DAOUtil {

	private static final SessionFactory sessionFactory;

	static {
		Configuration configuration = new Configuration();
		configuration.configure("config/hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
