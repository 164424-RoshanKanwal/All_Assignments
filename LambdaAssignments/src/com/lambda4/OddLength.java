package com.lambda4;

import java.util.stream.Stream;

public class OddLength {
public static void main(String[] args) {
	Stream.of("Roshan", "Sneha", "Chaya", "Urvi", "Parthi").filter(s-> s.length()%2==0).map(s->s).forEach(System.out::println);
}
}
