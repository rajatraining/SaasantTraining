package demo;

public class MultiMain {

	public static void main(String[] args) {
		
		/**
		 * 
		 * 1. Take a String
		 * 2. Print it in a paper
		 * 3. Display it in a main screen
		 * 4. Mail me the String
		 * 
		 * **/
		
		/**
		 * 3 ways to create a thread
		 * 1. Extends Thread
		 * 2. Implements runnable 
		 * 3. Using anonymous class
		 * 
		 * **/
		
		
		PrintingThread pt = new PrintingThread(); // Subclass of Thread
		
		PrintingThread pt1 = new PrintingThread();
		
		pt1.setName("printThread-1-sample");
		
		Thread dt = new Thread( new DisplayThread()); // Implements Runnable
		
		
		Thread mt = new Thread(new Runnable() {  // Ananymous Class

			@Override
			public void run() {
				
				

				for(int i=0; i<10; i++)
				{
				System.out.println("I am mailing..!"+i);
				
				pt1.printMe("mt");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				
			}
			
		}); 
		
		
		Thread mt1 = new Thread(new Runnable() {  // Ananymous Class

			@Override
			public void run() {
				
				

				for(int i=0; i<10; i++)
				{
				System.out.println("I am mailing..!"+i);
				
				pt1.printMe("mt1");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				
			}
			
		});
		
		
		pt.start();
		
		pt1.setDaemon(true);
		pt1.start();
		
		dt.start();
		mt.start();
		mt1.start();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
