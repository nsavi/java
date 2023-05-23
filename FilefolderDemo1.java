import java.io.File;
import java.util.Scanner;
public class FilefolderDemo1
{
	public static void main(String[] args)
	{
		File ff = new File("/home/student/Documents/demo_file/inside_demo");
		boolean present = ff.exists();
		System.out.println("Folder present : "+present);
		if(present == false)
		ff.mkdir();
		present = ff.exists();
		System.out.println("Folder Present:"+present);
	}
} 
