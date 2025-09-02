abstract class Shape {
    String name;

    Shape (String name){
        this.name = name;
    }
    double area() { return 0.0;}
}

public class Rectangle extends Shape {
    double length, breadth; 

    Rectangle(double length, double breadth) {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double area()  {
        return (length * breadth);
    }
}

 class Circle extends Shape {
    double radius;
    
    Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    @Override 
    double area() {
        return (Math.PI * radius * radius);
    }
}

    

// class Shape
// {
//     public static void main(String[] args) {
//         Shape c= new Circle(2.0);
//         System.out.println(c.area());
//     }
// }