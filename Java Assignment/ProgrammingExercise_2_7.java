import java.util.Scanner;

public class ProgrammingExercise_2_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int min = 0;
		System.out.print("Enter the number of minutes: ");
		min = input.nextInt();

		int year = min / 525600;
		int remainingMinutes = min % 525600;
		int day = remainingMinutes / 1440;
		System.out.println(min + " minutes is " + year + " years and " + day + " days ");

	}

}
