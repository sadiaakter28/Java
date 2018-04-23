import java.util.Scanner;

public class ProgrammingExercise_2_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double celsius = 0.0, fahrenheit = 0.0;

		System.out.print("Enter a degree in Celsius: ");
		celsius = input.nextDouble();
		fahrenheit = (9.0 / 5) * celsius + 32;
		System.out.println(celsius+" Celsius is"+ " celsius " + fahrenheit);

	}

}
