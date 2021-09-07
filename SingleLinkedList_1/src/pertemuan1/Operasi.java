/*
 * NRP: 193040161
 * Nama: Hermawan Arby
 */
package pertemuan1;

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
