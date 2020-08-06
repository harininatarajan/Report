package day1.automation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hashmap01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map <String,String>obj1=new TreeMap <String,String>();
        obj1.put("100", "one");
        obj1.put("200", "three");
        obj1.put("400", "six");
        obj1.put("500", "seven");
        obj1.put("600", "two");
        obj1.put("700", "four");
        obj1.put("800", "five");
        obj1.put("650", "one");
        
        for(Map.Entry<String,String>data:obj1.entrySet())
        {
        	System.out.println("key from map is "+data.getKey()+" and value is "+data.getValue());
        }
	
	    
	}
	
	
}
        
	


