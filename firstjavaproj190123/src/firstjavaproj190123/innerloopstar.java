package firstjavaproj190123;

public class innerloopstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // int no=5;
		// loop to keep count of no of rows
		for (int i=0; i<5; i++) {
			// inner lop to keep count of *
			for (int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			// change to new line once inner loop is finished
			System.out.println();
		}
	}

}
