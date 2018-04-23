import java.util.Scanner;
public class Section_4_8_ex_4_31 {
public static void main(String[]args){
	Scanner k=new Scanner(System.in);
	System.out.println("Enter the initial deposit amount: ");
	double inamount=k.nextInt();
	System.out.println("Enter annual percentage yield ");
	double percentage =k.nextDouble();
	System.out.println("Enter maturity period (number of months): ");
	int months=k.nextInt();
	//double inamount1=inamount*(percentage/1200);
	    System.out.println("(Month)       (CD Value) ");
	for(int i=1;i<=months;i++){
		inamount=inamount+(inamount*(percentage/1200));
		
		System.out.println("  "+i+"            "+inamount);
	
}
}
}
