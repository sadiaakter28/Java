import java.util.Scanner;

public class Section_3_3_to_3_8_ex_3_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double num1=0,num2=0,num3=0,temp=0;
		System.out.print("Enter the first number");
		num1=input.nextDouble();
		System.out.print("Enter the second number");
		num2=input.nextDouble();
		System.out.print("Enter the third number");
		num3=input.nextDouble();
		
		 if (num1 > num2) {
		      temp = num1;
		      num1 = num2;
		      num2 = temp;
		    }

		    if (num2 > num3) {
		      temp = num2;
		      num2 = num3;
		      num3 = temp;
		    }

		    if (num1 > num2) {
		      temp = num1;
		      num1 = num2;
		      num2 = temp;
		    }

		    System.out.println("The sorted numbers are "
		      + num1 + " " + num2 + " " + num3);
		

	}

}
