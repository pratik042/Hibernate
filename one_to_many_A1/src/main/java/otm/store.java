package otm;

import java.util.ArrayList;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
	    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate1.cfg.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	    Session session=factory.openSession();  
	      
	    org.hibernate.Transaction t=session.beginTransaction();    
	        
	    Answer ans1=new Answer();    
	    ans1.setAnswer("Java is a programming language");    
	    ans1.setPostedby("Ravi Malik");    
	        
	    Answer ans2=new Answer();    
	    ans2.setAnswer("Java is a platform");    
	    ans2.setPostedby("Sudhir Kumar");    
	        
	    Answer ans3=new Answer();    
	    ans3.setAnswer("Servlet is an Interface");    
	    ans3.setPostedby("Jai Kumar");    
	        
	    Answer ans4=new Answer();    
	    ans4.setAnswer("Servlet is an API");    
	    ans4.setPostedby("Arun");    
	        
	    ArrayList<Answer> list1=new ArrayList<Answer>();    
	    list1.add(ans1);    
	    list1.add(ans2);    
	        
	    ArrayList<Answer> list2=new ArrayList<Answer>();    
	    list2.add(ans3);    
	    list2.add(ans4);    
	        
	    question question1=new question();    
	    question1.setQuest("What is Java?");    
	    question1.setAnswer(list1);    
	     
	    question question2=new question();    
	    question2.setQuest("What is Servlet?");    
	    question2.setAnswer(list2);    
	       
	    session.persist(question1);    
	    session.persist(question2);    
	        
	   // t.commit();    
	   //  session.close();    
	    System.out.println("success");    
	}

}
