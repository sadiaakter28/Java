import java.util.Scanner;
public class ProgramingExcersize2_3 {
public static void main(String[]args){
	Scanner k=new Scanner(System.in);
	System.out.println("Enter a value for feet: ");
	double input=k.nextDouble();
	double ans=input*0.305;
	System.out.println(input+" is "+ans+ " meters");
}
}
