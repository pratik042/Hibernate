package kk;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;




public class fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=meta.buildSessionFactory();
	    Session session=sf.openSession();
		
		//TypedQuery<store>tt=session.createQuery("from store");
	    TypedQuery<store>tq=session.createQuery("from store");
		List<store> ll=tq.getResultList();
		
		   Iterator<store>itr=ll.iterator();
	//	Iterator<store> itr=ll.iterator();
		
		while(itr.hasNext())
		{ 	
			 store ss=itr.next();
			System.out.println(" id="+ss.getId());
			System.out.println("\n");
		//	System.out.println(" name="+ss.getName());
		}
		
		System.out.println("came");
		
		
	}

}
