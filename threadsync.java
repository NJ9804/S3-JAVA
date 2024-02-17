class first extends Thread				
{								
	public synchronized void display(String name)	
	{
    		for(int i=1;i<=5;i++)
    		{
        			System.out.println(name+i);
    		}
	}
    
}

class second extends first
{
	String name;
	first fobj;
	second(first f)
	{
    		fobj=f;
	}
	public void run()
	{
    		fobj.display(name);
	}
}

class threadsync
{
	public static void main(String str[])
	{
    		first f=new first();
    		second s1=new second(f);
    		s1.name="childThread1 ";
    		second s2=new second(f);
    		s2.name="childThread2 ";
    		second s3=new second(f);
    		s3.name="childThread3 ";
    		s1.start();
    		s2.start();
   		s3.start();
	}
}

