package application;

public class Program {

	public static void main(String[] args) {
		System.out.println(Program.snail(5, 10, 3));
		      
	}

	public static int snail(int column, int day, int night) {
		boolean aux = true;
		int time = 0;
		while (aux) {
			column -= day;
			time++;
			if (column <= 0) {
				break;
			}
			column += night;
		}
		return time;
	}
}
	