import java.util.Scanner;

public class Product {
    public static int ProductTwoNum(int a , int b) {

        return a * b;
        
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
            System.out.println("Product of two num:" + ProductTwoNum(a , b));
        
        sc.close();
        
    }
}
