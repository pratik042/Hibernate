package otm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;

import javax.persistence.TypedQuery;
import javax.transaction.Transaction;

import org.hibernate.MappingException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.model.IdentifierGeneratorDefinition;
import org.hibernate.boot.model.TypeDefinition;
import org.hibernate.boot.model.relational.Database;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.annotations.NamedEntityGraphDefinition;
import org.hibernate.cfg.annotations.NamedProcedureCallDefinition;
import org.hibernate.dialect.function.SQLFunction;
import org.hibernate.engine.ResultSetMappingDefinition;
import org.hibernate.engine.spi.FilterDefinition;
import org.hibernate.engine.spi.NamedQueryDefinition;
import org.hibernate.engine.spi.NamedSQLQueryDefinition;
import org.hibernate.id.factory.IdentifierGeneratorFactory;
import org.hibernate.mapping.FetchProfile;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.mapping.Table;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;


public class store {
	
	//KEEP IN MING   <property name="hbm2ddl.auto">update</property>//
	//THIS SHOULD BE ON UPDATE MODE...OR ELSE PROGRAM WONT WORK
	// Could not determine type for: java.util.List, at table: otm2question, for columns: [org.hibernate.mapping.Column(answer)]
	// this error comes when you havnt specified type of mapping annotation
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    answer ans1 =new answer();
		answer ans2 =new answer();
		
		answer ans3 =new answer();
		answer ans4 =new answer();

	    ArrayList<answer> list1=new ArrayList<answer>();
		ans1.setAnswer("yes im practicing");
		ans2.setAnswer("bt not consistantly");
		list1.add(ans1);
		list1.add(ans2);
		
		ArrayList<answer> list2=new ArrayList<answer>();
		ans3.setAnswer("no");
		ans4.setAnswer("i need to have a prpper plan");
		list2.add(ans3);
		list2.add(ans4);
		

		question que1 =new  question();
		que1.setQuestion("are u practicing");
        que1.setAnswer(list1);

		question que2 =new  question();
		que2.setQuestion("is this right");
		que2.setAnswer(list2);

		
		
	
		ServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		
		SessionFactory sf= meta.buildSessionFactory();
		
	    Session session =sf.openSession();  
	    
	    org.hibernate.Transaction tx=session.beginTransaction();
	    
	
	    
		
		session.save(que1);
		session.save(que2);
	
		tx.commit();
		session.close();
		System.out.println("method= one to many ,data updated on server");
		
		
		
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
