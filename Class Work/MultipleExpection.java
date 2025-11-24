public class MultipleExpection{
    public static void main(String[] args){
        try{
            int a[]=new int[5];
            System.out.println(a[10]);
        }
              
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch(NumberFormatException e){
            System.out.println("Parent Exception");
        }
        System.out.println("Rest of the code");
    }
} 