package Laba8_1;

/*    ������� ����� ���������, �������� ��� ������� � ������������������.
      ������������������ ��������� ����������� ���: ������� ���� ������������������ ����� ����,
      ������ � �������, � ������ ��������� � ����� ���� ����������.   */

import java.util.Scanner;

public class Task1_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�������� ������ ������ � ������������������ ��������� ����� ��������? ");
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