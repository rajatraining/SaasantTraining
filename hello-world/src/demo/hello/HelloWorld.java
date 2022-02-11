package demo.hello; // Package section 

import java.util.Scanner;

// Import section

public class HelloWorld { // Class

	public static void main(String[] args) {

		HelloWorld hw = new HelloWorld();

		Scanner sc = new Scanner(System.in);

		int total = 0; 
		
		for(int i = 1;i <= 5;i++)
		{
			System.out.println("Enter the x value ");
			int x = sc.nextInt();
			System.out.println("Enter the y value");
			int y = sc.nextInt();

			int sum1 = hw.sum(x, y);

			System.out.println("sum"+i+" - "+sum1);

			total = total + sum1;
			
			System.out.println("Total value is "+total);

		}
		
		float avg = total/5; 
		System.out.println("Average :"+avg);

	}

	int sum(int x, int y) // Arguments . attributes
	{

		int z = x + y;
		System.out.println(z);

		return z;

	}

}
