package list.strukdis2020;

public class ListProcess {
	private Node HEAD;
	
	public boolean isEmpty() {
		//pengecekan apakah List kosong atau sudah ada isi
		if(HEAD == null) {
			//jika masih kosong
			return true;
		} else {
			//jika sudah ada isi
			return false;
		}
	}
	
	public void displayElement() {
		//Menampilkan elemen dimulai dari Head
		Node curNode = HEAD; //curNode sebagai variable yang berisi node sedang dicek
		while(curNode != null) {
			//selama node tidak kosong akan terus dicetak
			System.out.print(curNode.getData()+ " ");
			curNode = curNode.getNext(); //curNode pindah ke node selanjutnya
		}
		System.out.println(" ");
		System.out.println("++++++++++++++++++");
	}
	
	public void addHead(int data) {
		//Menambahkan node dari depan (Head)
		Node newNode = new Node(data); //buat node baru
		if(isEmpty()) {
			//jika list masih kosong, maka node baru otomatis jadi head
			HEAD = newNode;
		} else {
			//jika list tidak kosong maka node baru akan menggeser Head yang lama
			newNode.setNext(HEAD); //next node baru diisi Head (yang lama)
			HEAD = newNode; //node baru menjadi Head yang baru
		}
		displayElement();
	}
	
	public void addTail(int data) {
		//menambahkan node dari belakang
		Node posNode = null, curNode;
		//curNode berisi node yang dicek, posNode berisi node sebelum curNode
		Node newNode = new Node(data); //buat node baru
		if(isEmpty()) {
			//jika list masih kosong, maka node baru otomatis jadi head
			HEAD = newNode;
		} else {
			//jika list tidak kosong maka node baru akan ditambahkan setleah tail
			curNode = HEAD; //pengecekan dimulai dari Head
			while(curNode != null) {
				//selama curNode belum null
				posNode = curNode; //posNode berisikan ode yang sudah dicek
				curNode = curNode.getNext(); //curNode berisikan node selanjutnya
			}
			posNode.setNext(newNode); //jika sudah menemukan Tail, node baru ditambahkan 
		}
		displayElement();
	}
	
	public void addMiddle(int data, int position) {
		Node posNode = null, curNode; //curNode adalah node yang diakses, posNode adalah node sebelum curNode
		int i; //variable yang akan dipakai untuk mendapatkan posisi curNode, akan dibandingkan dengan position
		
		Node baru = new Node (data);
		
		if (HEAD == null) {
			//jika list masih kosong, akan menjadi HEAD
			HEAD = baru;
		} else {
			//jika tidak kosong 
			curNode = HEAD; //pengaksesan dimulai dari HEAD
			if (position == 1) {
				//jika position =1, akan melaksakan proses addHead jika list sudah ada
				baru.setNext(curNode);
				HEAD = baru;
			} else {
				//jika position <> 1
				i=1; //posisi curNode dimulai dari 1 (menunjukan dimulai dari HEAD)
				while ((curNode != null) && (i < position)) { //selama curNode belum Null dan posisi curNode < position (posisi yang dicari)
					posNode = curNode;
					curNode = curNode.getNext();
					i+=1;
				}
				posNode.setNext(baru);
				baru.setNext(curNode);
			}
		}
		displayElement();
	}
	
	public void removeHead() {
		Node temp;
		if (HEAD == null) { //jika antrian kosong
			System.out.println("antrian tidak ada");
		} else {
			temp = HEAD;
			HEAD = HEAD.getNext();
			temp = null;
		}
		displayElement();
	}
	
	public void removeTail() {
		Node posNode = null, curNode;
		//curNode berisi node yang akan dicek, posNode berisi node sebelum curNode
		//curNode menggantikan lastNode pada algoritme di ppt
		//posNode menggantikan preNode pada algoritme di ppt
		if (HEAD == null) { //jika list kosong, tidak terjadi apapun
			System.out.println("antrian tidak ada");
		} else { //jika list sudah ada
			curNode = HEAD; //pengecekan dimulai dari HEAD
			while (curNode.getNext() != null) { //selama bukan Tail
				posNode = curNode;
				curNode = curNode.getNext(); //curNode diisi node berikutnya
			}
			posNode.setNext(null); //node sebelum tail akan menghapus keterhubungan dengan tail
		}
		displayElement();
	}
	
	public void removeMid(int cari) {
		Node posNode = null, curNode;
		//curNode adalah node yang akan dicek (menggantikan delNode)
		//posNode adalah node yang berisi node sebelum curNode (menggantikan preNode)
		int i = 0; //posisi dari curNode
		boolean ketemu = false; //status ditemukan atau tidak 
		
		if (HEAD == null) {
			System.out.println("list kosong");
		} else {
			i = 1; //dimulai dari Head sehingga dimulai dari node ke 1
			curNode = HEAD; //curNode dimulai dari Head
			while ((curNode.getNext() != null) && (!ketemu)) { //selama bukan ta
				if (curNode.getData() == cari) { //jika node berisi nilai yang dicari
					ketemu = true; //status ditemukan 
				} else {
					//jika belum ditemukan, curNode diisi node selanjutnya
					posNode = curNode;
					curNode = curNode.getNext();
					i++;
				}
			}
			//selesai pengulangan
			if (ketemu) { //jika ditemukan
				if (i == 1) { //jika yang dicari adalah Head, maka lakukan removeHead jika list tidak kosong
					Node temp = HEAD;
					HEAD = HEAD.getNext();
					temp = null;
				} else {
					//melepaskan keterkaitan antar posNode dengan curNode dengan cara posNode.next = curNode.next
					posNode.setNext(curNode.getNext());
					curNode = null;
				}
			} else {
				System.out.println("node yang dicari tidak ditemukan");
			}
		}
		displayElement();
	}
	
	public int countElement() {
		//Menampilkan elemen dimulai dari Head
		Node curNode = HEAD; //curNode sebagai variable yang diisi node sedang dicek
		int count = 0;
		while (curNode != null) {
			//selama node tidak kosong count +1
			count++;
			curNode = curNode.getNext(); //curNode pindah ke node selanjutnya
		}
		return count;
	}
	
	public void searchElement(int cari) {
		//Menampilakan elemen dimulai dari Head
		Node curNode = HEAD; //curNode sebagai variable yang berisi node sedang dicek
		int count = 0;
		boolean ketemu = false;
		while ((curNode != null) && (!ketemu)) {
			//selama node tidak kosong count +1
			if (curNode.getData() == cari) {
				ketemu = true;
			}
				curNode = curNode.getNext(); //curNode pindah ke node selanjutnya
				count++;
		}
		
		if (ketemu) {
			System.out.println("node ditemukan pada node ke-"+count);
		} else {
			System.out.println("node tidak ditemukan");
		}
	}
}
