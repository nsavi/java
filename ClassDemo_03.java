class Box
{
	int length;
	int breadth;
	int height;

	int volume()
	{
	int vol;
	vol=length*breadth*height;
	return vol;
	}
}

public class ClassDemo_03
{
	public static void main(String[] args)
	{
		Box blackbox=new Box();
		blackbox.length=10;
		blackbox.breadth=8;
		blackbox.height=8;
		int result=blackbox.volume();
		System.out.print("Vol of blackbox is:  "+result);
		Box woodbox=new Box();
		woodbox.length=10;
		woodbox.breadth=8;
		woodbox.height=6;
		int result1=woodbox.volume();
		System.out.print("Vol of woodbox is:  "+result1);
	}
}
