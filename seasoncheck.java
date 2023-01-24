package firstjavaproj190123;
	
	import java.util.Scanner; 
	
/**
 * @author nhari
 *
 */
public class seasoncheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Select a Month by entering it's corresponding sl# to know the Season");
	
		System.out.print("      1. January ");
		System.out.print(" 2. February ");
		System.out.print(" 3. March ");
		System.out.print(" 4. April ");
		System.out.print(" 5. May ");
		System.out.println(" 6. June ");
		System.out.print(" 7. July ");
		System.out.print(" 8. August ");
		System.out.print(" 9. September ");
		System.out.print(" 10. October ");
		System.out.print(" 11. November ");
		System.out.print(" 12. December ");
		
		Scanner scnr = new Scanner(System.in);
		  int option = scnr.nextInt();
		     		  
		  switch (option) {
			  
			  case 1: {
				  System.out.println(" January falls in Winter Season ");
				  break;
	}
			  case 2: {
				  System.out.println(" February falls in Spring Season ");
				  break;
	}
			  case 3: {
				  System.out.println(" March falls in Sprin Season ");
				  break;
	}
			  case 4: {
				  System.out.println(" April falls in Summer Season ");
				  break;
	}
			  case 5: {
				  System.out.println(" May falls in Summer Season ");
				  break;
	}
			  case 6: {
				  System.out.println(" June falls in Summer Season ");
				  break;
	}
			  case 7: {
				  System.out.println(" July falls in Monsoon Season ");
				  break;
	}
			  case 8: {
				  System.out.println(" August falls in Mansoon Season ");
				  break;
	}
			  case 9: {
				  System.out.println(" September falls in Mansoon Season ");
				  break;
	}
			  case 10: {
				  System.out.println(" October falls in Autumn Season ");
				  break;
	}
			  case 11: {
				  System.out.println(" November falls in Autumn Season ");
				  break;
	}
			  case 12: {
				  System.out.println(" December falls in Winter Season ");
				  break;
	}
			  case 13: {
				  System.out.println(" Please select a valid number from 1 to 12 ");
				  break;
	}
			  
			  }
		  }
		

}
