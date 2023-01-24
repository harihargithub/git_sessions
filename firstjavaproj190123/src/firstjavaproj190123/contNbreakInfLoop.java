package firstjavaproj190123;

public class contNbreakInfLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		// infinite loop
		for  (;;i++) {
		// continue if number does not fall in table of 2
		if (i%2 != 0) 
			continue;
		
		//break if number exceeds 20
		else if (i > 20)
			break;
		// print loop variable
		else
			System.out.println(i);
		}
	}

}
