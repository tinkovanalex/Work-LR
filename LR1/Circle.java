
import java.io.*;
class Circle{
		private double radius, square;
		private String s1;
		
		private void processIt() throws IOException {
			//Создадим стандартный поток ввода
			BufferedReader stdin = new BufferedReader(new InputStreamReader (System.in));
			System.out.println("Введите радиус круга: ");
			s1 = stdin.readLine(); //Введем текст в поле message
			//Преобразуем строку в число и выполним вычисления.
			//Предусмотрим обработку ошибок преобразования сроки в число.
			try {
				radius = Double.parseDouble(s1);
				square = 2 * Math.PI * radius;
				System.out.println("R=" + radius + "\tS=" + square);
			} catch (Exception ex){
				System.out.println("Не удалось преобразовать текст " + s1 + "в число!");
			}			
		}
		public static void main (String[] args) throws IOException { 
			Circle c = new Circle(); //Создаем екземпляр класса Circle
			c.processIt(); //Вызовем метод processIt() екземпляра класса с
		}
}

