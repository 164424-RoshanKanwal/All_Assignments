package java8;

public class Lambda {

	public static void main(String[] args) {
		
		LambdaEx myLambda = s -> s.length();
		
		System.out.println(myLambda.getLength("Rosahan Knawsal"));
		
	}
	
	
}

interface LambdaEx{
	int getLength(String s);
}