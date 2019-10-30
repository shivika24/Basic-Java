import java.lang.*;
class alive implements Runnable
{
   String name;
   Thread t;
   alive(String ThreadName)
   {
   	name=ThreadName;
   	t=new Thread(this,name);
   	System.out.println("N T:"+name);
   }
   public void run()
   {
   	try
   	{
   		for(int i=0;i<2;i++)
   		{
   			System.out.println(name+i);
   			Thread.sleep(1000);
   		}
   	}
   	catch(Exception e)
   	{
   		System.out.println("name:"+e);
   	}
   }
}
public class Alivecode
{
	 public static void main(String[] args) {
		alive t1=new alive("one");
		alive t2=new alive("two");
		alive t3=new alive("three");
		System.out.println(t1.t.isAlive());
		System.out.println(t2.t.isAlive());
		System.out.println(t3.t.isAlive());
        t1.t.start();
        System.out.println(t1.t.isAlive());
        try
        {
        	t1.t.join();
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        t2.t.start();
        System.out.println(t2.t.isAlive());
        try
        {
        	t2.t.join();
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        t3.t.start();
        System.out.println(t3.t.isAlive());
        try
        {
        	t3.t.join();
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        System.out.println(t1.t.isAlive());
        System.out.println(t2.t.isAlive());
        System.out.println(t3.t.isAlive());
	}
}