package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file5_file_operations {

	public static void main(String[] args) {
		
		
		File file = new File("Foperation.txt");
		
		//create a new file
//		try
//		{
//			file.createNewFile();
//			System.out.println("your file is created");
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//2.write in to the file 
		
//		try
//		{
//			FileWriter fw = new FileWriter("Foperation.txt");
//			fw.write("hii this is my first file.....!!!! the data is updated successfully....!!!!");
//			System.out.println("data written in the file successfully");
//			fw.close();
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		//3. read the file
		
//		try
//		{
//			Scanner sc = new Scanner(file);
//			while(sc.hasNextLine())
//			{
//				String line = sc.nextLine();
//				System.out.println(line);
//			}
//			
//			sc.close();
//		}
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		//4. delete the file 
		
//		if(file.delete())
//		{
//			System.out.println("i have deleted my file..."+file.getName());
//		}
//		else
//		{
//			System.out.println("error found in deleting the file");
//		}

		
		
		//5.heck file exist or not
		
		if(file.exists())
		{
			System.out.println("file exixts!!");
			System.out.println("this name is already present you can try another one!!!");
		}
		else
		{
			System.out.println("file not exists!!!");
		}
		
//		else
//		{
//			file.createNewFile();
//			System.out.println("file successfully created!!");
//		}
		
		
		
		
		
		
		
		
	}

}
