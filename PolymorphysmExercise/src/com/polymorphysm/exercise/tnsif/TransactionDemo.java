package com.polymorphysm.exercise.tnsif;
import java.util.Scanner;

public class TransactionDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select Transaction Type:");
        System.out.println("1. Bank to Bank");
        System.out.println("2. Phone Pay");
        System.out.println("3. ATM");
        System.out.print("Enter choice (1-3): ");
        
        int choice = sc.nextInt();
        
        switch (choice) {
        case 1:
            sc.nextLine(); // consume newline
            System.out.print("Enter IFSC code: ");
            String ifsc = sc.nextLine();
            System.out.print("Enter account number: ");
            long accNo = sc.nextLong();
            System.out.print("Enter amount: ");
            int amount1 = sc.nextInt();
            Transactions.Transaction(ifsc, accNo, amount1);
            break;

        case 2:
            System.out.print("Enter phone number: ");
            long phoneNo = sc.nextLong();
            System.out.print("Enter amount: ");
            int amount2 = sc.nextInt();
            Transactions.Transaction(phoneNo, amount2);
            break;

        case 3:
            System.out.print("Enter ATM PIN: ");
            int pin = sc.nextInt();
            System.out.print("Enter amount: ");
            int amount3 = sc.nextInt();
            Transactions.Transaction(pin, amount3);
            break;

        default:
            System.out.println("Invalid choice!");
    }

		
		
	}
}
