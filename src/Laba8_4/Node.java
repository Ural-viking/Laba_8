package Laba8_4;

public class Node {
	public int znachenieNode;  // �������� ����
	public Node next;          // ����-������ (���������) �� ��������� ����
	
	Node(int znachenie, Node next ){
		this.znachenieNode = znachenie;
		this.next = next;
	}
}