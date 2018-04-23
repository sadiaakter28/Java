
public class Section_4_2_to_4_7_ex_4_5 {
	public static void main(String[]args){
		int k = 0;
		double sum=0,pound=2.2;
		System.out.println("kilogram\t\tpounds");
		for(int i=1;i<=199;i+=2){
			sum=(int)i*pound;
			System.out.println(" "+i+"\t\t\t"+sum);
		}
		System.out.println("pounds\t\t\tkilogram");
		for(int i=20;i<=515;i+=5){
			sum=(int)i/pound;
			System.out.println(" "+i+"\t\t\t"+sum);
		}
	}

}
