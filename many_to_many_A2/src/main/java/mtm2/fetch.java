package mtm2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();    
		    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();    
		    SessionFactory factory=meta.getSessionFactoryBuilder().build();    
		    Session session=factory.openSession();    
		 // now we need to get data from data base so we create object of typed query class
		    
		    TypedQuery<Question>tq=session.createQuery("from Question");
		    //now values are in tq object ,now we will storre them in list array
		    List<Question>lst1=tq.getResultList();//using resultset we can get values
		    //now values are in lst1 object so we use iterator to iterate them and bring them out
		    Iterator<Question>itr1=lst1.iterator();
		    
		    //now values are in itr1 now we use while loop to get all
		    while(itr1.hasNext())
		    {
		    	Question qq=itr1.next();
		    	System.out.println(" question="+qq.getQname());
		    	//System.out.println(" answer="+qq.getAnswers());//if we write ans here itself then ans will come in bytecode so we need one more iterator to get ans
		    
		    
		        List<Answer>lst2=qq.getAnswers();
		        //now we need an iterator to get ans from there
		        Iterator<Answer>itr2=lst2.iterator();
		        //now we need while loop to iterater all elements
		        while(itr2.hasNext())
		        {
		        	Answer rr=itr2.next();
		        	System.out.println("answer="+rr.getAnswername() +"posted by="+rr.getPostedBy());
		        }
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    }
		 
		    
		    
	}

}
