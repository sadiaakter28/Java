
public class Sections_4_2_to_4_7_ex_4_10 {
	 public static void main(String[] args) {
		 
		  int itemCount = 0;
		  for(int i=100; i<=1000; i++){
		   if(i%5 == 0 && i%6 == 0){
		    System.out.print(i + " ");
		    itemCount +=1; 
		    if(itemCount==10){
		     System.out.println("\n");
		     itemCount = 0;
		    }
		   }
		  }
		 
		 }
}
