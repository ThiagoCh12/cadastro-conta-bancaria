package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		System.out.println("================= BANKER =================");
			System.out.print("Enter your name: ");
			String name = sc.nextLine();
			System.out.print("Enter your number account: ");
			int numberAccount = sc.nextInt();
			Account holder = new Account(numberAccount, name);
			
			do{
				System.out.print("Do you want to make a initial deposit?\n "
								+ "1 - YES | 2 - NOT: ");
				choice = sc.nextInt();
				
			}while(choice != 1 && choice != 2);
			
			if(choice == 1) {
				System.out.print("Inform the value to deposit: ");
				double amount = sc.nextDouble();
			    holder.deposit(amount);		
			}
			printAccountDetails(holder);
			
			int option;
			do {
				System.out.println("\nChoose an option:");
	            System.out.println("1 - Deposit");
	            System.out.println("2 - Withdraw");
	            System.out.println("3 - Change name holder");
	            System.out.println("4 - Show account details");
	            System.out.println("5 - Exit");
	            option = sc.nextInt();
	            switch(option){
	            	case 1:
	            		System.out.println("Enter deposit amount: ");
	            		double deposit = sc.nextDouble();
	            		if(holder.deposit(deposit)) {
	            			System.out.println("Deposit successful!");
	            			printAccountDetails(holder);
	            		}else {
	            			System.out.println("Invalid deposit amount.");
	            		}
	            		break;
	            	case 2:
	            		System.out.println("Enter withdraw amount: ");
	            		double withdraw = sc.nextDouble();
	            		if(holder.withdraw(withdraw)) {
	            			System.out.println("Withdraw successful!");
	            			printAccountDetails(holder);
	            		}else {
	            			System.out.println("Invalid withdraw amount.");
	            		}
	            		break;
	            	case 3:
	            		sc.nextLine();
	            		System.out.println("Enter your name: ");
	            		name = sc.nextLine();
	            		holder.setName(name);
	            		printAccountDetails(holder);
	            		break;
	            	case 4:
	            		printAccountDetails(holder);
	            		break;
	            	case 5:
	            		System.out.println("Exiting...");
	            		break;
	            	default:
	            		System.out.println("Invalid option. Try again.");
	            }
			}while(option != 5);

	}

	private static void printAccountDetails(Account holder) {
		System.out.println("\nACCOUNT DETAILS:");
		System.out.printf("Number account: %d\nName holder: %s\nAccount balance: %.2f\n", holder.getNumberAccount(),
				holder.getName(), holder.getBalance());
	}

}
