class Example1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("child thread"+i);
		}
	}
}

public class Threaddemo1
{
	public static void main(String[] args)
	{
		Example1 obj = new Example1();
		obj.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread"+i);
		}
	}
}

