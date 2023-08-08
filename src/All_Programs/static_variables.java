package All_Programs;

class Student
{
  static String name="sakshi";
  static double fees;
}


public class static_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student.fees=40000;
		
		System.out.println(Student.name);
		System.out.println(Student.fees);
	}

}
