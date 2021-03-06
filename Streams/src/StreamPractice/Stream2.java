package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream2 {

public static void main(String[] args) {
	
	List<String> list = Arrays.asList("Apple","B","c ","D", "E");
	System.out.println(list);
	List<String> modList = list.stream().filter(name-> name.startsWith("A")).collect(Collectors.toList());
	
	//System.out.println(modList);
	
	List<String> l = list.stream().sorted((a,b)-> b.compareTo(a)).collect(Collectors.toList()).subList(1, 3);
	System.out.println(l);
}

}
