package CollectionFramework_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ArrayList1 {

	public static void main(String[] args) {
		
		
//		List<String> l1 = new ArrayList<String>();
		
		Stack<String> l1 = new Stack<String>();
		
		l1.push("Swati");
		l1.push("karan");
		l1.push("Sneha");
		l1.push("Arjun");
		l1.push("Chaya");
		
		
	//	System.out.println(l1);
		
		
		//Traversing using Iterator
//		Iterator itr = l1.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		//Traversiong through for each loop
		
		l1.set(1,"Ram"); // replace any element
		
		Collections.sort(l1);
		
		
		for(String i:l1)
		{
			System.out.println(i);
		}
		

	}

}
