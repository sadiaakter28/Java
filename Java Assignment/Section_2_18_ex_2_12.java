import java.util.Scanner;

public class Section_2_18_ex_2_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float balance=0,annualInterestRate=0;
		float interest=0 ;
		
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		balance=input.nextFloat();
		annualInterestRate=input.nextFloat();
		
		
		interest = balance * (annualInterestRate / 1200);
		System.out.println("The interest is "+interest);
		


	}
}
