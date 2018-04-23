import java.util.Scanner;
public class Section_3_9_to_3_19_ex_3_19 {
public static void main(String[]args){
	Scanner k=new Scanner(System.in);
	System.out.println("Enter three edges: ");
	double a=k.nextDouble();
	double b=k.nextDouble();
	double c=k.nextDouble();
	if (a+b>c)
    System.out.print("True");
	else 
    System.out.print("False");
	
}
}
