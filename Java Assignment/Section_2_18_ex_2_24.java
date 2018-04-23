import java .util.Scanner;
public class Section_2_18_ex_2_24 {
public static void main (String[]args){
	Scanner k=new Scanner(System.in);
	System.out.println("Enter v and a: ");
	float v=k.nextFloat();
	float a=k.nextFloat();
	float ans=(v*v)/(2*a);
	System.out.println("The minimum runway length for this airplane is "+ans);
}
}
