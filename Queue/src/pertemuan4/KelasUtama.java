/*
 * NRP : 193040161
 * NAMA: HERMAWAN ARBY 
 */
package pertemuan4;

// Mengimport library Scanner untuk menginputkan nilai.
import java.util.Scanner;

public class KelasUtama {
	
	// Method menu() untuk menampilkan menu-menu yang ada pada program.
	public static void menu() {
		System.out.println("Selamat Datang...");
		System.out.println("Daftar Menu");
		System.out.println("1. Enqueue");
		System.out.println("2. Dequeue");
		System.out.println("3. Jumlah Data");
		System.out.println("4. Tampilkan Data");
		System.out.println("5. Keluar");
	}
	
	public static void main(String[] args) {
		
		// Instansiasi object op pada kelas Operasi
		Operasi op = new Operasi();
		
		// Instansiasi object sc atau Scanner, untuk menginputkan nilai
		Scanner sc = new Scanner(System.in);
		
		// Mendeklarasikan variable menu bertipedata integer dengan nilai awal 0.
		int menu = 0;
		
		// Mendeklarasikan variable nilai bertipedata integer dengan nilai awal 0.
		int nilai = 0;
		
		// Selama menu tidak sama dengan 5, maka pengulangan akan terus terjadi.
		while (menu != 5) {
			
			// Memanggil method menu
			menu();
			
			// Untuk menampilkan tulisan "Menu pilihan anda:".
			System.out.print("Menu pilihan anda: ");
			
			// Untuk menginputkan menu yang dipilih.
			menu = sc.nextInt();
			
			// Untuk memeriksa kondisi nilai menu yang diinputkan
			switch(menu) {
			
			// Menu ke 1 yaitu operasi Enqueue
			case 1 : System.out.println(""); // Untuk membuat jarak antar baris
					 
					 // Menampilkan tulisan "Masukan data yang baru: ".
					 System.out.print("Masukan data yang baru: ");
					 
					 // Variabel nilai akan menampung inputan dare keyboard
					 nilai = sc.nextInt();
					 
					 // Menjalankan operasi Enqueue
					 op.enqueue(nilai);
					 
					 // Untuk membuat jarak antar baris
					 System.out.println("");
					 
					 // Untuk menghentikan case ke 1
					 break;
			
			// Menu ke 2 yaitu operasi Dequeue
			case 2 : System.out.println(""); // Untuk membuat jarak antar baris
			
					 // Menjalankan operasi Eequeue
					 op.dequeue();
					 
					 // Untuk membuat jarak antar baris
					 System.out.println("");
					 
					 // Untuk menghentikan case ke 2
					 break;
					 
			// Menu ke 3 yaitu Jumlah Data
			case 3 : System.out.println(""); // Untuk membuat jarak antar baris
			
					 // Menjalankan method dataSize() untuk menjumlahkan data pada Queue
					 System.out.println("Jumlah Queue: " + op.dataSize()); 
					 
					 // Untuk membuat jarak antar baris
					 System.out.println("");
					 
					 // Untuk menghentikan case ke 3
					 break;
					 
			// Menu ke 4 yaitu Tampilkan Data
			case 4 : System.out.println(""); // Untuk membuat jarak antar baris
			
					 // Menjalankan method tampilData()
					 op.tampilData();
					 
					 // Untuk membuat jarak antar baris
					 System.out.println("");
					 
					 // Untuk menghentikan case ke 4
					 break;
					 
			// Menu ke 5 yaitu Kelur, berfungsi untuk keluar dari program java dan akan menampilkan tulisan "Terimakasih"
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
