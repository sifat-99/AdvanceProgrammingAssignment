package cse.bubt.edu.bd;

            import java.util.Scanner;

            public class Main {
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    double totalReceipts = 0.0;

                    while (true) {
                        System.out.print("Enter hours parked (or -1 to end): ");
                        int hoursParked = scanner.nextInt();

                        if (hoursParked == -1) {
                            break;
                        }

                        double charge = calculateCharges(hoursParked);
                        totalReceipts += charge;

                        System.out.printf("Charge for current customer: $%.2f%n", charge);
                        System.out.printf("Running total of receipts: $%.2f%n", totalReceipts);
                    }

                    System.out.printf("Total receipts for yesterday: $%.2f%n", totalReceipts);
                    scanner.close();
                }

                public static double calculateCharges(int hoursParked) {
                    double charge = 2.00; // Minimum fee for up to 3 hours

                    if (hoursParked > 3) {
                        charge += 0.50 * (hoursParked - 3);
                    }

                    if (charge > 10.00) {
                        charge = 10.00; // Maximum charge for 24-hour period
                    }

                    return charge;
                }
            }