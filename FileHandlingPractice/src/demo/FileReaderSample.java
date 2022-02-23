package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderSample {

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("/Users/raja/input.txt");
			FileWriter writer = new FileWriter("/Users/raja/input2.txt");
			
			char[] content = new char[100];
					
			//reader.read(content);

			
			//System.out.println(Arrays.toString(content));
			
			
			
			BufferedReader buf = new BufferedReader(reader); 
			
			BufferedWriter buw = new BufferedWriter(writer);
			
			buw.append("Welceom to Java world ");
			buw.close();
			
			String line ="";
			
			while ((line = buf.readLine()) != null) {

				System.out.println(line);
				

			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
