class TestJoin extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				System.out.println(i);
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String args[])
	{
		TestJoin t1=new TestJoin();
		TestJoin t2=new TestJoin();
		TestJoin t3=new TestJoin();
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}
}