package aplication;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.LimitException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account;
		
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Holder: ");
		String holder = sc.next();
		System.out.print("Initial balance: ");
		Double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		account = new Account(number, holder, initialBalance, withdrawLimit);
		
		System.out.println();
		
		System.out.print("Enter amount for withdraw: ");
			
		try {
			Double amount = sc.nextDouble();
			System.out.println("New balance: " + account.withdraw(amount));
		} catch (LimitException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		sc.close();
	}

}
