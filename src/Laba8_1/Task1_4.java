package Laba8_1;

/*  ��������� ��������� ����� n � �������������� ��������.
	��������� ����� n (������������ n!) � ������������ ���� ����������� ����� �� 1 �� n ������������:
	n!=1*2*�*n. ������ 5!=1*2*3*4*5 =4!*5.
    ����� �������� n!=(n-1)!*n. */
import java.util.Scanner;

public class Task1_4 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("��������� ������ ����� ����� �����? ");
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
