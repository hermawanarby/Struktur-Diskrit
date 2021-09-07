package stack.strukdis2020;

public class StackProcess {
	
	private NodeBuku top;
	//node paling atas akan disebut node
	
	public NodeBuku dataTop() {
		//hanya menembalikan node manakah yang sedang mengisi posisi TOP
		return top;
	}
	
	public boolean isEmpty() {
		//pengecekan apakah tumpukan kosong atau sudah ada isi
		if (top == null) {
			//jika masih kosong
			return true;
		} else {
			//jika sudah ada isi
			return false;
 		}
	}
	
	public void displayElement() {
		//Menampilakan elemen dimulai dari TOP
		NodeBuku curNode = top; //curNode sebagai variable yang berisi node sedang dicek
		while (curNode != null) {
			//selama node tidak kosong akan terus dicetak
			System.out.println(curNode.getJudulBuku());
			curNode = curNode.getNext(); //curNode pidah ke node selanjutnya
		}
		System.out.println("+++++++++++++++++++++++++");
	}
	
	public void push(String judul) {
		//Menambahkan node, sama seperti proses addHead
		NodeBuku newNode = new NodeBuku(judul); //buat node baru
		if (isEmpty()) {
			//jika stack masih kosong, maka node baru otomatis jadi TOP
			top = newNode;
		} else {
			//jika stack tidak kosong maka node baru akan menggeser Head yang lama
			newNode.setNext(top); //next node baru diisi TOP (yang lama)
			top = newNode; // node baru menjadi TOP yang baru
		}
		displayElement();
	}
	
	public void pop() {
		//proses mengeluarkan elemen dari stack, proses mirip dengan removeHead
		NodeBuku temp;
		if (top == null) { //jika stack kosong
			System.out.println("tumpukan tidak ada");
		} else {
			temp = top;
			top = top.getNext();
			temp = null;
		}
		displayElement();
	}
	
	public int getSize() {
		//Menampilkan elemen dimulai dari TOP
		NodeBuku curNode = top; //curNode sebagai variable yang beirisi node sedang dicek
		int count = 0;
		while (curNode != null) {
			//selama node tidak kosong count +1
			count++;
			curNode = curNode.getNext(); //curNode pindah ke node selanjutnya
		}
		return count; 
	}	
}
