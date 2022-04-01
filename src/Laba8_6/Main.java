package Laba8_6;

/* 		Разработать проект, в котором для ввода, вывода и изменения
		односвязного линейного списка создать следующие методы:
			а) с использованием цикла:
					+ ввод с головы createHead();
					+ ввод с хвоста createTail();
					+ вывод (возвращается строка, сформированная из элементов списка) toString();
					+ добавление элемента в начало списка AddFirst();
					+ добавление элемента в конец списка AddLast();
					+ вставка элемента в список с указанным номером Insert();
					+ удаление элемента с головы списка RemoveFirst();
					+ удаление последнего элемента списка RemoveLast();
					+ удаление из списка элемента с указанным номером Remove();
			б) с использованием рекурсии:
					+ ввод с головы createHeadRec();
					+ ввод с хвоста createTailRec();
					+ вывод (возвращается строка, сформированная из элементов списка) toStringRec(). */

import java.util.*;

public class Main {
	public static void main(String[] args) {
// Определяем данные списка
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Введите целое число. Это будет первый узел списка.");
		int dat = scan1.nextInt();
		System.out.println("Сколько узлов будет сначала в списке?");
		int num = scan2.nextInt();
		System.out.println("На сколько будут отличатся значения узлов между собой");
		int ran = scan3.nextInt();
// Создаем обьекты класса SinglyLinkedList для использования методов при помощи циклов
		SinglyLinkedList newList1 = new SinglyLinkedList();
		SinglyLinkedList newList2 = new SinglyLinkedList();
// Используем методы:
		// метод ввода с головы createHead() и метод вывода toString();
		newList1.createHead(dat, num, ran);
		System.out.println(newList1.toString());
		// метод ввода с хвоста createTail() и метод вывода toString();
		newList2.createTail(dat, num, ran);
		System.out.println(newList2.toString());
		// метод добавления элемента в начало списка AddFirst();
		newList1.addFirst(2);
		System.out.println(newList1.toString());
		// метод добавления элемента в конец списка AddLast();
		newList1.addLast(3);
		System.out.println(newList1.toString());
		// метод вставки элемента в список с указанным номером Insert();
		// Например, поставим 4 номером элемент со значением 7
		newList1.Insert(4, 7);
		System.out.println(newList1.toString());
		// метод удаления элемента с головы списка RemoveFirst();
		newList1.RemoveFirst();
		System.out.println(newList1.toString());
		// метод удаления последнего элемента списка RemoveLast();
		newList1.RemoveLast();
		System.out.println(newList1.toString());
		// метод удаление из списка элемента с указанным номером Remove();
		newList1.Remove(3);
		System.out.println(newList1.toString());
// Создаем обьекты класса SinglyLinkedList для использования методов с использованием рекурсии
		SinglyLinkedList newList3 = new SinglyLinkedList();
		SinglyLinkedList newList4 = new SinglyLinkedList();
		// метод ввода с головы createHeadRec() при помощи рекурсии;
		newList3.createHeadRec(dat, num, ran);
		System.out.println(newList3.toString());
		// метод ввода с хвоста createTailRec() при помощи рекурсии;
		Node newNode = new Node(dat+ran*(num-1),null);
		newList4.createTailRec(newNode, new Node(), dat, num-1,ran);
		newList4.toString("метод ввода с хвоста при помощи рекурсии", newNode);
		// метод ввывода toStringRec() при помощи рекурсии;
		newList4.toStringRec("", newNode);
		
		
/*                           ДОПОЛНИТЕЛЬНОЕ ЗАДАНИЕ 
Ввести с клавиатуры список из n целых чисел.
		а) Найти сумму, количество и среднее значение среди чисел, делящихся на 3.
		б) Найти среди чисел, которые делятся на 3, минимальное и максимальное значения и их номера и поменять их местами. */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("");
		System.out.println("Введите количество узлов списка. Значения, записанные в ячейки, сформируются автоматически. ");
		int i = scan.nextInt();
		ListForAdditionalTask newList = new ListForAdditionalTask(i);
		System.out.println(newList.toStringAT());
		newList.Method_A();
		newList.Method_B();
		System.out.println(newList.toStringAT());
		
	}
	
}
