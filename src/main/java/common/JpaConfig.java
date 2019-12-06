package common;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.cfg.Environment;

public class JpaConfig{
	private static EntityManagerFactory factory = null;
	private static Properties properties = null;
	private static EntityManager manager = null;
	
	public static EntityManager getConnection() {
		
		if (factory == null) {
			/*
			 * if(properties == null) { setConfig(); }
			 */
			factory = Persistence.createEntityManagerFactory("config",properties);
			manager =   factory.createEntityManager() ;
		}
		return manager;
	}
	public static void setClass( Class<?> clazz) {
		if(properties == null) {
			setConfig();
			properties.put(org.hibernate.jpa.AvailableSettings.LOADED_CLASSES, clazz);
		}
		
	}

	public static void setConfig() {	
		properties = new Properties();
		properties.setProperty("hibernate.connection.driver_class",
				Environment.getProperties().getProperty("hibernate.connection.driver_class"));
		properties.setProperty("hibernate.connection.password",
				Environment.getProperties().getProperty("hibernate.connection.password"));
		properties.setProperty("hibernate.connection.pool_size",
				Environment.getProperties().getProperty("hibernate.connection.pool_size"));
		properties.setProperty("hibernate.connection.url",
				Environment.getProperties().getProperty("hibernate.connection.url"));
		properties.setProperty("hibernate.connection.username",
				Environment.getProperties().getProperty("hibernate.connection.username"));
		properties.setProperty("hibernate.dialect", Environment.getProperties().getProperty("hibernate.dialect"));
		properties.setProperty("hibernate.search.autoregister_listeners",
				Environment.getProperties().getProperty("hibernate.search.autoregister_listeners"));
		properties.setProperty("hibernate.format_sql", Environment.getProperties().getProperty("hibernate.format_sql"));
		properties.setProperty("hibernate.connection.release_mode",
				Environment.getProperties().getProperty("hibernate.connection.release_mode"));
		properties.setProperty("packagesToScan","src.main.java.entity");
		//properties.setProperty("hibernate.hbm2ddl.auto",Environment.getProperties().getProperty("hibernate.hbm2ddl.auto"));
		
	}
}
