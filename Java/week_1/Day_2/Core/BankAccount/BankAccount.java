public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney;

    // CONSTRUCTOR
    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        accounts++;  // Increment the accounts count
        totalMoney += (checkingBalance + savingsBalance);  // Add initial balance to totalMoney
    }

    // GETTERS
    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }

    public static int getAccounts(){  // Make the getAccounts method static
        return accounts;
    }

    public static double getTotalMoney(){  // Make the getTotalMoney method static
        return totalMoney;
    }

    // METHODS
    public void deposit(double amount, String accountType){
        // Users should be able to deposit money into their checking or savings account
        if ("checking".equalsIgnoreCase(accountType)) {
            checkingBalance += amount;
        } else if ("savings".equalsIgnoreCase(accountType)) {
            savingsBalance += amount;
        }
        totalMoney += amount;
    }

    public void withdraw(double amount, String accountType){
        // Users should be able to withdraw money from their checking or savings account
        // Do not allow them to withdraw money if there are insufficient funds
        if ("checking".equalsIgnoreCase(accountType) && checkingBalance >= amount) {
            checkingBalance -= amount;
            totalMoney -= amount;
        } else if ("savings".equalsIgnoreCase(accountType) && savingsBalance >= amount) {
            savingsBalance -= amount;
            totalMoney -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal");
        }
    }

    public double getBalance(){
        // Display total balance for checking and savings of a particular bank account
        return checkingBalance + savingsBalance;
    }
}