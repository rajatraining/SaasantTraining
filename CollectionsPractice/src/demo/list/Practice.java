package demo.list;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Practice {

	public static void main(String[] args) {
		
		
		
		List<String> mylist = new ArrayList<String>(); 
		
		mylist.add("Sandhya"); 
		mylist.add("Sandhya"); 
		mylist.add("Sandhya"); 
		mylist.add("Sandhya"); 
		mylist.add(2, "Raja"); // insert the value 
		
		mylist.set(3, "Shaik"); // update the value 
		
	
		

		System.out.println(mylist);
		
		System.out.println(mylist.remove(1)); // return the value in hte index and delete it
		

		System.out.println(mylist);
		
	
		for(String s : mylist)
		{
			System.out.println(s);
		}
		
		System.out.println("Using java 8 for each");
		
		mylist.forEach(
				
			(s) -> 	{ 
					System.out.println(s);
					}
		);
		
		if(mylist.contains("Raja"))
		{
			System.out.println("its there");
		}
		
		
		
		for(int i=0; i<mylist.size(); i++)
		{
		System.out.println(i+"-"+mylist.get(i));
		}
		
		Iterator it = mylist.iterator(); 
		
		while(it.hasNext())
		{
			System.out.println("using iter -"+it.next());
		}
		
	
		
		System.out.println(mylist);
		
		
		Set<String> myset = new HashSet<String>(); // Wont follow inserting order
		 
		myset.addAll(mylist);
		
		System.out.println(myset);
		
		Set<String> myset1 = new LinkedHashSet<String>(); //Follow insertion order
		 
		myset1.add("Agila");
		
		myset1.addAll(mylist);
		
		myset1.add("Agila");
		
		System.out.println(myset1);
		
		Set<String> myset2 = new TreeSet<String>(); // Sorted order
		 
		myset2.addAll(mylist);
		
		System.out.println(myset2);
		
		
		
		Queue<String> myqueue = new ArrayDeque<String>();
		myqueue.peek(); // retrive the content from head does not remove it 
		
		myqueue.poll(); // retirve the content from the head and removes it 
		
		
		Queue<String> myqueue1 = new PriorityQueue<String>();
		
		//myqueue.
		
		
		

	}

}
