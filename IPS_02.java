
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int i;
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num ==1 || num == 0)
        {
            System.out.print(num+" niether prime nor composite number");
        }
        else
        {
            for(i=2;i<num/2;i++)
            {
                if(num%i==0)
                {
                    System.out.print(num+" is not a prime number");
                    break;
                }
                else
                {
                    System.out.print(num+" is a prime number");
                    break;
                }
        }    }
    }
}
