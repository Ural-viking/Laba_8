package Laba8_3;

/*    ������� ����������, ����������� ������ � ������� ���������� ������ ����� �����.
 *    ��� ����� � ������ ������� ����������� ����������� ������ ������ ������ for.  */

import java.util.Scanner;
import java.util.Random;

public class Task3 {
	public static void main(String[] args) {
		// ������ ����� ������� � ������� ������ �������� �����
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� �������: ");
		int l = in.nextInt();
		int [] array = new int [l];
		workWithArray obj3 = new workWithArray();
		obj3.fillingTheArray(array);
		obj3.arrayOutput(array);
	}
}