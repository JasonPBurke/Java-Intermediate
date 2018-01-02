import java.util.*;


class Proj01Runner{
	
	
	public Proj01Runner(){
		
		System.out.println("Jason Burke");
		System.out.println(); 
		
	}
	public Collection getCollection(String[] list) {
		
		List<String> nameList = new ArrayList<>();
		
		for(String item: list) {
			nameList.add(item);
		}
		
        Collections.<String>sort(nameList);
		Collections.<String>reverse(nameList);
                
		return nameList;
	}
}