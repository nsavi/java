import java.io.*;
import java.lang.*;
class Box{
    int length, breadth, height;
    void setDim(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }
    Box(int l, int b, int h){
        length=l;
        breadth=b;
        height=h;
    }
    Box(){
        length=-1;breadth=-1;height=-1;
    }
    Box (int l){
        length=breadth=height=l;
    }
    int volume(){return length*breadth*height;}
}
public class Overloadingdemo_03
{
    public static void main(String[] args){
        Box b0=new Box();
        b0.setDim(10,8,6);
        Box b1=new Box();
        Box b2=new Box(10);
        Box b3=new Box(5,4,3);
        System.out.println("vol of b0 is" + " " + b0.volume());
    }
}
