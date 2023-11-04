import java.util.Scanner;

public class atm {
    int flag = -1;
    double amount, bal = 0, dep;
    Scanner c = new Scanner(System.in);

    public void checkBal() {
        System.out.println("Your bank balance is: Rs. " + bal);
    }

    public void withdraw() {
        System.out.print("Enter amount to be withdrawn: ");
        double amount = c.nextDouble();
        if (amount > bal) {
            System.out.println("Transaction Failed. Insufficient Bank Balance");
        } else {
            System.out.println("Amount debited. Collect your cash.");
            bal = bal - amount;
        }
    }

    public void deposit() {
        System.out.print("Enter amount to be deposited: ");
        dep = c.nextDouble();
        bal += dep;
    }

    public void quit() {
        System.out.println("Visit Again.");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        atm user = new atm();
        char cont = 'y';
        System.out.println("WELCOME TO THE ATM!");
        System.out.println("Please insert your card.");
        System.out.println();
        while (cont == 'y' || cont == 'Y') {
            System.out.println("Choose the desired function:");
            System.out.println("Press 1 to Check Balance.");
            System.out.println("Press 2 for Withdrawal.");
            System.out.println("Press 3 for Deposit.");
            System.out.println("Press 4 to Quit.");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    user.checkBal();
                    System.out.print("\nDo you want to continue? Y/N : ");
                    cont = s.next().charAt(0);
                    System.out.println();
                    break;
                case 2:
                    user.withdraw();
                    System.out.print("\nDo you want to continue? Y/N : ");
                    cont = s.next().charAt(0);
                    System.out.println();
                    break;
                case 3:
                    user.deposit();
                    System.out.print("\nDo you want to continue? Y/N : ");
                    cont = s.next().charAt(0);
                    System.out.println();
                    break;
                case 4:
                    user.quit();
                    cont = 'n';
                    break;
                default:
                    System.out.println("Please try again.");
                    break;
            }

        }
        System.out.println("THANK YOU!!!");
        s.close();
    }
}
