package file_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file4_bufferReader {

	public static void main(String[] args) throws IOException {
		
		
		FileReader freader = new FileReader("C:\\Users\\LENOVO\\Desktop\\list.txt");
		BufferedReader breader = new BufferedReader(freader);
		
		int character;
		
		while((character=breader.read())!=-1)
		{
			System.out.print((char)character);
		}
		
		breader.close();
		freader.close();

	}

}
