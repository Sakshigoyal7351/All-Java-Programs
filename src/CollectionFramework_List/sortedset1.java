package CollectionFramework_List;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset1 {

	public static void main(String[] args) {
		
		
		SortedSet s1= new TreeSet();
		
		s1.add("papaya");
		s1.add("banana");
		s1.add("orange");
		s1.add("apple");
		
		for(Object i:s1)
		{
			System.out.println(i);
		}
		
		System.out.println("first element: "+s1.first());
		
		System.out.println("last element: "+s1.last());
		
		System.out.println("head set elements : "+s1.headSet("banana"));

		System.out.println("tail set elements : "+s1.tailSet("banana"));
		
		s1.remove("apple");
		
		System.out.println(s1);
		
		System.out.println("contains: "+s1.contains("Banana"));
	}

}
