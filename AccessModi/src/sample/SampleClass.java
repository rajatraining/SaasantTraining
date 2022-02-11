package sample;

import demo.ClassA;

public class SampleClass{

	public static void main(String[] args) {
		
		char[][] arr = {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		
		for(int i=0 ; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr[i][j] +"  ");
			}
			System.out.println("");
		}
		System.out.println(" -------------- ");
		
		for(char[] a : arr)
		{
			for(char c : a)
			{
				System.out.print(c +"  ");
			}
			System.out.println("");
		}
		
	}
	
}
