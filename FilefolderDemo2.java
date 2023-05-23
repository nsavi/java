import java.io.File;
import java.util.Scanner;
public class FilefolderDemo2
{
	public static void main(String[] args)
	{
		File ff = new File("/home/student/Documents/demo_file/inside_demo/inherit.txt");
		boolean present = ff.exists();
		if(present == false)
		try
		{
			boolean created = ff.createNewFile();
			System.out.println("Folder present : "+present);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Folder present : "+present);
		if(present == false)
		ff.mkdir();
		present = ff.exists();
		System.out.println("Folder Present:"+present);
	}
} 
