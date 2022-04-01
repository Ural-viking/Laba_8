package Laba8_3;

/*    Создать приложение, позволяющее ввести и вывести одномерный массив целых чисел.
 *    Для ввода и вывода массива разработать рекурсивные методы вместо циклов for.  */

import java.util.Scanner;
import java.util.Random;

public class Task3 {
	public static void main(String[] args) {
		// Задаем длину массива и создаем массив заданной длины
		Scanner in = new Scanner(System.in);
		System.out.println("Введите длину массива: ");
		int l = in.nextInt();
		int [] array = new int [l];
		workWithArray obj3 = new workWithArray();
		obj3.fillingTheArray(array);
		obj3.arrayOutput(array);
	}
}