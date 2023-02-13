package firstjavaproj190123;

 import java.util.Scanner;

public class binarypatter10101then01010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);

	     int row;
	     
	     System.out.println("Define No. of Binnary Rows ");
	     row = sc.nextInt();
	     
	     System.out.println("The desired result: ");

	     for ( int i =1; i <= row; i++) {

	         int num = i%2 == 0? 0: 1;

	           System.out.print(num);

	         for ( int j = 1; j < row; j++ ) {

	             num = num%2 == 0? 1: 0;

	             System.out.print(num);

	         }

	      System.out.println();

	     }

	    }
	}