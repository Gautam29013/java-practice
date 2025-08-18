import java.util.*;

public class DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row:");
        int row = sc.nextInt();
        System.out.print("Enter a column:");
        int col = sc.nextInt();

        int[][]  numbers =  new int[row][col];

        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j < col ; j++){
                numbers[i][j]  = sc.nextInt();


            }
        }

        for(int i = 0 ; i<row ; i++) {
            for(int j = 0 ; j<col ; j++) {
                System.out.print(numbers[i][j] + " ");
                sc.close();

            }
            System.out.println();
        }
    }
}
