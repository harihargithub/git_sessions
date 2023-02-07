package firstjavaproj190123;

  import java.util.Scanner;

public class factorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Enter a two digit number");
		  int number = sc.nextInt();
		  
		  int tempnum = number, sum = 1;
		  
		  for (int i = tempnum; i>=1; i--) {
			  
			  sum = sum * tempnum;
			  
			  System.out.println("The Sum @ different factorial stages are " + sum);
			  tempnum--;
			  
		  }
   
		  System.out.println("The factorial of " + number + " is " + sum);   
		  
	}

}
