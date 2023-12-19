import java.util.*;

abstract class Shape {
    Scanner sc = new Scanner(System.in);
    int length;
    int width;


    abstract void area();
    abstract void perimeter();
}

class Rectangle extends Shape {
    public void area() {
         System.out.println("Enter the length : ");
        length = sc.nextInt();
        System.out.println("Enter the width : ");
        width = sc.nextInt();
        int are = length * width;
        System.out.println("The Area of the Rectangle is : : "  + are);
    }

    void perimeter() {
        int peri = 2 * (length + width);
        System.out.println("The Perimeter of the Rectangle is : " +peri);
    }
}

class Triangle extends Shape {
    int base=length;
    int height=width;
    int side1;
    int side2;

    public void area() {
        int are = (base * height) / 2;
        System.out.println("Area of the Rectangle : " + are);
    }

    void perimeter() {
         System.out.println("Enter one side of the Triangle :");
        side1 = sc.nextInt();
        System.out.println("Enter another side of the Triangle :");
        side2 = sc.nextInt();
        int peri = side1 + base + side2;
        System.out.println(" Perimeter of the Triangle : " +peri);
    }
}
// This class name should be same with the file name given by user
public class Area_Peri {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        obj1.area();
        obj1.perimeter();
        Triangle obj = new Triangle();
        obj.area();
        obj.perimeter();
    }
}
