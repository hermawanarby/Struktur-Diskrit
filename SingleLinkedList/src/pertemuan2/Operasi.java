/*
 * NRP: 193040161
 * Nama: Hermawan Arby
 */
package pertemuan2;

public class Operasi {
	Node head;
	
	boolean isEmpty() {
		return (head == null);
	}
	
	void tambahDepan(int dataBaru) {
		Node tambahData = new Node(dataBaru);
		tambahData.data = dataBaru;
		tambahData.pointer = null;
		if (isEmpty()) {
			head = tambahData;
		} else {
			tambahData.pointer = head;
			head = tambahData;
		}
		System.out.println("Data telah ditambahkan");
	}
	
	void tambahAkhir(int dataBaru) {
		Node tambahData = new Node(dataBaru);
		tambahData.data = dataBaru;
		tambahData.pointer = null;
		if (isEmpty()) {
			head = tambahData;
		} else {
			Node bantu = head;
			while (bantu.pointer != null) {
				bantu = bantu.pointer;
			}
			bantu.pointer = tambahData;
		}
		System.out.println("Data telah ditambahkan");

	}
	
	void hapusDepan() {
		Node hapus;
		int dataHapus;
		if (!isEmpty()) {
			if (head.pointer != null) {
				hapus = head;
				dataHapus = hapus.data;
				head = head.pointer;
			} else {
				dataHapus = head.data;
				head = null;
			}
			System.out.println("Data yang dihapus " + dataHapus);
		} else {
			System.out.println("Data masih kosong");
		}
	}
	
	void hapusBelakang() {
		Node hapus;
		Node bantu;
		int dataHapus;
		if(!isEmpty()) {
			if (head.pointer != null) {
				bantu = head;
				while (bantu.pointer.pointer != null) {
					bantu = bantu.pointer;
				}
				hapus = bantu.pointer;
				dataHapus = hapus.data;
				bantu.pointer = null;
			} else {
				dataHapus = head.data;
				head = null;
			}
			System.out.println("Data yang dihapus " + dataHapus);
		} else {
			System.out.println("Data masih kosong");
		}
	}
	
	void tampilData() {
		Node posisi = head;
		if (isEmpty()) {
			System.out.println("Data masih kosong");
		} else {
			while (posisi != null) {
				System.out.print(posisi.data+", ");
				posisi = posisi.pointer;
			}
		}
	}
}
