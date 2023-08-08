package CollectionFramework_List;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Treemap1 {

	public static void main(String[] args) {
		
		
		NavigableMap<Integer, String> m1 = new TreeMap<Integer, String>();
		
		
		m1.put(1, "A");
		m1.put(4, "B");
		m1.put(3, "C");
		m1.put(2, "D");
		
		
		//m1.remove(4);
		
		System.out.println(m1);
		
		System.out.println("descending map:"+m1.descendingMap());
	}

}
