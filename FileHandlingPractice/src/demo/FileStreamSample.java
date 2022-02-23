package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileStreamSample {

	public static void main(String[] args) {
		
		// Byte Input and Output Stream 
		// Reader and Writer 
		
		
		
		try {
			int BUFFER_SIZE = 100; 
			
			InputStream ipStream = new FileInputStream("/Users/raja/input.txt");
			 
			OutputStream opStream = new FileOutputStream("/Users/raja/input1.txt");
			
			
			byte[] buffer = new byte[BUFFER_SIZE];
	        
			int bytesRead = -1;
	 
	        ipStream.read(buffer);
	
	         
	        System.out.println(Arrays.toString(buffer));
	        
	       
	        
	        opStream.write(buffer);
	        
	        
		
		
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		

	}

}
