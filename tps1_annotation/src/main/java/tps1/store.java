package tps1;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.Synchronization;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import javax.transaction.xa.XAResource;

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

		
		employee obj1=new  employee(0, null);
		
		contract_employee obj2 =new contract_employee(0, null, 0, 0);
		
		regular_employee obj3 =new regular_employee(0, null, 0);
		
		
		
		obj1.setId(44234);
		obj1.setName("sonuuuuuuuu");

		obj2.setBonus(40003);
		obj2.setId(23);
		obj2.setName("pratik");
		obj2.setSalary(5523400);
		
		obj3.setDuration(2228);
		obj3.setId(423);
		obj3.setName("sonu");
		
		
		
		
		

		StandardServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory sf= meta.buildSessionFactory();
		
		Session session=sf.openSession();
		
		org.hibernate.Transaction tx=session.beginTransaction();
		
		
//	session.persist(obj1);
//	session.persist(obj2);
//	session.persist(obj3);
	
    session.save(obj1);
    session.save(obj2);
    session.save(obj3);
		
		//session.close();//////KEEP IN MIND DONT CLOSE SESSION HERE OR ELSE U WILL GET ERROR..
		
		tx.commit();
		
		System.out.println(" hey mr pratik gole ..keep going");
		
		
		
		
		
		
		
	}

}
