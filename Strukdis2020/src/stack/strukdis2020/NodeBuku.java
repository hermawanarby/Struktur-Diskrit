package stack.strukdis2020;

public class NodeBuku {
	private String judulBuku;
	private NodeBuku next; //pointer
	
	public NodeBuku(String judul) {
		//constructor untuk pembuatan objek node
		judulBuku = judul;
		next = null; //default value
	}

	public String getJudulBuku() {
		return judulBuku;
	}

	public void setJudulBuku(String judulBuku) {
		this.judulBuku = judulBuku;
	}

	public NodeBuku getNext() {
		return next;
	}

	public void setNext(NodeBuku next) {
		this.next = next;
	}
}
