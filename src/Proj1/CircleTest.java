package Proj1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2, 3, 5);
        Circle circle2 = new Circle (5, 10, 1);
        System.out.println(circle1.match(circle2));
        System.out.println(circle1.area());
        System.out.println(circle1.length());
    }
}
