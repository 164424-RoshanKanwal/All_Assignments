package java8;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {

	public static void main(String[] args) {
		List<Person> myList = Arrays.asList(new Person("rosh", "kan", 23),
											new Person("ros", "a", 23),
											new Person("rsh", "k", 23),
											new Person("rh", "k", 23),
											new Person("sh", "an", 23),
											new Person("h", "kn", 23));
		
		
		Comparator<Person> comp = (Person p1, Person p2) -> {return p1.getLname().compareTo(p2.getLname());
								
		Collections.sort(myList, comp);
		}

	 
	

	private static void printAll(List<Person> myList) {
	for(Person p : myList){
		System.out.println(p);
	}
		
	}

}


