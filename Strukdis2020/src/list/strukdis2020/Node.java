package list.strukdis2020;

public class Node {
	private int data;
	private Node next; //bisa juga dinamakan pointer
	
	// Inisialisasi atribut node
	public Node(int data) {
		this.data = data;
		next = null;
	}
	
	// Setter & Getter
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
}
