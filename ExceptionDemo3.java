public class ExceptionDemo3
{
	public static void main(String[] args)
	{
		int a=10,b=0;
		int c= 0;
		try
		{
			int arr[]= null;
			System.out.println(arr[1]);
			c=a/b;
			//throw
		}
		catch(NullPointerException e)
		{
			System.err.println("NullPointerException Error Occured");
		}
		catch(ArithmeticException e)
		{
			System.err.println("ArithmeticException Error Occured");
		}
		System.out.println(c);
		System.out.println("End of program");
	}
}
