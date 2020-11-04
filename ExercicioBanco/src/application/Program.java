package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter account number: ");	
		int number = sc.nextInt();
		
		
		System.out.print("Enter account holder: ");
		String holder = sc.next();
		
		System.out.print("Is there an initial deposit  (y/n)? ");	
		char init = sc.next().charAt(0);
		
		double firstDeposit = 0;
		
		if(init != 'n'){
			System.out.print("Enter with a initial deposit: ");
			firstDeposit = sc.nextDouble();
		}
		
		System.out.println("Account data: \n"
				+ "Account " + number + ", holder: " + holder + ", Balancer $ " +  firstDeposit);
		
		Bank bank = new Bank(number, holder, firstDeposit);
		
		
		//deposito
		System.out.println("-------------------------------------");
		System.out.print("Enter a deposit value: $ ");
		double dep = sc.nextDouble();
		
		bank.deposit(dep);
		
		System.out.println("Account data: \n"
				+ "Account " + number + ", holder: " + holder + ", Balancer $ " +  bank.getBalance());
		
		
		//saque (todo saque tem uma taxa de 5)
		System.out.println("-------------------------------------");
		System.out.print("Enter a withdraw value: ");
		double wd = sc.nextDouble();
		bank.withDraw(wd);
		
		System.out.println("Account data: \n"
				+ "Account " + number + ", holder: " + holder + ", Balancer $" +  bank.getBalance());

		sc.close();
	}

}
