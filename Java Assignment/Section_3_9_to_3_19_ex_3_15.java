import java.util.Scanner;

public class Section_3_9_to_3_19_ex_3_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Generate a lottery
		int lottery = (int) (Math.random() * 1000);
		int m = lottery;
		// Prompt the user to enter a guess

		System.out.print("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();
		int n = guess;
		// Get digits from lottery
		int lotteryDigit1 = m % 10;
		m /= 10;
		int lotteryDigit2 = m % 10;
		m /= 10;
		int lotteryDigit3 = m;

		System.out.println("Guess digit is: " + guess);

		// Get digits from guess
		int guessDigit1 = guess % 10;
		guess /= 10;
		int guessDigit2 = guess % 10;
		guess /= 10;
		int guessDigit3 = guess;

		System.out.println(guessDigit1 + "\n" + guessDigit2 + "\n" + guessDigit3);
		System.out.println("The lottery number is " + lottery);
		// Check the guess
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2 && guessDigit3 == lotteryDigit3)
			System.out.println("Match all digits: you win $3,000");
		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
				|| guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
				|| guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");

	}

}
