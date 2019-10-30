class MyThread3 extends Thread
{
    public void run()
    {
    	System.out.println("Extending Thread class");
    }
}
public class MyThreadMain
{
   public static void main(String args[])
   {
   	MyThread3 mt =new MyThread3();
   	mt.start();
   }
}