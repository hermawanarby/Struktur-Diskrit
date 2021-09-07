/*
 * NRP  : 193040161
 * NAMA : HERMAWAN ARBY 
 */
package pertemuan5;

public class Graph {
	
	// Variabel MAX_VERTS menampung nilai 20 yang tidak dapat diubah.
	private final int MAX_VERTS = 20;
	
	// Untuk menampung vertex/node yang ke array
	private Vertex vertexList[];
	
	// Untuk menampung array dua dimensi atau matrix, dengan nilai integer.
	private int adjMat[][];
	
	// Untuk menampung banyaknya vertex.
	private int nVerts;
	
	// Konstuktor Graph berfungsi untuk menjadi wadah Graph 
	public Graph() {
		
		// Meninstansiasi vertexList dengan panjang array 20.
		vertexList = new Vertex[MAX_VERTS];
		
		// Meninstansiasi adjMat dengan panjang array matrix 20.
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		
		// Memberi nilai default ke variabel nVerts yaitu 0.
		nVerts = 0;
		
		// Nilai awal i = 0, jika nilai i kurang dari MAX_VERTS (20), maka nilai i ditambah 1.
		for (int i = 0; i < MAX_VERTS; i++) {
			
			// Nilai awal j = 0, jika nilai j kurang dari MAX_VERTS (20), maka nilai j ditambah 1.
			for (int j = 0; j < MAX_VERTS; j++) {
				
				// Untuk menampung panjang karakter matrix.
				adjMat[i][j] = 0;
			}
		}
	}
	
	// Method addVertex berfungsi untuk menambahkan vertex/node baru. 
	public void addVertex(char label) {
		
		// Jika ada data yang baru ditambahakn maka nVerts bertambah 1.
		vertexList[nVerts++] = new Vertex(label);
	}
	
	// Method addEdge untuk menambahkan penghubung dari vertex 1 ke vertek lain. 
	public void addEdge(int start, int end) {
		
		// Untuk menujukan dari node asal ke node tujuan, ada relasi.
		adjMat[start][end] = 1;
		
		// Untuk menujukan dari node tujuan ke node asal, ada relasi.
		adjMat[end][start] = 1;
	}
	
	// Method display untuk menampilakan Vertex
	public void display() {
		
		// Untuk menampilakan tulisan "Adjecency:" ke layar.
		System.out.println("Adjecency:");
		
		// Nilai awal row = 0, jika nilai row kurang dari nVerts, maka nilai row ditambah 1.
		for (int row = 0; row < nVerts; row++) {
			
			// Nilai awal col = 0, jika nilai col kurang dari row, maka nilai row ditambah 1.
			for (int col = 0; col < row; col++) {
				
				// Jika baris dan kolom dari matrix adjMat ada berelasi, maka...
				if (adjMat[row][col] == 1) {
					
					// Akan menampilkan hasil dari Vertex berupa karakter, cth: B -- A
					System.out.println(vertexList[row].label + " -- " + vertexList[col].label);
				}
			}
		}
		
		// Untuk membuat jarak antar baris.
		System.out.println("");
	}
}
