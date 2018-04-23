import java.util.Scanner;

public class Sections_4_2_to_4_7_ex_4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char []character=new char[11];

	for (int startingValue=33, i=0; startingValue <=126; startingValue++,i++) {
		char a=(char)(startingValue);
		if(i==10){
			System.out.println("");
			i=0;
		}
		System.out.print(a+"\t");
		
	}
	
	

}}
