import java.util.Scanner;

public class Sections_4_2_to_4_7_ex_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int sum=0,pC=0,nC=0;
		double avg=1,nA=0;
		System.out.println("Input the number:");
		for(int i=0;;i++){
			int n=input.nextInt();
			if(n>0){
				pC++;
			}
			else if(n<0){
				nC++;
			}
			else{
				break;
			}
			sum=sum+n;
		}
		nA=pC+nC;
		avg=(int)sum/nA;
		System.out.println("The number of positives is "+pC);
		System.out.println("The number of nagetives is "+nC);
		System.out.println("The total is "+sum);
		System.out.println("The avarage is "+avg);
	
	}

}
