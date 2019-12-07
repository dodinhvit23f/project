package common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class Hibernate {
	private static Session session;
	private static Configuration cfg;

	public static Session getConnection() {
		if (session == null) {
			/*
			 * if(cfg == null) { setConfig(); }
			 */
			SessionFactory factory = cfg.buildSessionFactory();
			session = factory.openSession();
		}
		return session;
	}

	public static void setClass(Class<?> clazz) {
		if (cfg == null) {
			setConfig();
			cfg.addAnnotatedClass(clazz);
		}

	}

	public static void setConfig() {
		cfg = new Configuration();
		cfg.setProperty("hibernate.connection.driver_class",
				Environment.getProperties().getProperty("hibernate.connection.driver_class"));

		cfg.setProperty("hibernate.connection.password",
				Environment.getProperties().getProperty("hibernate.connection.password"));

		cfg.setProperty("hibernate.connection.pool_size",
				Environment.getProperties().getProperty("hibernate.connection.pool_size"));

		cfg.setProperty("hibernate.connection.url",
				Environment.getProperties().getProperty("hibernate.connection.url"));

		cfg.setProperty("hibernate.connection.username",
				Environment.getProperties().getProperty("hibernate.connection.username"));
		
		cfg.setProperty("hibernate.dialect", Environment.getProperties().getProperty("hibernate.dialect"));
		
		cfg.setProperty("hibernate.search.autoregister_listeners",
				Environment.getProperties().getProperty("hibernate.search.autoregister_listeners"));
		
		cfg.setProperty("hibernate.format_sql", Environment.getProperties().getProperty("hibernate.format_sql"));
		
		cfg.setProperty("hibernate.connection.release_mode",
				Environment.getProperties().getProperty("hibernate.connection.release_mode"));
		
		cfg.setProperty("hibernate.connection.useUnicode",
				Environment.getProperties().getProperty("hibernate.connection.useUnicode"));
		
		cfg.setProperty("hibernate.connection.characterEncoding",
				Environment.getProperties().getProperty("hibernate.connection.characterEncoding"));
		
		cfg.setProperty("packagesToScan", "src.main.java.entity");

		// cfg.setProperty("hibernate.hbm2ddl.auto",Environment.getProperties().getProperty("hibernate.hbm2ddl.auto"));

	}
}