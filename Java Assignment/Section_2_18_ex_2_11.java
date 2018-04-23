import java.util.Scanner;
public class Section_2_18_ex_2_11 {
public static void main(String[]args){
	Scanner k=new Scanner(System.in);
	System.out.println("Give name : ");
	String name=k.next();
	System.out.println("Give working hours : ");
	int hours=k.nextInt();
	System.out.println("Give payRate : ");
	double payRate=k.nextDouble();
	System.out.println("Give Federal tax withholding rate  : ");
	int Federaltaxwithholdingrate1 =k.nextInt();
	float Federaltaxwithholdingrate2=(float)Federaltaxwithholdingrate1/100;
	float Federaltaxwithholdingrate3=(float)payRate*Federaltaxwithholdingrate2*(float)hours;
	System.out.println("Give state tax withholding rate : ");
	int statetaxwithholdingrate1=k.nextInt();
	float statetaxwithholdingrate2=(float)statetaxwithholdingrate1/100;
	float statetaxwithholdingrate3=(float) (payRate*statetaxwithholdingrate2*hours);
	double grossPay=(float)hours*(float)payRate;
	float totalDeduction=Federaltaxwithholdingrate3+statetaxwithholdingrate3;
	System.out.println("Employee Name: "+name);
	System.out.println("Hours Worked: "+(double)hours);
	System.out.println("Pay Rate:  $"+payRate);
	System.out.println("Gross Pay:  $"+grossPay);
	System.out.println("Deduction :");System.out.println();
	System.out.println("Federal Withholding ("+Federaltaxwithholdingrate1+"%):  $"+Federaltaxwithholdingrate3);
	System.out.println("State Withholding ("+statetaxwithholdingrate1+"%):  $"+statetaxwithholdingrate3);
	System.out.println("Total Deduction:  $"+totalDeduction);
}
}
