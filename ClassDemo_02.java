import java.util.Scanner;

class Box {
    int length;
    int breadth;
    int height;

    int volume() {
    int vol;
    
    vol = length * breadth * height;
    return vol;
    }
}

public class ClassDemo_02 {
    public static void main(String[] args) {
        Box blackbox = new Box();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length:");
        blackbox.length = input.nextInt();
        System.out.println("Enter the breadth:");
        blackbox.breadth = input.nextInt();
        System.out.println("Enter the height:");
        blackbox.height = input.nextInt();
        System.out.println("Volume of the blackbox is " + blackbox.volume());
    }
}

