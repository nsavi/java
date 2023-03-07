 import java.util.Scanner;
 public class starExample_04
 {
 	public static void main(String[] args)
 	{
 		int i,j;
 		for(i=0;i<6;i++)
 		{
 			for(j=0;j<6;j++)
 			{
 				if(i==2&&j==3)
 					break;
 				if(i==3&&j==3)
 					break;
 				System.out.print("* ");

 			}
 			System.out.print("\n");
 		}
 	}
 }
