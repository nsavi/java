import java.io.File;
import java.util.Scanner;
public class FilefolderDemo4
{
	public static void main(String[] args)
	{
		File ff = new File("/home/student/Documents/demo_file/inside_demo/demo.txt");
		File obj = new File("/home/student/Documents/demo_file/inside_demo/notdemo.txt");
		boolean renameobj = ff.renameTo(obj);
		System.out.println("File rename:" + renameobj);
		
	}
} 
