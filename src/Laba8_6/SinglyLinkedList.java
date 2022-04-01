package Laba8_6;

// ��� ����� ������������ ������

public class SinglyLinkedList {
	private Node head;  // head ==null

/* ����� ����������� ����� ����� � ������ createHead()
 * ���������� �� ������ "��������� ����", ������� ����� � ������� � ������� ������������ (����. ���� ��� ��� �������� ������)
 * ����� �� ����� ���� ��� �������� �� �����, ���� �� ������ ���� � ������� null.
 * ������ ��������� ����� ���� ����� �������� ����, � �� ������ �������� ��������� */	
	
	public void createHead(int dataCH,int numberCH,int rangeCH) {
		System.out.println("�������� ������ ������� ����� � ������ ��� ������ �����");
		Node newNode = new Node();
		newNode.data = dataCH;
		newNode.next = head;
		head = newNode;
		Node tail = head;
			for (int j=1; j<numberCH; j++) {
				Node newNode1 = new Node();
				newNode1.data = dataCH + rangeCH*j;
				tail.next = newNode1;
					while(tail.next != null) {
						tail = tail.next;
					}
			}
	}
	
/* ����� ����������� ������� ����� � ������ createTail() � �������������� �����.
 * �� ������� ����� ���� newNode. ����� �� ������������� ������ ���������� dataCT � ���� data ����.
 * � ����� �� ������ ���, ����� ������ ������ ���� ��������� �� null, � � ���������� ���� ������ ���������� �� ����� ���� */
	 
	public void createTail(int dataCT, int numberCT, int rangeCT) {
		System.out.println("�������� ������ ������� ����� � ������ ��� ������ �����");
		for (int i = 0; i<numberCT; i++) {
			Node newNode = new Node();
			newNode.data = dataCT + rangeCT*i;
			newNode.next = head;
			head = newNode;
		}
	}
	
// ����� ����������� ����� ������ toString
	
	public String toString() {
		String Text = "";
		Node tail = head;
		while (tail != null) {
			Text = Text + tail.data + " -> ";
			tail = tail.next;
		}
		Text = Text + "null";
		return Text;
	}
	
	public static void toString(String message, Node head) {
		String Text = "";
		Node ref = head;
		System.out.println(message);
		while (ref != null) {
			Text = Text  + ref.data + " -> ";
			ref = ref.next;
		}
		Text = Text + "NULL";
		System.out.println(Text);
		return;
	}
	
// ����� ����������� ����� ���������� �������� � ������ ������ AddFirst()
	
	public void addFirst(int dataAF) {
		System.out.println("������ � ������ ������ ���� �� ��������� " + dataAF);
		Node newNode = new Node();
		newNode.data = dataAF;
		newNode.next = head;
		head = newNode;
	}

// ����� ����������� ����� ���������� �������� � ����� ������ AddLast()
	
	public void addLast(int dataAL) {
		System.out.println("������ � ����� ������ ���� �� ��������� " + dataAL);
		Node tail = head; // ������ ���� - � ������ � �����
		while (tail.next != null) {
			tail = tail.next;
		}
		Node newNode = new Node();
		newNode.data = dataAL;
		tail.next = newNode;
	}
	
// ����� ����������� ����� ������� �������� � ������ � ��������� ������� Insert()
	
	public void Insert(int place, int dataI) {
		System.out.println("������ ���� �� ��������� " + dataI + " ��������� ��� ������� " + place);
		Node tail = head;
		Node temp = head;
		int k = 0;
		while(temp.next != null && (k<place)) {
			temp = tail;
			tail =tail.next;
			k++;
		}
		Node newNode = new Node();
		newNode.data = dataI;
		temp.next = newNode;
		newNode.next = tail;
	}
	
// ����� ����������� ����� �������� �������� � ������ ������ RemoveFirst()
	
	public void RemoveFirst() {
		System.out.println("������� <<������>> ������");
		head = head.next;
	}
	
// ����� ����������� ����� �������� ���������� �������� ������ RemoveLast()
	
	public void RemoveLast() {
		System.out.println("������� <<�����>> ������");
		Node tail = head;
		Node temp = head;
		while (tail.next != null) {
			temp = tail;
			tail = tail.next;
		}
		tail = temp;
		tail.next = null;
	}
	
// ����� ����������� ����� �������� �� ������ �������� � ��������� ������� Remove()
	
	public void Remove (int deletePlace) {
		System.out.println("������� ������� ��� ������� " + deletePlace);
		Node tail = head;
		Node temp = head;
		int k = 1;
		while(temp.next != null && (k<deletePlace)) {
			temp = temp.next;
			tail = tail.next;
			k++;
		}
		tail.next = tail.next.next;
	}
	
// ����� ����������� ����� ����� � ������ createHeadRec() ��� ������ ��������
	
	public void createHeadRec(int dataCHR,int numberCHR,int rangeCHR) {
		if(numberCHR<1) {
			System.out.println("�������� ������ ������� ����� � ������ ��� ������ ��������");
			return;
		}
		else {
			Node newNode = new Node();
			newNode.data = dataCHR + rangeCHR*(numberCHR-1);
			newNode.next = head;
			head = newNode;
		}
		numberCHR--;
		createHeadRec(dataCHR,numberCHR,rangeCHR);
	}
	
// ����� ����������� ����� ����� � ������ createTailRec() ��� ������ ��������
	
	public static void createTailRec(Node head, Node tail,int dataTR,int numberTR,int rangeTR) {
		if(head != null) {
			tail = head;
		}
		if(numberTR>0) {
			tail.next = new Node(dataTR + rangeTR*(numberTR-1), null);
			tail = tail.next;
			numberTR--;
			createTailRec(null, tail, dataTR,numberTR, rangeTR);
		}
	}
	
// ����� ����������� ����� ������ toStringRec() � �������������� ��������	
	
		public static void toStringRec(String mes, Node ref) {
			String Text = mes;
			if(ref != null) {
				Text = Text + ref.data + " -> ";
				ref = ref.next;
				toStringRec(Text, ref);
			}
			else {
				Text = Text + "NULL";
				System.out.println("����� ������ toStringRec ��� ������ ��������: ");
				System.out.println(Text);
			}
			return;
		}	
}