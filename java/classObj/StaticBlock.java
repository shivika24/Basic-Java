class StaticBlock
{
	public static void main(String args[])
	{
		
		System.out.println("shivi");
	}
	static
	{
        System.out.println("shivani");//compile time errror if no main
        //System.exit(0);
	}
}