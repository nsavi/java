public class ExceptionDemo1
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
		catch(Exception e)
		{
			System.err.println("Error Occured");
		}
		System.out.println(c);
		System.out.println("End of program");
	}
}
