package java8;

import java.util.ArrayList;

public class Lambda1 {

	public static void main(String[] args) {
		
	/*	ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Roshan","kanwal", 23));
		personList.add(new Person("Rohit", "Heh", 24));
		personList.add(new Person("Roshang","kanwal", 22));
		personList.add(new Person("Rohitu", "Heh", 12));
		personList.add(new Person("Roshani","kanwal", 13));
		personList.add(new Person("Rohita", "Hehfg", 57));	*/
		
		Real real = (int a, int b) -> a+b;
		System.out.println(real.add(2,5));
		
		
	}
	
}
interface Real{
	int add(int a, int b);
}
