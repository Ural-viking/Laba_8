package Laba8_1;

// ������� ������������������ �� ������� 1 � �������� �������.

public class Task1_2 {
	public static void main(String[] args) {
		Metod2(1);
	}
	 public static void Metod2(int x) {
		 if ((2*x+1) <20) {
		 Metod2(2*x+1);
		 }
	 System.out.println("x="+x);
	 }
}