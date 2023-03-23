class Box
{
	int length;
	int breadth;
	int height;

	void setDim(int length,int breadth,int height)
	{
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	int volume()
	{
		return length*breadth*height;
	}
}
public class Constdemo
{
	public static void main(String[] args)
	{
		Box blackbox = new Box();
		blackbox.length = 10;
		blackbox.breadth = 2;
		blackbox.height = 3;
		int w = blackbox.volume();
		System.out.print(w);
	}
}
