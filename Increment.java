public class Increment
{
	public static void main(String args[])
	{
		int a=11,b,c,d;
		//a=a+1
		c = a++;//post increment 
		//now c=11 ; a=a+1 , a= 12
		d= ++a;
		// now a=a+1 ,a=13 ; d=a, d =13
		//++a; //pre  increment
		//a--; //post decrement
		//--a; //pre  decrement
		
		System.out.println(" c is " +c);
		System.out.println(" a is " +a);
		System.out.println(" d is " +d);
	}
}
