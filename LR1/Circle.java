
import java.io.*;
import java.util.Scanner;
class Circle{
		private double radius, square, perimeter, height, base;
		private String s1;
		private static int chooice;
		
		private void choose(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose figure whose square and perimeter will be calculated: " + "\t1. Triangle" + "\t2. Quadrate" + "\t3. Circle");
			chooice = sc.nextInt();
		}
		
		private void processTriangle(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the height of the triangle: ");
			height = sc.nextInt();
			System.out.println("Enter the base of the triangle: ");
			base = sc.nextInt();
			square = 0.5 * base * height;
			perimeter = 3 * base;
				System.out.println("Your Triangle with: " + "\tHeight = " + height + "\tBase = " + base);
				System.out.println("Square = " + square + "\tPerimeter = " + perimeter);
		}
		
		private void processQuadrate(){
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the base of the quadrate: ");
			base = sc.nextInt();
			square = base * base;//Math.pow(base,2);
			perimeter = 4 * base;
				System.out.println("Your Quadrate with: " + "\tBase = " + base);
				System.out.println("Square = " + square + "\tPerimeter = " + perimeter);
		}
		
		private void processCircle() throws IOException {
			//Создадим стандартный поток ввода
			BufferedReader stdin = new BufferedReader(new InputStreamReader (System.in));
			System.out.println("Enter the radius of the circle: ");
			s1 = stdin.readLine(); //Введем текст в поле message
			//Преобразуем строку в число и выполним вычисления.
			//Предусмотрим обработку ошибок преобразования сроки в число.
			try {
				radius = Double.parseDouble(s1);
				
				perimeter = 2 * Math.PI * radius;
				square = Math.PI * Math.pow(radius, 2);
				System.out.println("Your Circle with: " + "\tRadius = " + radius);
				System.out.println("Square = " + square + "\tPerimeter = " + perimeter);
			} catch (Exception ex){
				System.out.println("Could not convert the text "+ s1 +" in the number!");
			}			
		}
		
		
		public static void main (String[] args) throws IOException { 
			Circle c = new Circle(); //Создаем екземпляр класса Circle
			c.choose();
			if(chooice == 1){
				c.processTriangle();
			}if(chooice == 2){
				c.processQuadrate();
			}else if (chooice == 3){
			c.processCircle();	//Вызовем метод processIt() екземпляра класса с	
			}
			
		}
}

