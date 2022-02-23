package demo.list;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapPractice {

	public static void main(String[] args) {
		
		Map<Integer, String> mymap = new TreeMap<Integer, String>(); 
		
		mymap.put(1231, "Raja");
		mymap.put(123134, "Mani");
		mymap.put(1231122, "Sam");
		mymap.put(123123, "Kum");
		mymap.put(1231121, "Sam");
		mymap.put(1231124, "Sam");
		mymap.put(123112, "Sam");
		
		Collection<String> namelist = mymap.values(); 
		
		Set<Integer> keys = mymap.keySet();
		
		mymap.forEach(
				
				(k,v) -> {System.out.println(k+" - "+v);}
				
				
				);
		
		
		
		System.out.println(mymap.containsValue("Sam"));
		

	}

}
