import java.util.Arrays;
import java.util.Scanner;

public class Sections_4_2_to_4_7_ex_4_8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=0,largest=0,j=0;
		System.out.print("Enter the number student: ");
		num=input.nextInt();
		
		String name[]=new String[num];
		int score[]=new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("Enter the name and score: ");
			name[i]=input.next();
			score[i]=input.nextInt();
		}
			for(int i =0;i<num;i++) {
			
				            if(score[i] > largest) {
			
				                largest = score[i];
				
				            }
				            
				                  
	}
			 int hscore= Arrays.binarySearch(score, largest); 
				System.out.println("Highest scorer:"+name[hscore]+"\tScore: "+ score[hscore]); 
		

}
}
