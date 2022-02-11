package demo;

public class ClassB  {

	String varB= "Am from ClassB" ; // Global Variable 
	
	void printMeFromB() // Default Access Modifiers 
	{
		ClassA classA = new ClassA(); 
		//classA.
		
		System.out.println("Am printing from B");
	}
}
