package Laba8_6;

/* 		����������� ������, � ������� ��� �����, ������ � ���������
		������������ ��������� ������ ������� ��������� ������:
			�) � �������������� �����:
					+ ���� � ������ createHead();
					+ ���� � ������ createTail();
					+ ����� (������������ ������, �������������� �� ��������� ������) toString();
					+ ���������� �������� � ������ ������ AddFirst();
					+ ���������� �������� � ����� ������ AddLast();
					+ ������� �������� � ������ � ��������� ������� Insert();
					+ �������� �������� � ������ ������ RemoveFirst();
					+ �������� ���������� �������� ������ RemoveLast();
					+ �������� �� ������ �������� � ��������� ������� Remove();
			�) � �������������� ��������:
					+ ���� � ������ createHeadRec();
					+ ���� � ������ createTailRec();
					+ ����� (������������ ������, �������������� �� ��������� ������) toStringRec(). */

import java.util.*;

public class Main {
	public static void main(String[] args) {
// ���������� ������ ������
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		System.out.println("������� ����� �����. ��� ����� ������ ���� ������.");
		int dat = scan1.nextInt();
		System.out.println("������� ����� ����� ������� � ������?");
		int num = scan2.nextInt();
		System.out.println("�� ������� ����� ��������� �������� ����� ����� �����");
		int ran = scan3.nextInt();
// ������� ������� ������ SinglyLinkedList ��� ������������� ������� ��� ������ ������
		SinglyLinkedList newList1 = new SinglyLinkedList();
		SinglyLinkedList newList2 = new SinglyLinkedList();
// ���������� ������:
		// ����� ����� � ������ createHead() � ����� ������ toString();
		newList1.createHead(dat, num, ran);
		System.out.println(newList1.toString());
		// ����� ����� � ������ createTail() � ����� ������ toString();
		newList2.createTail(dat, num, ran);
		System.out.println(newList2.toString());
		// ����� ���������� �������� � ������ ������ AddFirst();
		newList1.addFirst(2);
		System.out.println(newList1.toString());
		// ����� ���������� �������� � ����� ������ AddLast();
		newList1.addLast(3);
		System.out.println(newList1.toString());
		// ����� ������� �������� � ������ � ��������� ������� Insert();
		// ��������, �������� 4 ������� ������� �� ��������� 7
		newList1.Insert(4, 7);
		System.out.println(newList1.toString());
		// ����� �������� �������� � ������ ������ RemoveFirst();
		newList1.RemoveFirst();
		System.out.println(newList1.toString());
		// ����� �������� ���������� �������� ������ RemoveLast();
		newList1.RemoveLast();
		System.out.println(newList1.toString());
		// ����� �������� �� ������ �������� � ��������� ������� Remove();
		newList1.Remove(3);
		System.out.println(newList1.toString());
// ������� ������� ������ SinglyLinkedList ��� ������������� ������� � �������������� ��������
		SinglyLinkedList newList3 = new SinglyLinkedList();
		SinglyLinkedList newList4 = new SinglyLinkedList();
		// ����� ����� � ������ createHeadRec() ��� ������ ��������;
		newList3.createHeadRec(dat, num, ran);
		System.out.println(newList3.toString());
		// ����� ����� � ������ createTailRec() ��� ������ ��������;
		Node newNode = new Node(dat+ran*(num-1),null);
		newList4.createTailRec(newNode, new Node(), dat, num-1,ran);
		newList4.toString("����� ����� � ������ ��� ������ ��������", newNode);
		// ����� ������� toStringRec() ��� ������ ��������;
		newList4.toStringRec("", newNode);
		
		
/*                           �������������� ������� 
������ � ���������� ������ �� n ����� �����.
		�) ����� �����, ���������� � ������� �������� ����� �����, ��������� �� 3.
		�) ����� ����� �����, ������� ������� �� 3, ����������� � ������������ �������� � �� ������ � �������� �� �������. */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("");
		System.out.println("������� ���������� ����� ������. ��������, ���������� � ������, ������������ �������������. ");
		int i = scan.nextInt();
		ListForAdditionalTask newList = new ListForAdditionalTask(i);
		System.out.println(newList.toStringAT());
		newList.Method_A();
		newList.Method_B();
		System.out.println(newList.toStringAT());
		
	}
	
}
