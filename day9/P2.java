package p2;
import java.util.*;
import p1.Circle;

class Circle_area{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Circle circle = new Circle(sc.nextInt());
		System.out.println("Enter the radius:");
        System.out.println("The area of the circle is " + circle.getArea());
    }
}
