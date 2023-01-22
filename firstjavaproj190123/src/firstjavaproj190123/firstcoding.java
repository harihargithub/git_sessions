package firstjavaproj190123;

import java.util.Scanner;

public class firstcoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// variable declarations with values
int i1;
float f1;
char c1;
boolean b1;
String s1;
double d1;

// Object of Scanner class creation to take input

Scanner input1 = new Scanner(System.in);

System.out.println("Enter int Value");
i1 = input1.nextInt();

System.out.println("Enter float Value");
f1 = input1.nextFloat();

System.out.println("Enter Char Value");
c1 = input1.next().charAt(0);

System.out.println("Enter Boolean Value");
b1 = input1.nextBoolean();

System.out.println("Enter String Text");
s1 = input1.next();

System.out.println("Enter double Value");
d1 = input1.nextDouble();

System.out.println("Int is -->" + i1);
System.out.println("float is -->" + f1);
System.out.println("char is -->" + c1);
System.out.println("Boolean is -->" + b1);
System.out.println("String is -->" + s1);
System.out.println("double is -->" + d1);
	}

}
