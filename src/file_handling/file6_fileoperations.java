package file_handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class file6_fileoperations {

	public static void main(String[] args) {
		
		
		String filename;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the file name for creating a new file!!!");
		filename =sc.next();
		
		File file = new File("C:\\Users\\LENOVO\\Desktop\\"+filename+".txt");
		
		try
		{
			
//			if(file.createNewFile())
//			{
//				System.out.println("your file created successfully");
//			}
//			else
//			{
//				if(file.exists())
//				{
//					System.out.println("file aready exists!!");
//				}
//			}
			
			if(file.exists())
			{
				System.out.println("file exists!!");
				System.out.println("you can try with another name!!");
			}
			
			else
			{
				file.createNewFile();
				System.out.println("file created successfully");
			}
			
			
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
