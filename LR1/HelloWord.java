import java.util.Scanner;
public class HelloWord{
	
		private String rectangleLength = "Enter Rectangle length!";
		private String rectangleWidth = "Enter Rectangle width";
		private String enterMessage = "Enter Triangle length of the triangle base!";
		
	
		private void rectangleCreation (){
			Scanner sc = new Scanner(System.in);
			System.out.println(rectangleLength);
			int length = sc.nextInt();
			System.out.println(rectangleWidth);
		    int wedth = sc.nextInt();	
			for (int i = 0; i < wedth; i++ ){
				for(int j = 0; j < length; j++){
				System.out.print("*");
			}	
			System.out.println("");
		}
	}
	
	
		private void triangleCreation(){
			Scanner sc = new Scanner(System.in);
			System.out.println(enterMessage);
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
		public static void main (String [] args){
			HelloWord hw = new HelloWord();
			hw.rectangleCreation();
			hw.triangleCreation();
		}
}