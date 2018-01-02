import java.util.*;
import java.io.Serializable;
//import java.util.Collections;

class Proj02Runner {
	
	public Proj02Runner(){

		System.out.println("Jason Burke");
		System.out.println(); 
	}
	
	public Collection<String> getCollection(String[] list) {
				
		List<String> nameList = new ArrayList<>();
		
		for(String i : list) {
		    nameList.add(i);			
		}	
		
		Collections.<String>sort(nameList, new TheComparator());
		return nameList;
		
	}// end public Collection	
}// end class Proj02Runner

class TheComparator implements Comparator<Object>, Serializable{
	
	public int compare(Object o1, Object o2){
		if(!(o1 instanceof String))
			throw new ClassCastException();
		if(!(o2 instanceof String))
			throw new ClassCastException();
		
		//Do an upper-case comparison
		//int result = o1.compareToIgnoreCase(o2);
		int result = ((String)o1).toUpperCase().compareTo(((String)o2).toUpperCase());

		return result;
	}// end compare
	/*
	public boolean equals(Object o){
		if(!(o instanceof TheComparator))
			return false;
		else return true;
	}// end overriden equals()
	*/
}// end class TheComparator
