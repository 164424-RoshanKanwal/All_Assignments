package com.roshan.collectionAssignmentQuestion1;

import java.util.Comparator;

public class myComparator implements Comparator<Object>{

	public int compare(Object obj1,Object obj2){
		
		
		Person person1 = (Person)obj1;
		Person person2 = (Person)obj2;
		
		if (person1.weight > person2.weight){
			
			return 1;
		}
		else if (person1.weight == person2.weight){
			
			if(person1.height > person2.height){
				
				return 1;
			}
			else if (person1.height< person2.height){
				
				return -1;
			}
			else {
				return 0;
			}
		}
		else{
		return -1;
	}}

	
	
	
}
