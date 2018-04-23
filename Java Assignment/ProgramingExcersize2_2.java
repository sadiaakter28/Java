import java.util.Scanner;

public class ProgramingExcersize2_2 {
	public static void main(String[]args){
Scanner k=new Scanner (System.in);

System.out.println("Enter the radius and length of a cylinder : ");
double radious=k.nextDouble();
double length=k.nextDouble();
double area=radious*radious*Math.PI;
double voliume=area*length;
System.out.println("area : "+ area+" voliume : "+ voliume);

}
}
