package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Roshan", "Rosh","Roshan","Ros","Ro");
		
		//List<String> l = list.stream().collect(Collectors.toList());
		//System.out.println(l);
		Stream<String> stream = list.stream().map(name -> name+"kanwal");
		//HashSet<String> set = (HashSet<String>) list.stream().limit(3).map(name -> name + name).distinct().collect(Collectors.toSet());
		
		System.out.println(stream);
		//System.out.println(newList);
	}
	
}
