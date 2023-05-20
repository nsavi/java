class Example1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(2000);
				System.out.println("Child thread" + i);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class Threaddemo7
{
	public static void main(String[] args) throws InterruptedException
	{
		Example1 obj = new Example1();
		System.out.println(obj.getState());
		obj.start();
		obj.interrupt();
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread" + i);
		}
	}
}
