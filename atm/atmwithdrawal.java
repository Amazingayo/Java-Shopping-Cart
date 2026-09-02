package atm;

public class atmwithdrawal {
    public static void main(String[] args) {
        double balance = 250000;
        double withdrawal = 15000;

        if (withdrawal < 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (withdrawal > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance = balance - withdrawal;
            System.out.println("Withdrawal successful");
            System.out.println("Amount withdrawn: " + withdrawal);
            System.out.println("Remaining balance: " + balance);
        }
    }
}
