import java.util.Scanner;
public class Section_2_18_ex_2_13 {
public static void main(String[]args){
	Scanner k=new Scanner(System.in);
	System.out.println("Enter investment amount: ");
	int investmentAmount=k.nextInt();
	System.out.println("Enter annual interest rate: ");
	float annualInterestRate=k.nextFloat();
	float monthlyInterestRate=annualInterestRate/(12*100);
	System.out.println("Enter number of years : ");
	int numofyears=k.nextInt();
	float futureInvestmentValue = (float) (investmentAmount*Math.pow((1+monthlyInterestRate), 12));
	System.out.println("Accumulated value is "+futureInvestmentValue);
}
}
