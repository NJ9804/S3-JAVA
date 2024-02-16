
class Primenum
{
	public static void main(String args[])
	{
		int i,j,flag;
		int a=2,b=25;
	
		for(i=a;i<=b;i++)
		{
			flag=0;
			for(j=2;j<=i/2;j++)
			{
				if (i%j==0)
				{
					flag=1;
					break;
				}
			}
		
			if(flag==0)
			{
				
				System.out.println(i+" is prime");
			}
		}
	}
}
