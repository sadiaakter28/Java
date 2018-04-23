
public class Sections_4_2_to_4_7_ex_4_24 {
public static void main(String[]args){
	float sum=1/3;
	for(int m=1,n=3;m<=97&&n<=99;m+=2,n+=2){
		sum=sum+(float)((m+2)/(n+2));
	}
	System.out.println(sum);
}
}
