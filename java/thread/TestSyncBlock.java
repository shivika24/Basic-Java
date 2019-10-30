class Table
{
	void printTable(int n)
	{
		Synchronized(this)
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(2*i);
				try
				{
					Thread.sleep(500);
				}
				catch(InterruptedException ie)
				{
					System.out.println(e);
				}
			}
		}
	}
}
class MyThread1 extends Thread
{
   Table t;
   MyThread1(Table t)
   {
   	this.t=t;
   }
   public void run()
   {
   	t.printTable(5);
   }
}
class MyThread2 extends Thread
{
   Table t;
   MyThread2(Table t)
   {
   	this.t=t;
   }
   public void run()
   {
   	t.printTable(3);
   }
}
public class TestSyncBlock
{
   public static void main(String args[])
   {
   	Table obj=new Table();
   	MyThread1 t1=new MyThread1(obj);
   	MyThread2 t2=new MyThread2(obj);
   	t1.start();
   	t2.start();
   }
}