public class ExceptionDemo2
{
	public static void main(String[] args)
	{
		int a=10,b=0;
		int c= 0;
		try
		{
			c = a/b;
			//throw
		}
		catch(ArithmeticException e)
		{
			System.err.println("ArithmeticException Error Occured");
		}
		System.out.println(c);
		System.out.println("End of program");
	}
}
