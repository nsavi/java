//write a program using Left shift operators

import java.util.Scanner;
public class Left_shift
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num1 , num2;
		
		System.out.println("Enter the number : ");
		num1=input.nextInt();
		
		System.out.println("Enter the Base : ");
		num2=input.nextInt();
		
		System.out.println("Left shift value : " +(num1<<num2));
	}
}
	
