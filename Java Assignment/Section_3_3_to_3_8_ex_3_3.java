import java.util.Scanner;
public class Section_3_3_to_3_8_ex_3_3 {
	public static void main(String[]args){
		Scanner k=new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e, f: ");
		float a=k.nextFloat();
		float b=k.nextFloat();
		float c=k.nextFloat();
		float d=k.nextFloat();
		float e=k.nextFloat();
		float f=k.nextFloat();
		float x=(((e*d)-(b*f))/((a*d)-(b*c)));
		float y=(((a*f)-(e*c))/((a*d)-(b*c)));
		System.out.println("x is "+x+" and y is "+y);
	}

}
