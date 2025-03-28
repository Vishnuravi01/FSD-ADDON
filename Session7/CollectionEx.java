package Session7;

import java.util.*;

public class CollectionEx {
                 
	//Adding And Accessing Elements in a collection
	
    public static void main(String[] args) {
		//List Example
    	List<String> list = new ArrayList<>();
    	
    	list.add("Java");
    	list.add("Python");
    	list.add("Node");
    	
    	System.out.println("Original List:"+list);
    	
    	//Add Data In Specific Index
    	list.add(1, "React");
    	System.out.println("After adding: "+list);
    	
    	//Update an elements
    	list.set(2, "Angular");
    	System.out.println("After Updating: "+list);
    	
    	//Remove an elements
    	list.remove("Node");
    	System.out.println("After Removing: "+list);
    	
    	Set<String> set = new HashSet<>();
    	
    	set.add("Yamaha");
     	set.add("RE");
     	set.add("Jawa");
     	
     	System.out.println("Set: "+set);
     	
     	//Map Example
     	
     	Map<Integer, String> map = new HashMap<>();
     	map.put(1, "Zovic");
     	map.put(2, "Zoya");
     	map.put(3, "Xander");
    	
     	System.out.println("Map: "+map);
    	
    	
	}
}
