class Swapvalues
{
	static void Swapval(int m,int n)
	{
		int temp = m;
		m = n; 
		n = temp;
		System.out.println("m after swap is "+m+" and n after swap is "+n);
	}
public static void main(String args[])
	{
		int m=9,n=8;
		Swapval(m,n);
	}
}
