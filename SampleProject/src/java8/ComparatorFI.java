package java8;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorFI {

	public static void main(String[] args) {

		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Roshan","kanwal", 23));
		personList.add(new Person("Rohit", "Heh", 24));
		personList.add(new Person("Roshang","kanwal", 22));
		personList.add(new Person("Rohitu", "Heh", 12));
		personList.add(new Person("Roshani","kanwal", 13));
		personList.add(new Person("Rohita", "Hehfg", 57));	



		Collections.sort(personList, (p1,p2) -> {  	//(p1,p2) -> p1.getLname().compareTo(p2.getLname()
			if(p1.getLname().equals(p2.getLname()))
			{
				return p1.getFname().compareTo(p2.getFname());
			}
			else{
				return p1.getLname().compareTo(p2.getLname());
			}	});


			printAllWithLnameC(personList, new Condition(){

				@Override
				public boolean condition() {
					
					return true;
				}
				
			});

			
			System.out.println("+++++++++++++++++++++++++++++++++++");
			//printAll(personList);

	}

	private static void printAllWithLnameC(ArrayList<Person> personList, Condition cond) {
		
		for(Person p : personList){
			if(cond.condition()){
				System.out.println(p);
				
			}
			
		}
		
	}

	private static void printAll(ArrayList<Person> personList) {

		for(Person p : personList)
		{
			System.out.println(p);
		}
	}


}

interface Condition{
	boolean condition();
}
