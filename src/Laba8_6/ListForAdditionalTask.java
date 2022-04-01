package Laba8_6;

import java.util.*;

public class ListForAdditionalTask {
	private Node head; // head == null
	
	ListForAdditionalTask(int numberAT){
		System.out.println("�������� ������ ������� ����� � ������ � ����������� ����� - " + numberAT);
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
		System.out.println("������ ����� ���: ");
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
		System.out.println("���������� �����, ������� ������� �� 3 � ������������ ������: " +  number);
		System.out.println("����� ���� ����� �����: " + sum);
		System.out.println("������� �������������� ���� ����� �����: " + srednee);
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
		System.out.println("������������ ����� �� ������, ������� ������� �� 3 ����� " + max);
		System.out.println("����������� ����� �� ������, ������� ������� �� 3 ����� " + min);
		ref2 = head;
		Node Max = new Node(max,null);
		Node Min = new Node(min,null);
		System.out.println("�������� �� �������.");
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