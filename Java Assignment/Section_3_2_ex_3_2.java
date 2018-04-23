import java.util.Scanner;
public class Section_3_2_ex_3_2 {
public static void main(String[]args){
	Scanner k=new Scanner (System.in);
	System.out.println("Enter an integer: ");
	int a=k.nextInt();
	if(a%2==0){
		System.out.println("Is "+a+" an even number? "+(Boolean)true);
	}
	else{
		System.out.println("Is "+a+" an even number? "+(Boolean)false);
	}
}
}
