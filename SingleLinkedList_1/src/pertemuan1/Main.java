/*
 * NRP: 193040161
 * Nama: Hermawan Arby
 */
package pertemuan1;

import java.util.Scanner;

public class Main {
	
	public static void menu() {
		System.out.println("Selamat Datang...");
		System.out.println("Daftar Menu");
		System.out.println("1. Tambah Depan");
		System.out.println("2. Tambah Akhir");
		System.out.println("3. Tampil Data");
		System.out.println("4. Keluar");
	}

	public static void main(String[] args) {
		Operasi op = new Operasi();
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		int nilai = 0;
		
		while (menu != 4) {
			menu();
			System.out.println("Menu pilihan anda : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : System.out.println("Masukan angka : ");
					 nilai = sc.nextInt();
					 op.tambahDepan(nilai);
					 System.out.println("");
					 break;
			case 2 : System.out.println("Masukan angka : ");
					 nilai = sc.nextInt();
					 op.tambahAkhir(nilai);
					 System.out.println("");
					 break;
			case 3 : System.out.println("Tampil Data");
					 op.tampilData();
					 System.out.println("");
					 break;
			case 4 : System.out.println("Terimakasih");
			 		 break;
			default : System.out.println("Menu tidak ditemukan");
					 System.out.println("");
					 break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
