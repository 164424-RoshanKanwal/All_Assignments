package StreamPractice;

import java.util.Arrays;
import java.util.List;

public class Stream3 {
public static void main(String[] args) {
	List<Integer> number = Arrays.asList(2,3,4,5);
	int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
	System.out.println(even);
	System.out.println(number);
}
}
