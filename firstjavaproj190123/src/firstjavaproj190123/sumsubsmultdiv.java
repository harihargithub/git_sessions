package firstjavaproj190123;

import java.util.Scanner;

public class sumsubsmultdiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		System.out.println("Choose ption");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println(num1 + num2);
		break;
		
		case 2:
		    System.out.println(num1 - num2);
		break;
		
		case 3:
		    System.out.println(num1 * num2);
		break;
		
		case 4:
			if (num2 == 0) {
				System.out.println("division invalid with 0");
			}
				else {
					System.out.println(num1 / num2);	
				}
			
		    break;
		
		}

	}

}
