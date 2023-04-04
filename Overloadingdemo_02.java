import java.io.*;
import java.lang.*;
public class Overloadingdemo_02
{
    static void test(){System.out.println("Test method with no argument");}
    static void test(int a){System.out.println("1 arguments");}
    static void test(int a,int b){System.out.println("2 arguments");}
    public static void main(String[] args){
        test();
        test(3,4);
        test(10);
    }
}
			
