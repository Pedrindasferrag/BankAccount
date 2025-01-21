package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number account: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		
		Account acc = new Account(number, name);
		if(resp == 'y') {
			System.out.print("Enter a initial deposit value: ");
			acc.setInitial(sc.nextDouble());
		}
		
		System.out.println("Account data: ");
		System.out.printf("Account: " + acc);
		System.out.println("");
		
		System.out.print("Enter a deposit value: ");
		acc.deposit(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println(acc);
		System.out.println("");
		
		System.out.print("Enter a withdraw value: ");
		acc.withdraw(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println(acc);
		System.out.println("");
		
		sc.close();
	}
}
