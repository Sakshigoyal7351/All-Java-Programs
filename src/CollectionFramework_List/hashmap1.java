package CollectionFramework_List;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap1 {

	public static void main(String[] args) {
		
		
		Map m1= new HashMap();
		
		
		m1.put(1, "Amit");
		m1.put(3, "sakshi");
		m1.put(2, "abc");
		m1.put(2, "sneha");
		
		
		System.out.println(m1);
		
		Set s1= m1.entrySet();// converting to set 
		
		Iterator itr = s1.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry = (Map.Entry)itr.next(); // converting to Map, to get key an value seperately
			
			System.out.println(entry.getKey()+"    "+entry.getValue());
			
		}

	}

}
