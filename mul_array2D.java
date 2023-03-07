import java.util.Scanner;

public class mul_array2D
{
	public static void main(String[] args)
	{
		int a[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		int b[][]= {{9,8,7},
					{6,5,4},
					{3,2,1}};
//creating another matrix to
 store the sum of two matrices
		int c[][] = new int[3][3];
//adding and printing multiplicationof 2 matrices
		for(int i = 0;i<3;i++)
		{
        	for(int j = 0;j<3;j++)
        	{
            	c[i][j] = a[i][j]*b[i][j];
            	System.out.print(c[i][j]+" ");
         	}
         	System.out.println();//new line
		}
	}
}
