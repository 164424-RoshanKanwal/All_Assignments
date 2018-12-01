package java8;

public class Greetings {

	public void greet(Greeter greeter){
		greeter.perform();
		
		
		
	}
	
	public static void main(String[] args) {
		/*Greetings gr = new Greetings();
		HelloWorldGreeter h = new HelloWorldGreeter();
		gr.greet(h);*/
		
		MyLamba myLambdaFunction = () -> System.out.println("Hemml");
		myLambdaFunction.first();
	}
	
}

interface MyLamba{
	void first();
}