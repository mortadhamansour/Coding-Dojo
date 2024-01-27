public class BankTest {
    public static void main(String[] args) {
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount(1000, 500);
        BankAccount account2 = new BankAccount(1500, 1000);
        BankAccount account3 = new BankAccount(2000, 2000);

        // Deposit Test
        account1.deposit(200, "checking");
        displayBalance(account1);
        account2.deposit(300, "savings");
        displayBalance(account2);
        account3.deposit(400, "checking");
        displayBalance(account3);

        // Withdrawal Test
        account1.withdraw(150, "savings");
        displayBalance(account1);
        account2.withdraw(200, "checking");
        displayBalance(account2);
        account3.withdraw(3000, "savings"); // Attempting to withdraw more than balance
        displayBalance(account3);

        // Static Test
        System.out.println("Number of bank accounts: " + BankAccount.getAccounts());
        System.out.println("Total money in all accounts: $" + BankAccount.getTotalMoney());
    }

    private static void displayBalance(BankAccount account) {
        System.out.println("Checking balance: $" + account.getCheckingBalance());
        System.out.println("Savings balance: $" + account.getSavingsBalance());
        System.out.println("Total balance: $" + account.getBalance());
        System.out.println();
    }
}
