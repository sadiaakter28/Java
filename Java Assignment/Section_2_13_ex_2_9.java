import java.util.Scanner;

public class Section_2_13_ex_2_9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int amount = 0;
		System.out.print("Enter the amount: ");
		amount = input.nextInt();
		String str = Integer.toString(amount);
		char arr[] = str.toCharArray();
		for (int i = 0; i < str.length() - 2; i++) {
			System.out.print(arr[i]);
		}

		System.out.println(" Dollars " + arr[str.length() - 2] + "" + arr[str.length() - 1] + " Cents");

	}

}
