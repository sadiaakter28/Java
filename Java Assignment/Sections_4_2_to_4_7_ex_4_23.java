
public class Sections_4_2_to_4_7_ex_4_23 {
	 public static void main(String[] args) {
		   
		   final int N = 50000;
		   double sumL2R =0, sumR2L = 0;
		    
		    
		   for(int i=1 ; i<=N; i++){
		     sumL2R = sumL2R+ 1.0/i;
		     sumR2L = sumR2L+ 1.0/(N-i+1);
		    
		   }
		     
		  System.out.println("Summation from left to right:" + sumL2R);
		  System.out.println("Summation from right to left:" + sumR2L);
		 }
}
