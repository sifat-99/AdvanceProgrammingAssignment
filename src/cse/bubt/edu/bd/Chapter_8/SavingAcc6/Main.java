package cse.bubt.edu.bd.Chapter_8.SavingAcc6;
public class Main {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);

        for (int i = 0; i < 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        System.out.printf("Saver1: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver2: $%.2f%n%n", saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("Saver1: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver2: $%.2f%n", saver2.getSavingsBalance());
    }
}
