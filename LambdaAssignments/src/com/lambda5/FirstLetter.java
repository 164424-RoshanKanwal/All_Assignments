package com.lambda5;

import java.util.stream.Stream;

public class FirstLetter {
public static void main(String[] args) {
	
	Stream.of("Roshan", "Sneha", "Chaya", "Urvi", "Parthi").map(s-> s.substring(0,1)).forEach(System.out::println);
	
}
}
