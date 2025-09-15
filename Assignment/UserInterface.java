import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account(1001, "John Doe", 5000.0, "john@example.com", "1234567890");
        while (true) {
            System.out.println("\n1. Display Account Details");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Update Contact Details");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    acc.displayAccountDetails();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    break;
                case 4:
                    System.out.print("Enter new email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter new phone: ");
                    String phone = sc.nextLine();
                    acc.updateContactDetails(email, phone);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}