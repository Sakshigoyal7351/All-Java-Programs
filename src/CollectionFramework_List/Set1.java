package CollectionFramework_List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		
		
		SortedSet<String> s1 = new TreeSet<String>();
		
		s1.add("Ram");
		s1.add("shyam");
		s1.add("sita");
		
//		System.out.println(s1);
//		
//		
//		Iterator itr = s1.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}

		
		for(String i:s1)
		{
			System.out.println(i);
		}
	}

}
