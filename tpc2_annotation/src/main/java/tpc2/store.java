package tpc2;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car obj1=new car(0, null);
		
		car_type obj2 =new car_type(0, null, null);
		
		car_properties obj3 = new car_properties(0, null, null);
		
		
		obj1.setCarid(32);
		obj1.setCarname("fortuner");
		
		obj2.setCarid(12);
		obj2.setCarname("safari");
		obj2.setType("SUV");
		
		obj3.setCarid(33);
		obj3.setCarname("Discovery");
		obj3.setProperty("SUV");
		
		
		ServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
       Metadata meta= new MetadataSources(ssr).getMetadataBuilder().build();
		
       SessionFactory sf= meta.buildSessionFactory();
       
       Session session =sf.openSession();
       
       org.hibernate.Transaction tx=session.beginTransaction();
       
		
       session.save(obj1);
       session.save(obj2);
       session.save(obj3);
       tx.commit();
       session.close();
       
       System.out.println(" TCS EXPECTS U TO LEARN DATA STRUCTURE BE PROFESSIONAL IN THT COZ U HAVE CAPABILTIY,,PLS SIR DO THT AND JOIN US");
       
       
       
       
       
       
       
       
       
       
       
       
       
	}

}
