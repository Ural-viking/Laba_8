package Laba8_1;

/*  Для заданного параметра x вывести последовательность значений элементов числового ряда в
соответствии со следующими требованиями:
    – очередной элемент x = 2*x+1 (новое значение вычисляется с использованием старого);
    – 0 ≤ x < 20.  */

public class Task1_1 {
	public static void main(String[] args) {
		Metod1(1);
	}
	public static void Metod1(int x) {
		System.out.println("x="+x);
		if ( (2*x+1) <20) {
			Metod1(2*x+1);
		}
	}
}