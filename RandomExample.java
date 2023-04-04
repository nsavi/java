import java.lang.*;

public class RandomExample
{
	public static void main(String[] args)
	{
		//ge two random double numbers
		double x = Math.random();
		double y = Math.random();
		
		//print the numbers and print the higher one
		System.out.println("Random number 1:"+x);
		System.out.println("Random number 2:"+y);
		System.out.println("highest number 1:"+Math.max(x,y));
	}
}
