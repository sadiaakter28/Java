import java.util.Scanner;
public class Section_3_3_to_3_8_ex_3_7 {
public static void main(String[]args){
	 Scanner input = new Scanner(System.in); 
	 System.out.println("Enter an amount in double, for example 23.67 : ");
	 double amount=input.nextDouble();
	 int remainingAmount = (int)((amount) * (100));
	 int dollers =remainingAmount/100;
	 remainingAmount = remainingAmount % 100; 
	 remainingAmount = remainingAmount % 25;
	 remainingAmount = remainingAmount % 10;
	 int pennys = remainingAmount % 5;
	 System.out.println(dollers+" dollers "+pennys+" pennys");
	 
}
}
