package Laba8_1;

/*  Вычислить факториал числа n с использованием рекурсии.
	Факториал числа n (обозначается n!) – произведение всех натуральных чисел от 1 до n включительно:
	n!=1*2*…*n. Пример 5!=1*2*3*4*5 =4!*5.
    Можно записать n!=(n-1)!*n. */
import java.util.Scanner;

public class Task1_4 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Факториал какого числа нужно найти? ");
		int n = num.nextInt();
		System.out.println(factorial(n));
	}
	public static int factorial(int n){
		int result;
		if (n==1)
		return 1;
		else{
		result=factorial(n-1)*n;
		return result;
		}
	}
}
