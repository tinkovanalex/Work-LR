import java.util.Scanner;
public class HelloWord{
public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rectangle length!");
		int length = sc.nextInt();
		System.out.println("Enter Rectangle wedth!");
		int wedth = sc.nextInt();	
	for (int i = 0; i < wedth; i++ ){
		for(int j = 0; j < length; j++){
				System.out.print("*");
			}	
			System.out.println("");
		}
	
	System.out.println("Enter Trianle length of the Trianle base!");
	int lengthOfBase = sc.nextInt();
	
	int spaces = lengthOfBase -1 ;
	String stars = "*";
	
	for(int i = 0; i < lengthOfBase; i++){
		for(int j = 0; j < spaces; j++){
			System.out.print(" ");
		}
			System.out.print(stars);
			stars += "**";
			spaces = spaces - 1;
			System.out.println("");
		}
	}
}
