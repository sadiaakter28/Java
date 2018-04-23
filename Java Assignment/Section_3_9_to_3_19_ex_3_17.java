import java.util.Scanner;
public class Section_3_9_to_3_19_ex_3_17 {
	public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
		   int computer, user;
		  
		   System.out.print("scissor (0), rock (1), paper (2):");
		   user = s.nextInt();
		   computer = (int)(Math.random() * 3);
		  
		   if(computer == 0) {
		 System.out.print("The computer is scissor.");
		   } else if(computer == 1) {
		 System.out.print("The computer is rock.");
		   } else if(computer == 2) {
		   System.out.print("The computer is paper.");
		   }
		  
		   if((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)) {
		 if(user == 0) {
		  System.out.print(" You are scissor. You won.");
		 } else if(user == 1) {
		  System.out.print(" You are rock. You won.");
		 } else if(user == 2) {
		  System.out.print(" You are paper. You won.");
		 }
		   } else if(user == computer) {
		 if(user == 0) {
		  System.out.print(" You are scissor too. It is a draw.");
		 } else if(user == 1) {
		  System.out.print(" You are rock too. It is a draw.");
		 } else if(user == 2) {
		  System.out.print(" You are paper too. It is a draw.");
		 }
		   } else {
		 if(user == 0) {
		  System.out.print(" You are scissor. You lose.");
		 } else if(user == 1) {
		  System.out.print(" You are rock. You lose.");
		 } else if(user == 2) {
		  System.out.print(" You are paper. You lose.");
		 }
		   }
		}
}
