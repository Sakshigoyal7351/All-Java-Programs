package file_handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class file2_Input_output_stream {

	public static void main(String[] args) {
		
		try {
		
		FileOutputStream os = new FileOutputStream("xyz.txt");
		os.write(10);
		os.write(20);
		os.write(30);
		os.write(40);
		os.write(50);
		
		os.close();

		System.out.println("data written successfully");
		

		}
		catch(IOException e)
		{
			System.out.println("exception...!!");
		}
	}

}
