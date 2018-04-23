import java.util.Scanner;

public class Section_3_9_to_3_19_ex_3_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i=0;
		System.out.print("Guess one between head(0) and tail(1): ");
		i=input.nextInt();
		double a=Math.random();
		int c=(int) Math.rint(a);
		if(i==c)
		System.out.println("Correct !!!");
		else
			System.out.println("Incorrect");

	}

}
