import java.util.Scanner;

public class Section_3_2_ex_3_3_1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double a = 0, b = 0, c = 0;
		System.out.println("Enter a, b, c: ");
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		
		if((b*b- 4*a*c)>0){
			double r1=(-b+Math.pow(b*b- 4*a*c, 0.5))/(2*a);
			double r2=(-b-Math.pow(b*b- 4*a*c, 0.5))/(2*a);
			System.out.println("The roots are "+r1+" and "+r2);
		}
		else if((b*b- 4*a*c)==0){
			double r=-b/2*a;
			System.out.println("The root is "+r);
		}
		else
			System.out.println("The equation has no real roots");
	}
}