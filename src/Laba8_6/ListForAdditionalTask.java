package Laba8_6;

import java.util.*;

public class ListForAdditionalTask {
	private Node head; // head == null
	
	ListForAdditionalTask(int numberAT){
		System.out.println("Создание списка методом ввода с головы с количеством узлов - " + numberAT);
		Random random =new Random();
		Node newNode = new Node();
		newNode.data = random.nextInt(500);
		newNode.next =head;
		head = newNode;
		Node tail = head;
		for (int j =1; j<numberAT; j++){
			Node newNode1 = new Node();
			newNode1.data = random.nextInt(500);
			tail.next =newNode1;
			while(tail.next != null) {
				tail =tail.next;
			}
		}
	}
	
	public String toStringAT() {
		System.out.println("Список имеет вид: ");
		String Text ="";
		Node tail = head;
		while(tail != null) {
			Text = Text + tail.data + "-> ";
			tail = tail.next;
		}
		Text = Text + "NULL";
		return Text;
	}
	
	public void Method_A() {
		int number = 0;
		int sum = 0;
		float srednee = 0;
		Node ref1 = head;
		while(ref1.next != null) {
			ref1 = ref1.next;
			if(ref1.data % 3 == 0) {
				number ++;
				sum = sum +ref1.data;
				srednee = (float)sum/number;
			}
		}
		System.out.println("Количество чисел, которые делятся на 3 в получившемся списке: " +  number);
		System.out.println("Сумма этих чисел равна: " + sum);
		System.out.println("Среднее арифметическое этих чисел равно: " + srednee);
	}
	
	public void Method_B() {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		Node ref2 = head;
		while(ref2.next != null) {
			ref2 = ref2.next;
			if(ref2.data % 3 == 0 & ref2.data > max) {
				max = ref2.data;
			}
			if(ref2.data % 3 == 0 & ref2.data < min) {
				min = ref2.data;
			}
		}
		if (min==2147483647) {
			min =0;
		}
		if (max==-2147483648) {
			max =0;
		}
		System.out.println("Максимальное число из списка, которое делится на 3 равно " + max);
		System.out.println("Минимальное число из списка, которое делится на 3 равно " + min);
		ref2 = head;
		Node Max = new Node(max,null);
		Node Min = new Node(min,null);
		System.out.println("Поменяем из местами.");
		while (ref2.next != null) {
			ref2 = ref2.next;
			if (ref2.data == min) {
                ref2.data = Max.data;
                Max.next = ref2.next;
            } 
			else if (ref2.data == max) {
                ref2.data = Min.data;
                Min.next = ref2.next;
			}   
		}
	}
}