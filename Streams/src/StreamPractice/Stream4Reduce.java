package StreamPractice;

import java.util.stream.Stream;

public class Stream4Reduce {
public static void main(String[] args) {
	
	Stream.of("11w", "23q", "1e", "34x").reduce((num1, num2) -> num1 +""+num2 ).ifPresent(System.out::println);;
	
}
}
