import java.lang.*;
class MyThread implements Runnable
{
	public void start()           //we cnat change the behaviour of inbuilt function of thread
	{
		System.out.println("Thread Started");
	}
	public void run()
	{
		
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Child:"+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
			System.out.println("Exiting Child Thread");
		}
	}
}
public class ThreadMain
{
	public static void main(String args[])
	{
		MyThread mt=new MyThread();
		Thread t=new Thread(mt);
		Thread t2=new Thread(mt);
		t.start();  
		t2.start();
		//t.run();
		//mt.run();
		//t.run();
		//t2.run();
	}
}