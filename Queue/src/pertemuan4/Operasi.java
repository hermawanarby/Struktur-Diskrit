/*
 * NRP : 193040161
 * NAMA: HERMAWAN ARBY 
 */
package pertemuan4;

public class Operasi {
	// Mendeklarasikan variable global FRONT & REAR yang bertipe Node untuk digunakan pada semua method.
	Node FRONT;
	Node REAR;
	
	// Function isEmpty untuk memeriksa kondisi Queue (apakah masih kosong atau tidak).
	public boolean isEmpty() {
		
		// Mengembalikan nilai bahwa FRONT pada node itu berisi null.
		return (FRONT == null);
	}
	
	// Method enqueue untuk menambahkan node/data pada Queue dari belakang,
	// sehingga akan menghasilkan FRONT yang baru, dan memiliki parameter int dataBaru untuk mengirimkan nilai yang baru.
	public void enqueue(int dataBaru) {
		
		// Instansiasi objek newNode untuk membuat node baru.
		Node newNode = new Node(dataBaru);
		
		// Function isEmpty untuk memvalidasi bahwa Queue masih kosong atau sudah ada isinya.
		if (isEmpty()) {
			
			// Jika Queue masih kosong, maka node baru otomatis jadi FRONT dan REAR.
			FRONT = newNode;
			REAR = newNode;
		
		// Jika Queue sudah ada isinya.
		} else {
			
			// Node yang baru REAR nya akan diisi next.
			REAR.next = newNode;
			
			// REAR diisi node baru sebagai penanda node terakhir.
			REAR = newNode;
		}
	}
	
	// Method dequeue untuk menghapus node/data pada Queue dari depan.
	public void dequeue() {
		
		// Mendeklarasikan varibel temp untuk menyimpan data sementara yang akan di hapus.
		Node temp;
		
		// Jika FRONT pada Queue tidak null.
		if (FRONT != null) {
			
			// Jika FRONT sama dengan REAR 
			if (FRONT == REAR) {
				// Maka FRONT dan REAR diisi dengan null
				FRONT = null;
				REAR = null;
				
			// Jika FRONT tidak sama dengan REAR.
			} else {
				
				// Variabel temp akan diisi dengan node FRONT.
				temp = FRONT;
				
				// Node FRONT akan berpindah ke node selanjutnya.
				FRONT = FRONT.next;
			}
		
		// Jika FRONT pada Queue null.
		} else {
			
			// Maka akan menampilkan tulisan "Queue Kosong".
			System.out.println("Queue Kosong");
		}
	}
	
	// Function dataSize untuk menghitung jumlah data yang ada di Queue.
	public int dataSize() {
		
		// curNode sebagai variable yang diisi node sedang dicek
		Node curNode = FRONT;
		
		// Mendeklarasikan variabel count bertipe integer dengan nilai awal 0.
		int count = 0;
		
		// Selama node pada Queue tidak kosong,
		while(curNode != null) {
			
			 // maka count +1.
			count++;
			
			// curNode pindah ke node selanjutnya.
			curNode = curNode.next;
		}
		// Mengembalikan nilai dari varibel count
		return count;
	}
	
	// Method tambilData untuk menampilakan data yang ada di Queue.
	public void tampilData() {
		
		// Variable posisi berfungsi untuk pengecekan data di mulai dari FRONT.
		Node posisi = FRONT;
		
		// Untuk memvalidasi bahwa data yang akan ditampilkan itu kosong atau tidak.
		if (isEmpty()) {
			
			// Jika data di Queue nya kosong maka akan menampilkan tulisan "Queue kosong".
			System.out.println("Queue kosong");
			
		// Jika data di Queue ada.
		} else {
			
			// Selama posisi tidak null alias ada datanya maka
			while (posisi != null) {
				
				// Menampilkan data yang berada pada node setelah dicek.
				System.out.print(posisi.data+" ");
				
				// Posisi node jika sudah dicek maka diisi dengan next untuk pengecekan ke node selanjutnya.
				posisi = posisi.next;
			}
			
			// Untuk memberi jarak antar baris.
			System.out.println("");
		}
	}
}
