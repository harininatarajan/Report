package day1.automation;

import java.util.Set;
import java.util.TreeSet;

public class Set01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <String> obj01 = new TreeSet <String>();
		obj01.add("one");
		obj01.add("stwo");
		obj01.add("three");
		obj01.add("sfour");
		obj01.add("fives");
		obj01.add("six");
		obj01.add("seven");
		for(String eachelement : obj01) {
			System.out.println(eachelement);
		}
		System.out.println("*****************************************");
	   
		 for(String eachelement : obj01) {
			 
			 if(eachelement.startsWith("s")) {
				 
				 System.out.println(eachelement);
			 }
               
		 }
	
	
	
	}
	
	

}
