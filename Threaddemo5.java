class Example1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			Thread.yield();
			System.out.println("child thread"+i);
		}
	}
}

public class Threaddemo5
{
	public static void main(String[] args)
	{
		Example1 obj = new Example1();
		System.out.println(obj.getState());
		obj.start();
		System.out.println(obj.getState());
		obj.setPriority(1);
		System.out.println(obj.getName());
		obj.setName("Customer");
		System.out.println(obj.getName());
		System.out.println(obj.getId());
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread" +i);
		}
	}
}
