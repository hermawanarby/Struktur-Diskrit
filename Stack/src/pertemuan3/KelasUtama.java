// ---------------------------
// | NRP  : 193040161        |
// | NAMA : HERMAWAN ARBY    |
// ---------------------------
package pertemuan3;

// Mengimport library Scanner untuk menginputkan nilai
import java.util.Scanner;

public class KelasUtama {
	
	// Method menu() untuk menampilkan menu-menu yang ada pada program.
	public static void menu() {
		System.out.println("Selamat Datang...");
		System.out.println("Daftar Menu");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Jumlah data Stack");
		System.out.println("4. Tampil Data");
		System.out.println("5. Keluar");
	}
	
	public static void main(String[] args) {
		
		// Instansiasi object op pada kelas Operasi
		Operasi op = new Operasi();
		
		// Instansiasi object sc atau Scanner, untuk menginputkan nilai
		Scanner sc = new Scanner(System.in);
		
		// Mendeklarasikan variable menu bertipedata integer dengan nilai awal 0.
		int menu = 0;
		
		// // Mendeklarasikan variable nilai bertipedata integer dengan nilai awal 0.
		int nilai = 0;
		
		// Selama menu tidak sama dengan 5, maka pengulangan akan terus terjadi.
		while (menu != 5) {
			
			// Memanggil method menu
			menu();
			
			// Untuk menampilkan tulisan "Menu pilihan anda:".
			System.out.println("Menu pilihan anda: ");
			
			// Untuk menginputkan menu yang dipilih.
			menu = sc.nextInt();
			
			// Untuk memeriksa kondisi nilai menu yang diinputkan
			switch(menu) {
				
						// Menu ke 1 yaitu operasi Push
						// Menampilkan tulisan "Masukan angka :"
				case 1 : System.out.println("Masukan angka : ");
				
						 // Variabel nilai akan menampung inputan dare keyboard
						 nilai = sc.nextInt();
						 
						 // Menjalankan operasi Push
						 op.push(nilai);
						 
						 // Untuk membuat jarak antar baris
						 System.out.println("");
						 
						 // Untuk menghentikan case ke 1
						 break;
						 
						 // Menu ke 2 yaitu operasi Pop
						 // Menjalankan operasi Pop
				case 2 : op.pop();
				
						 // Untuk membuat jarak antar baris
						 System.out.println("");
						 
						 // Untuk menghentikan case ke 2
						 break;
						 
						 // Menu ke 3 yaitu Jumlah data stack, dan menjalankan method dataSize()
				case 3 : System.out.println("Jumlah Data Stack: " + op.dataSize()); 
						
						 // Untuk membuat jarak antar baris
						 System.out.println("");
						 
						 // Untuk menghentikan case ke 3
						 break;
						 
						 // Menu ke 4 yaitu Tampil data, dan menjalankan method tampilData()
				case 4 : op.tampilData();
				
						 // Untuk membuat jarak antar baris
						 System.out.println("");
						 
						 // Untuk menghentikan case ke 4
						 break;
						 
						 // Menu ke 5 yaitu Kelur, berfungsi untuk keluar dari program java
				case 5 : System.out.println("Terimakasih");
				
						 // Untuk menghentikan case ke 5
		 		 		 break;
		 		 		 
		 		 		 // default, berfungsi jika inputan selain yang ada di menu, maka akan muncul tulisan "Menu tidak ditemukan"
				default : System.out.println("Menu tidak ditemukan");
						 
				         // Untuk membuat jarak antar baris
						 System.out.println("");
						 
						 // Untuk menghentikan default
						 break;
			}
		}
	}
}
