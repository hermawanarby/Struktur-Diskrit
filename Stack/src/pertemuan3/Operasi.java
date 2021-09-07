// ---------------------------
// | NRP  : 193040161        |
// | NAMA : HERMAWAN ARBY    |
// ---------------------------
package pertemuan3;

public class Operasi {
	// Mendeklarasikan variable array dataStack bertipe data int dengan Panjang index array-nya yaitu 10.
	int [] dataStack = new int [10];

	// Mendeklarasikan variable top dengan nilai -1, berfungsi untuk menambahkan data yang akan menjadi top sekarang.
	int top = -1;
	
	// Mendeklarasikan variable jmlData dengan nilai 0, berfungsi untuk menampung jumlah banyaknya nilai yang ada di array.
	int jmlData = 0;
	
	// Method isEmpty() berguna untuk nanti saat pengecekan apakah stack nya kosong atau tidak.
	boolean isEmpty() {
		
		// Mengembalikan nilai dari variable top sama dengan -1.
		return (top == -1);
	}
	
	// Method isFull() berguna untuk nanti saat pengecekan apakah stack nya full atau tidak.
	boolean isFull() {
		
		// Mengembalikan nilai dari variable top sama dengan 9.
		return (top == 9);
	}
	
	// Method dataSize berfungsi untuk menghitung jumlah data pada stack.
	int dataSize() {
		
		// Dalam pengecekan jumlah data pada stack, maka variable jmlData akan diisi nilai dari variable top+1 
		jmlData = top + 1;
		
		// Mengembalikan nilai yang ada di variable jmlData.
		return (jmlData);
	}
	
	// Method push, berfungsi untuk memasukan data pada stack.
	void push(int dataPush) {
		
		// Mengecek apakah di dalam stack sudah penuh atau belum.
		if (isFull()) {
			// Jika di dalam stack nya sudah penuh, maka akan menampilkan tulisan “Stack Penuh”.
			System.out.println("Stack Penuh");
		  
		} else { // Jika di dalam stack belum penuh
			
			// Maka variable top akan bertambah 1, untuk menandakan stack yang akan diisi data.
			top++;
			
			// Data yang akan di push, akan disimpan ke variable array dataStack yang telah ditandai dengan variable top.
			dataStack[top] = dataPush;
			
			// Jika data yang di push berhasil, makan akan menampilakn tulisan “Data sudah tersimpan”.
			System.out.println("Data sudah tersimpan");
		
		} // Pengecekan akan keluar dan selesai.
		
		// Untuk mengihung data di dalam stack sekarang.
		dataSize();
	}
	
	// Method pop, berfungsi untuk mengapus data teratas pada stack.
	int pop() {
		
		// Variable temp untuk menyimpan data sementara yang akan dihapus.
		int temp = 0;
		
		// Mengecek apakah di dalam stack data nya kosong atau tidak.
		if (isEmpty()) {
			// Jika di dalam stack kosong, maka akan menampilkan tulisan “Stack masih kosong”.
			System.out.println("Stack masih kosong");
			
		} else { // Jika di dalam stack data nya ada.
			
			// Maka data yang akan dihapus itu ditampung ke variable temp.
			temp = dataStack[top];
			
			// Nilai variable top akan berkurang.
			top--;
			
		} // Pengecekan akan keluar dan selesai.
		
		// Untuk mengihung data di dalam stack sekarang.
		dataSize();
		
		// Mengembalikan nilai pada variable temp.
		return (temp);
	}
	
	// Method tampilData() berfungsi untuk menampilkan data yang ada di dalam stack.
	void tampilData() {
		
		// Mengecek data di dalam stack apakah ada isinya atau tidak.
		if (!isEmpty()) {
			
			// Mengecek data di dalam stack apakah ada isinya atau tidak.
			System.out.println("Isi Stack :");
			
			// Pengulangan for berfungsi untuk mengecek data yang akan ditampilkan
			for (int i = 0; i < jmlData; i++) {
				
				// Menampilkan data pada stack.
				System.out.println(dataStack[i]);
				
			} // Pengecekan akan keluar dan selesai.
			
		} else { // Jika di dalam stack data nya masih kosong.
			
			// Maka akan menampilkan tulisan “Stack Kosong”.
			System.out.println("Stack Kosong");
		}
	}
}
