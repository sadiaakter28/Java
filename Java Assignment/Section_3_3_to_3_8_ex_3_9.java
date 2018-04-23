import java.util.Scanner;

public class Section_3_3_to_3_8_ex_3_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the ISBN 9 digits with separated by space(i.e: 0 3 2 3 5 4 3 9 8): ");
		int d1 = input.nextInt();
		int d2 = input.nextInt();
		int d3 = input.nextInt();
		int d4 = input.nextInt();
		int d5 = input.nextInt();
		int d6 = input.nextInt();
		int d7 = input.nextInt();
		int d8 = input.nextInt();
		int d9 = input.nextInt();

		int d10 = (((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9))
				% 11);
		if (d10 == 10) {

			System.out.print("ISBN is:" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");

		}
		else {

			System.out.print("ISBN is:" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 +

					d9 + d10);

		}

	}
}
