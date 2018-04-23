import java.util.Scanner;

public class Section_2_18_ex_2_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double waterAmount = 0, initialTemperature = 0, finaltemperature = 0, q = 0;
		System.out.print("Enter the amount of water in kilograms: ");
		waterAmount = input.nextDouble();
		System.out.print("Enter the initial temperature: ");
		initialTemperature = input.nextDouble();
		System.out.print("Enter the final temperature: ");
		finaltemperature = input.nextDouble();

		q = waterAmount * (finaltemperature - initialTemperature) * 4184;
		System.out.println("The energy needed is " + String.format("%.5e", q));

	}
}
