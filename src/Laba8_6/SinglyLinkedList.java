package Laba8_6;

// Это класс односвязного списка

public class SinglyLinkedList {
	private Node head;  // head ==null

/* Здесь реализуется метод ввода с головы createHead()
 * Изначально мы делаем "стартовый узел", который будет и головой и хвостом одновременно (прим. если нет уже начатого списка)
 * Далее мы пишем цикл для перехода по узлам, пока не найдем узел с ссылкой null.
 * Теперь вставляем новый узел после текущего узла, и он теперь является последним */	
	
	public void createHead(int dataCH,int numberCH,int rangeCH) {
		System.out.println("Создание списка методом ввода с головы при помощи цикла");
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
	
/* Здесь реализуется принцип ввода с хвоста createTail() с использованием цикла.
 * Мы создаем новый узел newNode. Затем мы устанавливаем данные апргумента dataCT в поле data узла.
 * В конце мы делаем так, чтобы ссылка нового узла указывала на null, а в предыдущем узле ссылка показывала на новый узел */
	 
	public void createTail(int dataCT, int numberCT, int rangeCT) {
		System.out.println("Создание списка методом ввода с хвоста при помощи цикла");
		for (int i = 0; i<numberCT; i++) {
			Node newNode = new Node();
			newNode.data = dataCT + rangeCT*i;
			newNode.next = head;
			head = newNode;
		}
	}
	
// Здесь реализуется метод вывода toString
	
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
	
// Здесь реализуется метод добавления элемента в начало списка AddFirst()
	
	public void addFirst(int dataAF) {
		System.out.println("Вводим в начало списка узел со значением " + dataAF);
		Node newNode = new Node();
		newNode.data = dataAF;
		newNode.next = head;
		head = newNode;
	}

// Здесь реализуется метод добавления элемента в конец списка AddLast()
	
	public void addLast(int dataAL) {
		System.out.println("Вводим в конец списка узел со значением " + dataAL);
		Node tail = head; // первый узел - и голова и хвост
		while (tail.next != null) {
			tail = tail.next;
		}
		Node newNode = new Node();
		newNode.data = dataAL;
		tail.next = newNode;
	}
	
// Здесь реализуется метод вставки элемента в список с указанным номером Insert()
	
	public void Insert(int place, int dataI) {
		System.out.println("Вводим узел со значением " + dataI + " элементом под номером " + place);
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
	
// Здесь реализуется метод удаления элемента с головы списка RemoveFirst()
	
	public void RemoveFirst() {
		System.out.println("Удаляем <<голову>> списка");
		head = head.next;
	}
	
// Здесь реализуется метод удаление последнего элемента списка RemoveLast()
	
	public void RemoveLast() {
		System.out.println("Удаляем <<хвост>> списка");
		Node tail = head;
		Node temp = head;
		while (tail.next != null) {
			temp = tail;
			tail = tail.next;
		}
		tail = temp;
		tail.next = null;
	}
	
// Здесь реализуется метод удаления из списка элемента с указанным номером Remove()
	
	public void Remove (int deletePlace) {
		System.out.println("Удаляем элемент под номером " + deletePlace);
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
	
// Здесь реализуется метод ввода с головы createHeadRec() при помощи рекурсии
	
	public void createHeadRec(int dataCHR,int numberCHR,int rangeCHR) {
		if(numberCHR<1) {
			System.out.println("Создание списка методом ввода с головы при помощи рекурсии");
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
	
// Здесь реализуется метод ввода с хвоста createTailRec() при помощи рекурсии
	
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
	
// Здесь реализуется метод вывода toStringRec() с использованием рекурсии	
	
		public static void toStringRec(String mes, Node ref) {
			String Text = mes;
			if(ref != null) {
				Text = Text + ref.data + " -> ";
				ref = ref.next;
				toStringRec(Text, ref);
			}
			else {
				Text = Text + "NULL";
				System.out.println("метод вывода toStringRec при помощи рекурсии: ");
				System.out.println(Text);
			}
			return;
		}	
}