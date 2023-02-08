package firstjavaproj190123;

   import java.util.Scanner;

public class tvColBnWatDis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
		
		int TvColMrp = 19000, TvBnWmrp = 15000;
		
		int TvCol20InchMrp = 22000, TvBnW20Inchmrp = 18000;
		
		Boolean TvCol = true;
		
		Boolean TvBnW = true;
		
		Boolean TvSize14Inch = true;
		
		Boolean TvSize20Inch = true;
		
		int Dis, Nett;
		
		System.out.println("Welcome to our TV Show Room");
		
		System.out.println("Select an option to get know our special Offer");
		
		System.out.println("1. A 14 inch B&W TV");
		
		System.out.println("2. A 14 inch Colour TV");
		
		System.out.println("3. A 20 inch B&W TV");
		
		System.out.println("4. A 20 inch Colour TV");
		
		int option = sc.nextInt();
		
		switch (option)  {
		
		case 1 : {
			
			if ((TvSize14Inch) && (TvBnW)) {
				
				 Dis = (TvBnWmrp * 8) / 100;
				 
				 Nett = TvBnWmrp - Dis;
				 
				 System.out.println("The Discounted Price of 14inch B&W TV ==> " + TvBnWmrp + 
						 " Less Discount of " + Dis + " is Rs." + Nett + " Nett");
				 break;
				 
				}
		}
		
			
			case 2 : {
				
				if ((TvSize14Inch) && (TvCol)) {
					
					 Dis = (TvColMrp * 10) / 100;
					 
					 Nett = TvColMrp - Dis;
					 
					 System.out.println("The Discounted Price of 14inch Col TV ==> " + TvColMrp + 
							 " Less Discount of " + Dis + " is Rs." + Nett + " Nett");
					 break;
								 
				}
				
			}
			
			case 3 : {
				
				if ((TvSize20Inch) && (TvBnW)) {
					
					 Dis = (TvBnW20Inchmrp * 12) / 100;
					 
					 Nett = TvBnW20Inchmrp - Dis;
					 
					 System.out.println("The Discounted Price of 20inch B&W TV ==> " + TvBnW20Inchmrp + 
							 " Less Discount of " + Dis + " is Rs." + Nett + " Nett");
					 break;
								 
				}
				
				
			}
			
			case 4 : {
				
				if ((TvSize20Inch) && (TvCol)) {
					
					 Dis = (TvCol20InchMrp * 14) / 100;
					 
					 Nett = TvCol20InchMrp - Dis;
					 
					 System.out.println("The Discounted Price of 20inch Colour TV ==> " + TvCol20InchMrp + 
							 " Less Discount of " + Dis + " is Rs." + Nett + " Nett");
					 break;
								 
				}
				
			}
			
			default : {
				
				System.out.println("Wrong option select");
			}
			
			
			
		}
	

		
		
		
	/**	int TvColMrp = 19000, TvBnWmrp = 15000;
		
		int TvCol20InchMrp = 22000, TvBnW20Inchmrp = 18000;
		
		Boolean TvCol = true;
		
		Boolean TvBnW = true;
		
		Boolean TvSize14Inch = true;
		
		Boolean TvSize20Inch = true;
		
		int Dis, Nett1;
		
		if ((!TvSize14Inch) && (TvBnW)) {
			
		 Dis = (TvBnWmrp * 8) / 100;
		 
		 Nett1 = TvBnWmrp - Dis;
		 
		 System.out.println("The Discounted Price of 14inch B&W TV ==> " + TvBnWmrp + 
				 " Less Discount of " + Dis + " is Nett Rs." + Nett1);
		 
		}
		 
		 else if ((!TvSize14Inch) && (TvCol)) {
				
			 Dis = (TvColMrp * 10) / 100;
			 
			 Nett1 = TvColMrp - Dis;
			 
			 System.out.println("The Discounted Price of 14inch Col TV ==> " + TvColMrp + 
					 " Less Discount of " + Dis + " is Nett Rs." + Nett1);
						 
		}

		 else if ((!TvSize20Inch) && (TvBnW)) {
				
			 Dis = (TvBnW20Inchmrp * 12) / 100;
			 
			 Nett1 = TvBnW20Inchmrp - Dis;
			 
			 System.out.println("The Discounted Price of 20inch B&W TV ==> " + TvBnW20Inchmrp + 
					 " Less Discount of " + Dis + " is Nett Rs." + Nett1);
						 
		}
		
		 else if ((TvSize20Inch) && (TvCol)) {
				
			 Dis = (TvCol20InchMrp * 14) / 100;
			 
			 Nett1 = TvCol20InchMrp - Dis;
			 
			 System.out.println("The Discounted Price of 20inch Colour TV ==> " + TvCol20InchMrp + 
					 " Less Discount of " + Dis + " is Nett Rs." + Nett1);
						 
		}
		 */
		
	}

}
