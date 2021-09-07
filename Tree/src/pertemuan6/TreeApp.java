/**
 * Created by Hermawan Arby 193040161 on 24/4/2021.
 */
package pertemuan6;

// Import library BufferedReader
import java.io.BufferedReader;

// Import library IOException
import java.io.IOException;

// Import library InputStreamReader
import java.io.InputStreamReader;

// Kelas TreeApp
public class TreeApp {
	
	// Method main yang dijalankan pertama kali oleh program
	public static void main(String[] args) throws IOException {
		
		// Mendeklarasi variabel value dengan tipe int
		int value;
		
		// Mendeklarasi variabel data dengan tipe String
		String data;
		
		// Instansiasi objek theTree dari kelas Tree
		Tree theTree = new Tree();
		
		// Menambahkan node ke tree dengan nilai id yaitu 50, dan data yaitu Ahmad
		theTree.insert(50, "Ahmad");

		// Menambahkan node ke tree dengan nilai id yaitu 25, dan data yaitu Rosa
		theTree.insert(25, "Rosa");
		
		// Menambahkan node ke tree dengan nilai id yaitu 75, dan data yaitu Raisa
		theTree.insert(75, "Raisa");
		
		// Menambahkan node ke tree dengan nilai id yaitu 12, dan data yaitu Naya
		theTree.insert(12, "Naya");
		
		// Menambahkan node ke tree dengan nilai id yaitu 37, dan data yaitu Gagas
		theTree.insert(37, "Gagas");
		
		// Menambahkan node ke tree dengan nilai id yaitu 43, dan data yaitu Ainun
		theTree.insert(43, "Ainun");
		
		// Menambahkan node ke tree dengan nilai id yaitu 30, dan data yaitu Beri
		theTree.insert(30, "Beri");
		
		// Menambahkan node ke tree dengan nilai id yaitu 33, dan data yaitu Vivid
		theTree.insert(33, "Vivid");
		
		// Menambahkan node ke tree dengan nilai id yaitu 87, dan data yaitu Orin
		theTree.insert(87, "Orin");
		
		// Menambahkan node ke tree dengan nilai id yaitu 93, dan data yaitu Wiwid
		theTree.insert(93, "Wiwid");
		
		// Menambahkan node ke tree dengan nilai id yaitu 97, dan data yaitu Sasa
		theTree.insert(97, "Sasa");
		
		// Selama bernilai true
		while (true) {
			
			// Menampilakan tulisan "Enter first letter of show, insert, find, delete, or traverse:"
			System.out.print("Enter first letter of show, " + "insert, find, delete, or traverse: ");
			
			// Variabel choice diisi dengan function getChar()
			int choice = getChar(); 
			
			// Switch choice
			switch (choice) {
			
				// Pilihan s untuk 'show'
				case 's':
					
					// Memanggil data yang ada di tree 
					theTree.displayTree();
					
					// Menghentikan case s
					break;
					
				// Pilihan i untuk 'insert'
				case 'i':
					
					// Menampilakan tulisan "Enter value and data to insert:"
					System.out.print("Enter value and data to" + " insert: ");
					
					// Variabel value diisi dengan function getInt()
					value = getInt();
					
					// Variabel data diisi dengan function getString()
					data = getString();
					
					// Menambahkan data dengan parameter value dan data
					theTree.insert(value, data);
					
					// Menghentikan case i
					break;
					
				// Pilihan f untuk 'find'
				case 'f':
					
					// Menampilkan tulisan "Enter value to find:"
					System.out.print("Enter value to find: ");
					
					// Variabel value diisi dengan function getInt()
					value = getInt();
					
					// Variabel found diisi dengan nilai yang dimasukan saat user mencari node di tree
					Node found = theTree.find(value);
					
					// Jika nilai di variabel found tidak null (ada didalam tree)
					if (found != null) {
						
						// Menampilkan tulisan "Found:"
						System.out.print("Found: ");
						
						// Memanggil method displayNode() untuk menampilakan data yang ada di tree
						found.displayNode();
						
						// Memberi jarak antar baris
						System.out.print("\n");
						
					// Jiak tidak
					} else {
						
						// Akan menampilkan tulisan "Could not find"
						System.out.println("Could not find ");
					}
					
					// Menghentikan case f
					break;
				
				// Pilihan d untuk 'delete'
				case 'd':
					
					// Menampilkan tulisa "Enter value to delete:"
					System.out.print("Enter value to delete: ");
					
					// Variabel value diisi dengan function getInt()
					value = getInt();
					
					// Variabel didDelete diisi dengan nilai yang dimasukan saat user mendelete node di tree
					boolean didDelete = theTree.delete(value);
					
					// Jika nilai dari didDelete true
					if (didDelete) {
						
						// Akan menampilkan tulisan "Deleted" digabung dengan value yang didelete
						System.out.println("Deleted " + value );
						
					// Jika tidak
					} else {
						
						// Akan menampilkan tulisan "Could not delete" digabung dengan value yang didelete
						System.out.println("Could not delete " + value);
					}
					
					// Menghentikan case d
					break;
					
				// Pilihan t untuk 'traverse'
				case 't':
					
					// Menampilkan tulisan "Enter type 1, 2 or 3:"
					System.out.print("Enter type 1, 2 or 3: ");
					
					// Variabel value diisi dengan function getInt()
					value = getInt();
					
					// Memanggila method traverse parameter value
					theTree.traverse(value);
					
					// Menghentikan case t
					break;
					
				// Pilihan default, jika pilihan yang dimasukan tidak termasuk dalam kriteria
				default:
					
					// Akan menampilkan tulisan "Invalid entry"
					System.out.println("Invalid entry ");
			}
		}
	}
	
	// Function getString(), untuk mengambil nilai string yang di inputkan oleh user
	public static String getString() throws IOException {
		
		// Instansiasi objek isr dari InputStreamReader
		InputStreamReader isr = new InputStreamReader(System.in);
		
		// Instansiasi objek br dari BufferedReader dengan parameter isr
		BufferedReader br = new BufferedReader(isr);
		
		// Variabel s diisi dengan method readLine()
		String s = br.readLine(); 
		
		// Mengemabalikan nilai dari s
		return s; 
	}
	
	// Function getChar(), untuk mengambil nilai char yang di inputkan oleh user
	public static char getChar() throws IOException {
		
		// Variabel s diisi dengan function getString()
		String s = getString();
		
		// Mengembalikan nilai s yang di convert ke char
		return s.charAt(0);
	}
	
	// Function getInt(), untuk mengambil nilai int yang di inputkan oleh user
	public static int getInt() throws IOException {
		
		// Variabel s diisi dengan function getString()
		String s = getString();
		
		// Mengembalikan nilai s yang di convert ke integer
		return Integer.parseInt(s);
	}
}
