import java.util.Scanner;

class Box
{
	int length;
	int breadth;
	int height;

	void setdim(int l,int b,int h)
	{
		length = l;
		breadth = b;
		height = h;
	}

	int volume()
	{
		return length*breadth*height;
	}
}
public class ClassDemo_04
{
	public static void main(String[] args)
	{
		Box blackbox = new Box();
		blackbox.setdim(10,8,6);
		Box woodenbox = new Box();
		woodenbox.length = 10 ;
		woodenbox.breadth = 20 ;
		woodenbox.height = 5 ;
		int w = woodenbox.volume();
		System.out.println(w);
	}
}
