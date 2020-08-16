package tpc1;

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

		bikes obj1=new bikes(0, null);
		
	types obj2=new types(0, null, null);
		
	properties obj3 =new properties(0, null, 0);
		
	
	obj1.setBikeid(400);
		obj1.setBikename("dominar");
		
		obj2.setBikeid(250);
		obj2.setBikename("dominar200");
		obj2.setBiketype("cruiser");
		
		obj3.setBikecc(500);
		obj3.setBikeid(31);
		obj3.setBikename("bullet");
		
		ServiceRegistry  ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		
		Metadata meta= new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=meta.buildSessionFactory();
		
		Session session=sf.openSession();
		org.hibernate.Transaction tx= session.beginTransaction();
		
		session.save(obj1);
		session.save(obj2);
		session.save(obj3);
		
		tx.commit();
		session.close();
		
		System.out.println("data updated congrats..u have been selected in TCS ,with package of 5Lacks");
		
		
		
	}

}
