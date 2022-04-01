package Laba8_1;

// Для вышеописанного задания сделать вывод параметра перед вхождением в рекурсивный вызов и после него.

public class Task1_3 {
	public static void main(String[] args) {
		Metod3(1);
	}
	private static int step=0;
	public static void Metod3(int x) {
		space();
		System.out.println(""+x+" ->");
		step++;
			if ((2*x+1) <20) {
				Metod3(2*x+1);
			}
		step --;
		space();
		System.out.println(""+x+ " <-");
	}
	public static void space() {
		for (int i = 0; i < step; i++) {
			System.out.print(" ");
		}
	}
}