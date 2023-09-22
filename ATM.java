package atm_interface;

import java.util.Scanner;

class Atm_interface{
	 float Balance;
	 int pin = 567;
	 
	 public void checkpin() {
		 System.out.println("Enter your pin: ");
		 Scanner sc = new Scanner(System.in);
		 
		 int enterpin = sc.nextInt();
		 
		 if (enterpin==pin) {
			Menu();
		} else {
			System.out.println("Invalid Pin");
		}
	 }
	 
	 public void Menu() {
		System.out.println("1. check Balance");
		System.out.println("2. Withdrawl");
		System.out.println("3. Deposit");
		System.out.println("4. Exit");
		
		Scanner scanner = new Scanner(System.in);
		int opt = scanner.nextInt();
		
		if (opt==1) {
			checkBalance();
		} 
		else if (opt==2) {
			withdrawl();
		}
		else if (opt==3) {
			deposit();
		}
		else if (opt==4){
			return;
		}
		else {
			System.out.println("Enter The valid choice");
		} 
	 }
	 public void checkBalance() {
			System.out.println("Balance"+Balance);
			Menu();
		}
	 public void withdrawl() {
		// TODO Auto-generated method stub
		 System.out.println("Enter Amount to withdraw:");
		 Scanner sc = new Scanner(System.in);
		 float amount = sc.nextFloat();
		 if (amount>Balance) {
			System.out.println("Insufficient Balance");
		}
		 else {
			 Balance = Balance- amount;
			 System.out.println("Withdrawl Sucessfull");
			 
		 }
		 Menu();
	}
	 public void deposit() {
		System.out.println("Enter The Amount ");
		Scanner scanner = new Scanner(System.in);
		float amount = scanner.nextFloat();
		Balance = Balance + amount;
		System.out.println("Money deposit Sucessful");
		
		Menu();
	}
	
}

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm_interface atm = new Atm_interface();
		atm.checkpin();
	}

}
