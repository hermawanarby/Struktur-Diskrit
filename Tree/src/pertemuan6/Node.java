/**
 * Created by Hermawan Arby 193040161 on 24/4/2021.
 */
package pertemuan6;

// Kelas Node
public class Node {
	
	// Atribut id untuk menyimpan nilai bertipe int
	public int id;
	
	// Atribut data untuk menyimpan nilai bertipe String
	public String data;
	
	// Atribut leftChild untuk menyimpan node ke sebelah kiri
	public Node leftChild;
	
	// Atribut leftChild untuk menyimpan node ke sebelah kanan
	public Node rightChild;

	// method displayNode untuk menampilkan node yaitu id dan data
	public void displayNode() {
		
		// Menampilkan ke layar yaitu id dan data dari tree sesuai dengan yang dimasukan oleh user
		System.out.print("{ " + id + ", " + data + " } ");
	} 
}
