package demo;

import java.util.ArrayList;
import java.util.Iterator;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        hii obj1=new hii(1,"honda");
        hii obj2=new hii(2,"bullet");
		
		 ArrayList<hii>arr=new ArrayList<>();
	     arr.add(obj1);
	     arr.add(obj2);
	     
	     
	     Iterator<hii>itr=arr.iterator();
	     
	     while(itr.hasNext())
	     {
	    	 hii ss=itr.next();
	    	 System.out.println("id="+ss.getId()+"name="+ss.getName());
	     }
	     
		
		
		
		
		
		
	}

}
