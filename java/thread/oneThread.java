public class oneThread extends Thread { 
	public void run() 
	{ 
		System.out.println("geeks "); 
		try { 
			Thread.sleep(300); 
         // Thread.stop();
		} 
		catch (InterruptedException ie) { 
		} 
		System.out.println("forgeeks "); 
	} 
	public static void main(String[] args) 
	{ 
		oneThread c1 = new oneThread(); 
		oneThread c2 = new oneThread(); 
		c1.start(); 
		/*try
		{
			c1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		c2.start(); 
		System.out.println(c1.isAlive()); 
		System.out.println(c2.isAlive()); 
	} 
} 
