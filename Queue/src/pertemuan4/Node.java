/*
 * NRP : 193040161
 * NAMA: HERMAWAN ARBY 
 */
package pertemuan4;

public class Node {
	// Atribut data yang bertipe data integer untuk menampung nilai numerik.
	int data;
	
	// atribut next yang bertipe data Node atau class-nya sendiri, yang berufungsi untuk menyimpan element node berikutnya.
	Node next;
	
	// Konstruktor Node untuk membuat node baru yang memiliki parameter data yang bertipedata integer untuk menampung nilai numerik.
	public Node(int data) {
		
		// Berfungsi untuk menyisipkan data dengan nilai yang ada di parameter.
		this.data = data;
	}
}
