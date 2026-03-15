import java.io.DataInputStream;
import java.io.IOException;

class BankOperation {
    int balance = 0;

    public void Deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Amount must be greater than 0.");
        }
    }

    public void Withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance (" + balance + ").");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        }
    }

    public void Display() {
        System.out.println("Current balance: " + balance);
    }
}

public class Bank {

    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(System.in);
        BankOperation obj = new BankOperation();
        int ch, amt;

        while (true) {
            System.out.println("\nMenu:\n1. Deposit\n2. Withdraw\n3. Display balance\n4. Exit");
            System.out.print("Enter choice: ");
            ch = Integer.parseInt(in.readLine());

            switch (ch) {
                case 1:
                    System.out.print("Enter amount: ");
                    amt = Integer.parseInt(in.readLine());
                    obj.Deposit(amt);
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    amt = Integer.parseInt(in.readLine());
                    obj.Withdraw(amt);
                    break;
                case 3:
                    obj.Display();
                    break;
                case 4:
                    System.out.println("Exiting.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
                    break;
            }
        }
    }
}
