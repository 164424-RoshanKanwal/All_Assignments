package StreamPractice;

import java.util.Arrays;

public class Dummy {
	 int x =0;
	public static void main(String[] args) {
		/*Dummy dummy = new Dummy();
		dummy.x=45;
		dummy.printIt(dummy.x);*/
		String[] stringArray = { "Barbara", "James", "Mary", "John",
			    "Patricia", "Robert", "Michael", "Linda" };
			Arrays.sort(stringArray, String::compareToIgnoreCase);
			
			
		for(String s : stringArray){
			System.out.println(s);
		}
		
	}
	
	////What is happening here!!!!
	public void printIt(int y)
	{
		
		System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
	}
}
