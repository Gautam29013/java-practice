
final class MathConstants {
    public static final double PI = 3.14159;
    public static final double E = 2.71828;
}

class Shape {
    public final void calculateArea() {
        System.out.println("Generic shape - area cannot be calculated");
    }
}

class Circle extends Shape {
    private final double radius; 

    Circle(double r) {
        radius = r;
   
    }

    public void circleArea() {
        double area = MathConstants.PI * radius * radius;
        System.out.println("Circle Area = " + area);
    }

}

public class FinalDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.calculateArea();   
        c.circleArea();    
    }
}
