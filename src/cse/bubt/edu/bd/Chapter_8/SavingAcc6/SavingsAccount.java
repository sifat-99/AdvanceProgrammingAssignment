package cse.bubt.edu.bd.Chapter_8.SavingAcc6;
public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double balance) {
        savingsBalance = balance;
    }

    public void calculateMonthlyInterest() {
        double interest = savingsBalance * annualInterestRate / 12;
        savingsBalance += interest;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}