package GenericExamples;

public class GenericExample1<T> {
	
	int first;
	int second;
	String third;
	
	public GenericExample1(int first, int second, String third) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public static void main(String[] args) {
		
		GenericExample1<String> g = new GenericExample1<String>(23,34,"rohsan");
		
		System.out.println(g.first=4);
		
		GenericExample1<Integer> g3 = new GenericExample1<Integer>(32,3,"roshan");
		
		System.out.println(g3.first=33);
		g3.third="roshan";
		
	}
	
	
	
	
}
