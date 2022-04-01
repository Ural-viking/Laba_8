package Laba8_2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число для перевода: ");
        int num = in.nextInt();
        Perevod(num);
}
    public static void Perevod(int n) {
        if(n/2>0){
            Perevod(n/2);
        }
        System.out.print(n%2);
    }
}