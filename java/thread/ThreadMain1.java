 class MyThread1 implements Runnable
{
   Thread t;
   MyThread1()
   {
   	t=new Thread(this,"DemoThread");
   	System.out.println(t.getName());
   	t.start();
   }
   public void run()
   {
   	try
   	{
   		for(int i=0;i<5;i++)
   		{
   			System.out.println(t.getName()+":"+i);
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
public class ThreadMain1
{
	public static void main(String args[])
	{
		MyThread1 mt=new MyThread1();
		try
		{
			for(int i=0;i<5;i++)
   		   {
   			System.out.println("Main Threa:"+i);
   			Thread.sleep(1000);
   		   }
		}
		catch(InterruptedException ie)
		{
			System.out.println("Main:"+ie);
		}
		System.out.println("mainExit");
	}
} 
