package CollectionFramework_List;

import java.util.LinkedHashSet;
import java.util.Set;

class courses
{
	int id;
	String cname;
	String fees;
	
	public courses(int id, String cname, String fees) {
		super();
		this.id = id;
		this.cname = cname;
		this.fees = fees;
	}
	
	
}




public class Linkedhashset1 {

	public static void main(String[] args) {
//		Set<String> s1= new LinkedHashSet<String>();
//		
//		s1.add("c");
//		s1.add("c++");
//		s1.add("java");
//		s1.add("python");
//		
//		
//		System.out.println(s1);
//		
//		
//		System.out.println(s1.remove("c"));
//		
//		System.out.println(s1);
//		

		LinkedHashSet<courses> s2= new LinkedHashSet<courses>();
		
		
		courses c1 = new courses(101,"c","8000");
		courses c2 = new courses(102,"c++","10000");
		courses c3 = new courses(103,"python","12000");
		
		s2.add(c1);
		s2.add(c2);
		s2.add(c3);
		
		
		for(courses c:s2)
		{
			System.out.println(c.id+" "+c.cname+" "+c.fees);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
