package classes_and_objects_and_methods;
class Animal
{
	public void run()
	{
		System.out.println("dog is running");
	}
	
	
	public void sleep()
	{
		System.out.println("cat loves sleeping");
	}
	
	public void eat()
	{
		System.out.println("go and eat");
	}
}

public class class1 {

	public static void main(String[] args) {
		
		Animal dog = new Animal();
		
		dog.run();
		dog.eat();
		
		Animal cat;
		
		cat = new Animal();
		cat.sleep();
		cat.eat();
		

	}

}
