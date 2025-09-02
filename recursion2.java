
public class recursion2 {
    public static void recursion(int n , String src , String helper , String dest) {
        if(n == 1){
            System.out.println("transfer disk " + n + " from " +src +"to " +dest);
            return;
        }
        recursion(n-1 ,src,dest,helper);
        System.out.println("transfer disk " + n + " from " +src +"to " +dest);
        recursion(n-1 , helper ,src,dest);
    }
    public static void main(String[] args) {
        int n = 4;  
        recursion(n ,"S" ,"H" , "D");
    }
}
