package StreamPractice;

public class StreamMethodReference1 {

	public static void main(String[] args) {
	//	StreamMethodReference1 one = new StreamMethodReference1();
		SayableDefinition one = new SayableDefinition();
		/*Sayable say1 = one :: saySomething;
		say1.say();*/
		
		Sayable say2 = one::saySomething;//object method reference
		say2.say();
		
		Sayable say3 = () -> System.out.println("Hello!!!!");
		say3.say();
		
	}
	
}
@FunctionalInterface
interface Sayable{
	 void say();
 }

 class SayableDefinition{


	 public void saySomething(){
		 
		 System.out.println("Hello Everyone!!!");
		 
	 }
}