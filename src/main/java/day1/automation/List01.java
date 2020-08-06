package day1.automation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> obj = new LinkedList<String>();
		obj.add("one");
		obj.add("two");
		obj.add("three");
		obj.add("four");
		obj.add("one");
		obj.add("five");
		obj.add("six");
		
		for(String eachelement : obj) {
			System.out.println(eachelement);
		}
		
		System.out.println("*************************");
		int size = obj.size();
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(obj.get(i));
		}
	
		//update list
		obj.set(2, "harini");
		System.out.println("List now is :"+obj);
		
		//contains 
	    if(obj.contains("harini"))
	    		{
	    			
	    			System.out.println("harini is in the list");
	    		}
	
	    //remove 
	    obj.remove(3);
	      {
	    	  System.out.println("list after remove is "+obj);
	      }
	
	Iterator <String> itr = obj.iterator();
	System.out.println(itr.next()); 
	System.out.println(itr.next()); 
	System.out.println(itr.next()); 
	  
	  Iterator<String> itr1 = obj.iterator();
	
	while(itr1.hasNext()) {
		
		String str=itr1.next();
		System.out.println(str);
		if(str.equals("one"))
		{
			itr1.remove();
		}
		}
	System.out.println("list after iteration is  :"+obj);
	}
}


