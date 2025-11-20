class shape{
    Abstract void area(){
        System.out.println("Area of shape");
    }
    Abstract void perimeter(){
        System.out.println("Perimeter of shape");
    }

class Abstract {
    public static void main(String args[]);
    shape shape1 = new circle();
    shape1.area();
    shape shape2 = new rectangle();
    shape.area();

      
}