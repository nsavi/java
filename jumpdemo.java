//jump statements
 import java.util.Scanner;
 public class jumpdemo
 {
 	public static void main(String[] args)
 	{
 		int n;
 		Scanner reader=new Scanner(System.in);
 		System.out.print("Enter a number :");
 		n=reader.nextInt();
 		while(n>=0)
 		{
 			if(n%10==0)
 			{
 				System.out.print(n);
 				break;
 			}
 			n--;
 		}
 	}
 }
