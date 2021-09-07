/*
 * NRP  : 193040161
 * NAMA : HERMAWAN ARBY 
 */
package pertemuan5;

public class Vertex {
	
	// Mendeklarasikan variabel label untuk menampung karakter
	public char label;
	
	// Mendeklarasikan variabel wasVisited untuk menyimpan kondisi vertex yg belum keisi, kondisi kondisi belum nya true.
	public boolean wasVisited;
	
	// Konstruktor Vertex untuk membuat vertex/node baru yang memiliki parameter label yang bertipedata char untuk menampung nilai karakter.
	public Vertex(char label) {
		
		// Berfungsi untuk menyisipkan karakter dengan nilai yang ada di parameter.
		this.label = label;
		
		// Variabel wasVisited nilai nya diubah menjadi false yang awaal nya itu true.
		wasVisited = false;
	}
}
