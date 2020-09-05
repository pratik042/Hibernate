package kk;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		store str=new store(0, null);
		
		str.setId(42);
		str.setName("sonuuu");
		
		ServiceRegistry ssr= new  StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata meta= new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory sf =meta.buildSessionFactory();
		
		Session ss=sf.openSession();
		org.hibernate.Transaction  tx= ss.beginTransaction();
		
		
		
		ss.save(str);
		
		tx.commit();
		ss.close();
		System.out.println(" data updated ");
		
		
		//Exception in thread "main" org.hibernate.internal.util.config.ConfigurationException: Unable to perform unmarshalling at line number 0 and column 0 
		//in RESOURCE hibernate.cfg.xml. Message: null
		
		// if this error comes go and check the    

		
		
		
		
		
		
	}

}
