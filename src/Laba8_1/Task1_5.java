package Laba8_1;

/*    Вывести число Фибоначчи, заданное его номером в последовательности.
      Последовательность Фибоначчи формируется так: нулевой член последовательности равен нулю,
      первый – единице, а каждый следующий – сумме двух предыдущих.   */

import java.util.Scanner;

public class Task1_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Значение какого номера в последовательности Фибоначчи нужно показать? ");
		int member = in.nextInt();
		System.out.println(fibonacci(member));
	}
	public static int fibonacci(int n){
		if (n==0){
			return 0;
			}
		else
			if (n==1){
			return 1;
			} 
			else {
			return fibonacci(n-2)+fibonacci(n-1);
			}
	}
}