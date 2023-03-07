import java.util.Scanner;

public class Assignment
{
	public static void main(String[] args)
	{
		System.out.println("program using Assignment operator");
		int num1 , num2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		num1=input.nextInt();
		System.out.println("ENter another number:");
		num2=input.nextInt();
		num1+=10; //num1=num1+10
		num2*=10; //num2=num2*10
		System.out.println("Value of num1 ="+num1);
		System.out.println("Value of num2 ="+num2);
	}
}
