import java.util.Scanner;

public class ProgrammingExercise_2_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double pounds = 0.0, kilograms = 0.0;

		System.out.print("Enter a number in pounds: ");
		pounds = input.nextDouble();
		kilograms = 0.454 * pounds;
		System.out.println(pounds + " Pounds is " + kilograms + " kilograms ");

	}

}
