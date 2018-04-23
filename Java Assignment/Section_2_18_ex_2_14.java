import java.util.Scanner;

public class Section_2_18_ex_2_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float weight = 0, height = 0,bmi=0;
		System.out.print("Enter weight in pounds: ");
		weight = input.nextFloat();
		System.out.print("Enter height in inches:  ");
		height = input.nextFloat();
		
		weight*=0.45359237;
		height*=0.0254;
		bmi=(float) (weight/Math.pow(height, 2));
		
		System.out.println("BMI is "+bmi);

	}
}
