import java.util.Scanner;

public class Section_2_18_ex_2_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double startingVelocity = 0, endingVelocity = 0, time = 0, averageAcceleration = 0;

		System.out.print("Enter v0, v1, and t: ");
		startingVelocity = input.nextDouble();
		endingVelocity = input.nextDouble();
		time = input.nextDouble();

		averageAcceleration = (endingVelocity - startingVelocity) / time;
		
		System.out.println("The average acceleration is "+averageAcceleration);

	}

}
