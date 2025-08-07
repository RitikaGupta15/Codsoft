package Task3_CurrencyConverter;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double usdToInr = 83.10;
        double eurToInr = 90.25;
        double gbpToInr = 105.50;

        System.out.println("----- Currency Converter -----");
        System.out.println("1. USD to INR");
        System.out.println("2. EUR to INR");
        System.out.println("3. GBP to INR");
        System.out.print("Choose option (1-3): ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        double converted = 0;

        if (choice == 1) {
            converted = amount * usdToInr;
           System.out.printf("INR: %.2f INR\n", converted);

        } else if (choice == 2) {
            converted = amount * eurToInr;
           System.out.printf("INR: %.2f INR\n", converted);

        } else if (choice == 3) {
            converted = amount * gbpToInr;
            System.out.printf("INR: %.2f INR\n", converted);

        } else {
            System.out.println("Invalid option selected.");
        }

        sc.close();
    }
}

