public class fibonacciSequance {
    public static void printfb(int a , int b , int n) {
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printfb(b, c, n-1);
    }
    public static void main(String[] args) {
        int a = 0 , b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printfb(a, b, n-2);
    }
}
