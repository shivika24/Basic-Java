class NewThread extends Thread
{
    NewThread()
    {
    	super("Child thread");
    	start();
    }
    public void run()
    {
    	try
    	{
    		for(int i=0;i<5;i++)
    		{
    			System.out.println("child thread:"+i);
    			Thread.sleep(500);
    		}
    	}
    	catch(InterruptedException ie)
    	{
    		System.out.println(ie);
    	}
    	System.out.println("exit child thread");
    }
}
public class NewThreadMain
{
	public static void main(String args[])
	{
		NewThread t=new NewThread();
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Main Thread:"+i);
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Exit main thread ");
	}
}