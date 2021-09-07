/*
 * NRP  : 193040161
 * NAMA : HERMAWAN ARBY 
 */
package pertemuan5;

/*
 * Graph adalah sekumpulan node dan baris, dimana node ini dihubungkan oleh node ini.
 * Node  -> Vertex adalah kumpulan dari node.
 * Garis -> Edge adalah garis yang menghubungkan antara node 1 dengan node yang lainnya. 
 * 
 */

public class GraphApp {
	public static void main(String[] args) {
		
		// Instansiasi objek theGraph dari kelas Graph.
		Graph theGraph = new Graph();
		
		// Menambahkan vertex A
		theGraph.addVertex('A'); 
		
		// Menambahkan vertex B
		theGraph.addVertex('B'); 
		
		// Menambahkan vertex C
		theGraph.addVertex('C');
		
		// Menambahkan vertex D
		theGraph.addVertex('D');
		
		// Menambahkan vertex E
		theGraph.addVertex('E'); 
		
		// ------------------------------------------
		
		// Menambahkan edge/baris ke index 0 dan 1.
		theGraph.addEdge(0, 1); 
		
		// Menambahkan edge/baris ke index 1 dan 2.
		theGraph.addEdge(1, 2); 
		
		// Menambahkan edge/baris ke index 0 dan 3.
		theGraph.addEdge(0, 3); 
		
		// Menambahkan edge/baris ke index 3 dan 4.
		theGraph.addEdge(3, 4); 
		
		// Memanggil method display untuk menampilkan vertex pada graph.
		theGraph.display();
	}
}
