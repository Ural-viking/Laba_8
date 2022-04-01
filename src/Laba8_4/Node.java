package Laba8_4;

public class Node {
	public int znachenieNode;  // значение узла
	public Node next;          // поле-ссылка (указатель) на следующий узел
	
	Node(int znachenie, Node next ){
		this.znachenieNode = znachenie;
		this.next = next;
	}
}