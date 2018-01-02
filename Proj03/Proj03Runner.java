import java.util.*;
import java.io.Serializable;

class Proj03Runner{
	
	public Proj03Runner(){

		System.out.println("Jason Burke");
		System.out.println(); 
	}
	
	public Collection getCollection(String[] list){
		
		TreeSet<String> ref = new TreeSet<>();
		//TreeSet<String> reverseRef = new TreeSet<>();
		
		//int j = 0;
		for(String i : list){
			ref.add(i);//list[j]
			//j++;
		}
		 
		ref = (TreeSet<String>)ref.descendingSet();
				
		return ref;
		
	}// end Collection
}// end class Proj03Runner 

