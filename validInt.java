package firstjavaproj190123;

   import java.util.Scanner;

public class validInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		Boolean isAnIntegralNum = sc.hasNextInt();
		
		number = sc.nextInt();
		
		System.out.println(" Enter a Number");
		
		System.out.println("Boolean value is " + isAnIntegralNum);
		
		 if (isAnIntegralNum) {
			
			// number = sc.nextInt();
			System.out.println(" The entered Number " + number + " is an Integer");
			
		} else {
			System.out.println(" Enter a valid Number");
		} 
		
			
		}
		
		

	}


