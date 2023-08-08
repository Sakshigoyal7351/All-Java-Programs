package CollectionFramework_List;

import java.util.Enumeration;
import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		
		v1.add("A");
		v1.add("B");
		v1.add("C");
//		
		System.out.println(v1);
		
		System.out.println(v1.size());
		System.out.println(v1.capacity()); //default size
		
		v1.addElement("D");
		v1.addElement("E");
		
//		System.out.println(v1);
//		
//		
//		System.out.println(v1.size());
//		System.out.println(v1.capacity()); 
//		
//		if(v1.contains("D"))
//		{
//			System.out.println(v1.indexOf("D"));
//		}
//		
//		System.out.println(v1.firstElement());
//		
//		System.out.println(v1.lastElement());
//		
//		
//		System.out.println(v1.remove(4));
//		
//		System.out.println(v1);
//
//		v1.removeElementAt(1);
//		System.out.println(v1);
//		
//		
		
		Enumeration<String> enu = v1.elements();
		
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		
		
		
	}

}
 