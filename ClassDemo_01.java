class Box
{
	int length;
	int breadth;
	int height;
}
public class ClassDemo_01
{
	public static void main(String[] args)
	{
		//box blackbox;
		//blackbox = new Box();
		Box blackbox = new Box();
		blackbox.length = 10 ;
		blackbox.breadth = 8 ;
		blackbox.height = 6 ; 
		
		System.out.println(blackbox.length);
		System.out.println(blackbox.breadth);
		System.out.println(blackbox.height);
	}
}
		
