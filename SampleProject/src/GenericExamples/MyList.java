package GenericExamples;

import java.util.ArrayList;
import java.util.Collection;

public class MyList <T>{
	
	
	ArrayList<T> arrayList;

	public MyList() {	
		this.arrayList = new ArrayList<T>();
	}

	public void add(T type){
	
		arrayList.add(type);
	
	}

	public boolean remove(T type){

		return arrayList.remove(type);
	}

	

	public void get(int index){
		
		System.out.println(arrayList.get(index));
		
	}

}
