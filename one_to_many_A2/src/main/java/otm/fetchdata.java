package otm;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.persistence.TypedQuery;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class fetchdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta= new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=meta.buildSessionFactory();
		Session session =sf.openSession();
	//	org.hibernate.Transaction tx=session.beginTransaction();
		// TypedQuery query=session.createQuery("from question"); 
		 TypedQuery query=session.createQuery("from question");
		//TypedQuery<question>query=session.createQuery("from question");
		  java.util.List<question> list=query.getResultList();    
		
		
		
		
		   Iterator<question> itr=list.iterator();    
		    while(itr.hasNext())
		    {    
		        question q=itr.next();    
		        System.out.println("Question Name: "+q.getQuestion());    
		            
		        //printing answers    
		        java.util.List<answer> list2=q.getAnswer();    
		        Iterator<answer> itr2=list2.iterator();    
		       while(itr2.hasNext())  
		       {  
		        answer a=itr2.next();  
		            System.out.println(" ans is="+a.getAnswer());  
		        }    
		    }  
		
		
		
		    session.close();    
		    System.out.println(" one to many data fetched ");  
		
		
		
		
		
		
		
		
		
		
		
	}

}
