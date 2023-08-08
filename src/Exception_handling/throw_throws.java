package Exception_handling;

class RadiusException extends Exception
{
	public String tostring()
	{
		return "radius can not be negative";
	}
	
	public String getMessage()
	{
		return "redius shoulsd be positive";
	}
}

public class throw_throws {
		public static double area(int r) throws RadiusException
	{
		if(r<0)
		{
			throw new RadiusException();
		}
		
		else
		{
			double result = Math.PI*r*r;
			return result;
		}	
	}
	public static int divide(int a, int b)
	{
		int result=a/b;
		return result;
	}

	public static void main(String[] args) {
		
		try
		{
		double ar = area(-2);
		System.out.println(ar);
		
		}
		catch(Exception e)
		{
			
			System.out.println(e.toString());
			System.out.println(e.getMessage());			
		}
		
//      try
//      {
//		int c = divide(20,0);
//		System.out.println(c);
//      }
//      
//      catch(Exception e)
//      {
//    	  System.out.println("there is exception");
//      }
		
	}

}
