package intermediate.dayOne;

/**
 * 
 * - Create a class called BankAccount with the following attributes:
 * account number, account holder name, and account balance.
 * - Create a constructor for the BankAccount class that initializes the
 * account number, account holder name, and account balance.
 * - Create methods to deposit and withdraw money from the account.
 * The methods should update the account balance accordingly.
 * - Create a method to display the account information, including
 * the account number, account holder name, and account balance.
 * 
 */
public class OOP {

    class BankAccount {

        private int number;
        private String name;
        private double balance;

        public BankAccount() {

        }

        public BankAccount(int number, String name, double balance) {
            this.number = number;
            this.name = name;
            this.balance = balance;
        }

        public int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public double getBalance() {
            return balance;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "BankAccount [number=" + number + ", name=" + name + ", balance=" + balance + "]";
        }

        public String deposit(int amount) {

            this.setBalance(amount);
            return "Deposit Done! Please see your balance!";

        }

        public int withdraw(int amount) {

            if (this.getBalance() >= amount) {
                return amount;
            } else {
                return 0;
            }

        }

    }

    public static void main(String[] args) {

        OOP oop = new OOP();

        OOP.BankAccount bankAccount = oop.new BankAccount(757, "Ricardo Ferreira", 100.00);

        System.out.println(bankAccount);


    }
}
