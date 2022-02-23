package demo;

public class PrintingThread extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<10; i++)
		{
		System.out.println("I am printing..!"+i+ this.getName());
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	public synchronized static void printMe(String name)
	{
		for(int i=0; i<10; i++)
		{
		System.out.println("I am printing Method samle..!"+i+" -- "+name);
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
