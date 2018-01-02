import java.util.*;
import java.io.Serializable;






class Proj04Runner{
		
		
		
	public Proj04Runner(){

		System.out.println("Jason Burke");
		System.out.println(); 
	}
	
	public Collection getCollection(String[] list){
		
		TreeSet<String> ref = new TreeSet<>(new TheComparator());// changed from Collection
		// to tree set 
		
		// reverse list before adding to ref 
		//list = (TreeSet<String>)list.descendingSet();
		//Collections.reverse(Arrays.asList(list));
		
		
		ArrayList<String> nameList = new ArrayList<>();
		// add the names from list to nameList
		for(String i : list) {
			nameList.add(i);
		}
		//List<String> newNameList = new ArrayList<>();
		
		
		//Collections.<String>sort(nameList);
		
/*  	for(String i : nameList){	
		int firstLetter = 0;
		char[] charArray1 = i;
		
		//char[] charArray2 = nameList[1];
		System.out.println("before change, charArray[firstLetter] = " + i );
		
		 if (i == i.toUpperCase()){
			char temp = i.charAt(0);
			temp = temp.toUpperCase();
			i.charAt(0) = temp;
			System.out.println("charArray1[firstLetter] = " + charArray1[firstLetter]);
		} 
		else if (i == i.toLowerCase()){
			char temp = charArray1[firstLetter].toUpperCase();
			charArray1[firstLetter] = temp;
			System.out.println("charArray1[firstLetter] = " + charArray1[firstLetter]);
		} 
		//String addNew = i;
		//newNameList.add(addNew);
		//firstLetter;
	}  */
		
		for(String i : nameList){
			ref.add(i);
		}
		
		//Collections.<String>sort(ref);
		//sort(ref);
		//Collections.<String>sort(ref, new TheComparator2());
		
		//ref = (TreeSet<String>)ref.descendingSet(); using the *(-1) below instead
		
		return ref;
		
	}// end Proj12Runner()
}// end class Proj12Runner 

class TheComparator implements Comparator<Object>, Serializable{
	
	public int compare(Object o1, Object o2){
		if(!(o1 instanceof String))
			throw new ClassCastException();
		if(!(o2 instanceof String))
			throw new ClassCastException();
		
		// Do a regular comparason.	
		//int result = ((String)o1).compareTo(((String)o2));
		
		//Do an upper-case comparison
		//int result =
        //    ((String)o1).toUpperCase().
        //        compareTo(((String)o2).toUpperCase());
		

		
		// Do a lower-case comparison		
		int result = ((String)o1).toLowerCase().
                compareTo(((String)o2).toLowerCase());
				
		//result = ((String)o1).compareTo(((String)o2));		
							
		return result*(-1);// this will reverse the set order
	}// end compare
	
	
	public boolean equals(Object o){
		if(!(o instanceof TheComparator))
			return false;
		else return true;
	}// end overriden equals()
}// end class TheComparator

class TheComparator2 implements Comparator<Object>, Serializable{
	
	public int compare(Object o1, Object o2){
		if(!(o1 instanceof String))
			throw new ClassCastException();
		if(!(o2 instanceof String))
			throw new ClassCastException();
		
		/* char[] charArray1 = o1;
		char[] charArray2 = o2;
		
		if (charArray1[0] == charArray1[0].toUpperCase()){
			
		} */
		int result = ((String)o1).compareTo(((String)o2));		
		//int result = (String)o1).toUpperCase().
        //        compareTo(((String)o2).toLowerCase());
		
		return result*(-1);
		
	}	
	
		public boolean equals(Object o){
		if(!(o instanceof TheComparator))
			return false;
		else return true;
	}// end overriden equals()
}	
















