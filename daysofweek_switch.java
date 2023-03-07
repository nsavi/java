import java.util.Scanner;

public class daysofweek_switch
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the date of the week:");
		int choice;
		choice = input.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("1.Monday");
			return;
		case 2:
			System.out.println("2.Tuesday");
			return;
		case 3:
			System.out.println("3.wednesday");
			return;
		case 4:
			System.out.println("4.Thursday");
			return;
		case 5:
			System.out.println("5.Friday");
			return;
		case 6:
			System.out.println("6.Saturday");
			return;
		case 7:
			System.out.println("7.Sunday");
			return;
		}
	}
}
