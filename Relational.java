import java.util.Scanner;

public class Relational
{
	public static void main(String[] args)
	{
		System.out.println("program using relational operator");
		int a , b;
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter a number a:");
		a=input.nextInt();
		System.out.println("Enter a number b:");
		b=input.nextInt();
		System.out.println("a == b  :"+(a == b));
		System.out.println("a != b  :"+(a != b));
		System.out.println("a > b   :"+(a > b));
		System.out.println("a < b   :"+(a < b));
		System.out.println("a >= b  :"+(a >= b));
		System.out.println("a <= b  :"+(a <= b));
	}
}
