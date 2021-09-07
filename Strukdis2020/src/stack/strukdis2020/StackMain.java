package stack.strukdis2020;

public class StackMain {
	
	public static void main(String[] args) {
		StackProcess stack = new StackProcess();
		stack.push("Algoritma Pemrograman");
		stack.push("Jaringan Komputer");
		stack.push("Sistem Informasi");
		stack.pop();
		stack.push("Teknik Kompilasi");
		stack.pop();
		System.out.println(stack.dataTop().getJudulBuku());
		System.out.println(stack.getSize());
	}
	
}
