package Laba8_6;

// Данный класс будет представлять узел списка

class Node {
	// Это значение хранит каждый узел( у каждого узла оно свое)
	public Integer data;
	// Это ссылка на следующий узел в списке
	public Node next;
	
	public Node() {
		
	}
	
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

}
