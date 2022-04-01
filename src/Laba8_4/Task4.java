package Laba8_4;

/*   Построить однонаправленный список из предварительно созданных независимых элементов (узлов),
     у которых значением поля будет целое число, равное номеру элемента, и вывести значения полей на экран */

public class Task4 {
	public static void main(String[] args) {
		// Создание нескольких несвязанных узлов при помощи конструктора
		Node node0 = new Node(0, null);    // Данный узел будет "головой" в списке
		Node node1 = new Node(1, null);
		Node node2 = new Node(2, null);
		Node node3 = new Node(3, null);   // Этот узел будет "хвостом"
		
		// Связывание узлов между собой при помощи ссылок
		
		node0.next = node1;
		node1.next = node2;
		node2.next = node3;
		
		// вывод списка с использованием вспомогательной переменной ref, соответствующей текущему значению ссылки при прохождении по списку
		
		Node ref = node0;
		while (ref != null) {
			System.out.print(" " + ref.znachenieNode);
			ref = ref.next;
		}
	}
}