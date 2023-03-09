import java.util.Scanner;

public class MethodsDemo_02
{
	//method definition
	static double cir(int r)
	//method header
	{
		double cir;
		cir = 2*3.14*r;
		return cir;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		int radius;
		radius = input.nextInt();
		double circumference = cir(radius);
		System.out.print("Volume : "+circumference);
		System.out.print("\n");
	}
}
