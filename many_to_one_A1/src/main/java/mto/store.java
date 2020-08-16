package mto;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		friend f1=new friend();
		f1.setId(21);
		f1.setName("pratik");
		
		
		
		 friend f2=new friend();
		f2.setId(22);
		f2.setName("sonu");
		
		detail d1=new detail();
		d1.setDetailid(21);
		d1.setLocation("panchgani");
		
		f1.setDetail(d1);
		f2.setDetail(d1);
		
		
		ServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta=new  MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory sf=meta.buildSessionFactory();
		
		Session session= sf.openSession();
		
		
		org.hibernate.Transaction tx=session.beginTransaction();
		
		session.save(f1);
		session.save(f2);
		
	//	tx.commit();
	 session.close();
		
		
		System.out.println("data updated");
		
		
		
	}

}
