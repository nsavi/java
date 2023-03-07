//write a program using Right shift operators

import java.util.Scanner;
public class Right_shift
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num1 , num2;
		
		System.out.println("Enter the number : ");
		num1=input.nextInt();
		
		System.out.println("Enter the Base : ");
		num2=input.nextInt();
		
		System.out.println("Right shift value : " +(num1>>num2));
	}
}
		
		
		
