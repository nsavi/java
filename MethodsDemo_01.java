public class MethodsDemo_01
{
	//method definition
	static int boxvolume(int length, int breadth, int height)
	//method header
	{
		int vol;
		vol = length*breadth*height;
		return vol;
		// return length*breadth*height;
	}
	
	static void printLine()
	{
		System.out.println("-------------");
	}
	
	public static void main(String[] args)
	{
		printLine();
		//method call
		int volume = boxvolume(2,3,4);//method passing 
		System.out.print("|Volume : "+volume);
		System.out.print("|");
		System.out.print("\n");
		printLine();
	}
}
