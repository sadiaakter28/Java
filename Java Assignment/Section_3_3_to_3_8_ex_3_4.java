import java.util.Scanner;
public class Section_3_3_to_3_8_ex_3_4 {
	public static void main(String[]args){
		Scanner k=new Scanner(System.in);
		System.out.println("give  two integers under 100 :");
		int a=k.nextInt();
		int b=k.nextInt();
		int sum1=a+b;
		System.out.println("Enter the sum of these two integers :");
		int sum2=k.nextInt();
		if(sum1==sum2){
			System.out.println((Boolean)true);
		}
		else{
			System.out.println((Boolean)false);
		}
	}

}
