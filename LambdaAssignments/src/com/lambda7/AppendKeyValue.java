package com.lambda7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AppendKeyValue {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(4, "Roshan");
		map.put(2, "Rosha");
		map.put(3, "Rosh");
		map.put(1, "Ros");
		
		
		
		map.forEach((k,v) -> System.out.println(k + v));//-----1
		
		
		/*for(Map.Entry<Integer, String> entry : map.entrySet()){----2
			System.out.println(entry.getKey() + entry.getValue());
			
		}*/
		
	/*Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
	while(itr.hasNext()){
		
		//System.out.println(itr.next());
	}*/
	
	}
	
	
	
}
