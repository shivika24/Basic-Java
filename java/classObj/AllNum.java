import java.util.Scanner;
class AllNum
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int n;
       System.out.println("enter the num:");
       n=s.nextInt();
       Strong st=new Strong(n);
       st.str();
       st.arms();
    }
}
class Strong
{
    public int x;
    Strong(int a){x=a;}
    void str()
    {
    	int t=x,strNum=0;
    	while(t!=0)
    	{
    		int num=t%10;
    		int fac=1;
    		for(int i=1;i<=num;i++)
    		 fac*=i;
                strNum+=fac;
    		t/=10;
    	}
    	if(strNum==x)
    		System.out.println("NUmber is strong");
    	else
    		System.out.println("NUmber is not strong");
    }
    void arms()
    {
    	int t=x,count=0;
    	while(t!=0)
    	{
           t/=10;
           count++;
    	}
    	t=x;int sum=0;
    	while(t!=0)
    	{
            sum+=Math.pow(t%10,count);
            t/=10;
    	}
    	if(sum==x)
    		System.out.println("NUmber is Armstrong");
    	else
    		System.out.println("NUmber is not Armstrong");
    }
}