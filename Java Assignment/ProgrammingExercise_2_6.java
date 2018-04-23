import java.util.Scanner;

public class ProgrammingExercise_2_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0, r = 0, sum = 0;
		System.out.print("Enter a number between 0 and 1000: ");
		n = input.nextInt();

		while (n != 0) {
			r = n % 10;
			sum = sum + r;
			n = n / 10;

		}
		System.out.println("The sum of the digits is " + sum);

	}

}
