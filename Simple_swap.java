import java.util.Scanner;

public class Simple_swap
{
	public static void main(String[] args)
	{
		System.out.println("program to swap the values of variables");
		int a , b , temp;
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter a number a:");
		a=input.nextInt();
		System.out.println("Enter a number b:");
		b=input.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("number a after swap :"+a);
		System.out.println("number b after swap :"+b);
	}
}
		
