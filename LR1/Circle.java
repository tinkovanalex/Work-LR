
import java.io.*;
class Circle{
		private double radius, square, circuit;
		private String s1, s2;
		
		private void processIt() throws IOException {
			//Создадим стандартный поток ввода
			BufferedReader stdin = new BufferedReader(new InputStreamReader (System.in));
			System.out.println("Enter radius of the circle: ");
			s1 = stdin.readLine(); //Введем текст в поле message
			//Преобразуем строку в число и выполним вычисления.
			//Предусмотрим обработку ошибок преобразования сроки в число.
			try {
				radius = Double.parseDouble(s1);
				
				circuit = 2 * Math.PI * radius;
				square = Math.PI * Math.pow(radius, 2);
				System.out.println("R = " + radius + "\tS = " + square + "\tL = " + circuit);
			} catch (Exception ex){
				System.out.println("Could not convert the text "+ s1 +" in the number!");
			}			
		}
		public static void main (String[] args) throws IOException { 
			Circle c = new Circle(); //Создаем екземпляр класса Circle
			c.processIt(); //Вызовем метод processIt() екземпляра класса с
		}
}

