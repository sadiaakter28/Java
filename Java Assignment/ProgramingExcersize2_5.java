import java.util.Scanner;
public class ProgramingExcersize2_5 {
public static void main(String[]args){
	Scanner k=new Scanner(System.in);
	System.out.println("Enter the subtotal and a gratuity rate: ");
	double subtotal=k.nextDouble();
	double gratuity=k.nextDouble();
	double subAns=subtotal+(subtotal*(gratuity/100));
	double gratAns=gratuity/subtotal;
	System.out.println("The gratuity is "+gratAns+" and total is "+subAns);
}
}
