package iitrglcodingchallenge170223;

import java.util.Scanner;
import java.util.random.*;

public class CustomerIndianBank {

	private int bankAccountNo;
	private String password;

	public int getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(int bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	/*
	 * public String getPassword() { return password; }
	 */

	public void setPassword(String password) {
		this.password = password;
	}

}

class IndianBank {

	public static void main(String[] args) {

		CustomerIndianBank obj = new CustomerIndianBank();

		obj.setBankAccountNo(12345);

		obj.setPassword("gl123a");

		System.out.println(obj.getBankAccountNo());

		Scanner sc = new Scanner(System.in);

		System.out.println("1) Check Balance");
		System.out.println("2) Deposit");
		System.out.println("3) Withdrawal");
		System.out.println("4) Transfer");
		System.out.println("5) Logout");

		int option = sc.nextInt();
		int AcBal = 55000;

		switch (option) {
		case 1: {
			
			System.out.println("Your A/c Balance is: " +  AcBal);
			break;
		}
		case 2: {
			System.out.println("Please enter your Deposit Amount");
			int depoAmt = sc.nextInt();
			System.out.println("Your fresh a/c Bal is: "
					+ (AcBal + depoAmt));
			break;
		}
		case 3: {
			System.out.println("Please enter your Withdrawal Amount");
			int withDrawalAmt = sc.nextInt();
			
			if (withDrawalAmt > AcBal) {
				System.out.println("Your permissible withdrawal is only: " + AcBal);
			} else {

				System.out.println("Your A/c Bal after this withdrawal is: " + (AcBal - withDrawalAmt));
			}
			break;

		}
		case 4: {
			System.out.println("Please enter Account password to initiate Transfer");
			String pin = sc.next();
			System.out.println("Transfer success");
			break;

		}
		case 5: {
			System.out.println("You have logged out");
			break;
		}
		}

	}

}
