import java.text.DecimalFormat;
import java.util.Scanner;

public class Section_2_18_ex_2_22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double length = 0, area = 0;
		System.out.print("Enter the side: ");
		length = input.nextFloat();

		area = (3 * Math.sqrt(3) * length * length) / 2;
		
		System.out.println("The area of the hexagon is " + area);

	}

}
