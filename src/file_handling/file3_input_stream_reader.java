package file_handling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class file3_input_stream_reader {

	public static void main(String[] args) {
		try
		{
			FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\list.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(file));
			
			String line;
			while((line=reader.readLine())!=null)
			{
				System.out.println(line);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
