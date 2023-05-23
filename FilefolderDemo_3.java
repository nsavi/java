import java.io.File;
import java.util.Scanner;
public class FilefolderDemo_3
{
	public static void main(String[] args)
	{
		File ff = new File("/home/student/Documents/demo_file/inside_demo/inherit.txt");
		ff.delete();
		boolean present = ff.exists();
		System.out.println("File present:" + present);
		
	}
} 
