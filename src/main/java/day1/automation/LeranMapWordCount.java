package day1.automation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LeranMapWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      String name ="HariniNatarajan";
      char[] charArray01 = name.toCharArray();
      
      Map <Character, Integer> map01 = new HashMap <Character,Integer>();
      
      for (char ch: charArray01) {
    	  if (map01.containsKey(ch)) {
    		  map01.put(ch, map01.get(ch)+1);
    	  } else {
    		  map01.put(ch, 1);
    	  }
      }
      
      System.out.println(map01);
      
      for (Entry<Character, Integer> eachkey: map01.entrySet()) {
    	  
    	  System.out.println("The Key is:" +eachkey.getKey() + " and the value is:" +eachkey.getValue());
          }
    	  
	}
}
