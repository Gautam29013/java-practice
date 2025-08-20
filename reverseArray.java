public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length;

        int rev[] = new int[n];
        for(int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 - i];
        }

        System.out.println("Reversed Array:");
        for(int x : rev) {
            System.out.print(x + " ");
        }
    }
}





