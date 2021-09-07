package list.strukdis2020;

import java.util.Scanner;

public class ListMain {
	
	public static void menu() {
		System.out.println("Menu yang tersedia");
		System.out.println("1. addHead");
		System.out.println("2. addTail");
		System.out.println("3. addMiddle");
		System.out.println("4. removeHead");
		System.out.println("6. removeTail");
		System.out.println("5. removeMiddle");
		System.out.println("7. displayElement");
		System.out.println("8. countElement");
		System.out.println("9. searchElement");
		System.out.println("99. exit");
	}
	
	public static void main(String[] args) {
		ListProcess list = new ListProcess();
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		int nilai = 0;
		int posisi = 0;
		while (menu != 99) {
			menu();
			System.out.print("masukan menu yang anda inginkan : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : System.out.println("+++ ADD HEAD ++++");
					 System.out.print("masukan nilai untuk node baru:");
					 nilai = sc.nextInt();
					 list.addHead(nilai);
					 break;
			case 2 : System.out.println("+++ ADD TAIL ++++");
					 System.out.print("masukan nilai untuk node baru:");
					 nilai = sc.nextInt();
					 list.addTail(nilai);
					 break;
			case 3 : System.out.println("+++ ADD MIDDLE ++++");
					 System.out.print("masukan nilai untuk node baru:");
					 nilai = sc.nextInt();
					 System.out.print("masukan urutan node yang diinginkan untuk disisipkan:");
					 posisi = sc.nextInt();
					 list.addMiddle(nilai, posisi);
					 break;
			case 4 : System.out.println("+++ REMOVE HEAD ++++");
					 list.removeHead();
					 break;
			case 5 : System.out.println("+++ REMOVE TAIL ++++");
					 list.removeTail();
					 break;
			case 6 : System.out.println("+++ REMOVE MIDDLE ++++");
					 System.out.print("masukan nilai untuk node yang ingin dihapus:");
					 nilai = sc.nextInt();
					 list.removeMid(nilai);
					 break;
			case 7 : System.out.println("+++ DISPLAY ELEMENT ++++");
					 list.displayElement();
					 break;
			case 8 : System.out.println("+++ COUNT ELEMENT ++++");
					 System.out.println("Jumlah element = "+ list.countElement());
					 break;
			case 9 : System.out.println("+++ SEARCH ELEMENT ++++");
					 System.out.print("masukan nilai untuk node yang ingin dicari:");
					 nilai = sc.nextInt();
					 list.searchElement(nilai);
					 break;
			case 99 : System.out.println("Selamat Tinggal");
					 break;
			default : System.out.println("Menu tidak ditemukan");
					break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
