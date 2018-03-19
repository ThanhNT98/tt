package oop;

import java.util.Scanner;

import sv.SinhVien;

public class MainSV {
	    SinhVien a[]=new SinhVien [50];

		private static book book1=null;

		public static void main(String[] args) {
			int choice;
			Scanner sc = new Scanner(System.in);
			do {
			System.out.println("----------------QUAN LY SINH VIEN-------------");
			System.out.println("1-XEM DANH SACH SINH VIEN");
			System.out.println("2-THEM SINH VIEN");
			System.out.println("3-TIM SINH VIEN");
			System.out.println("4-CAP NHAT THONG TIN SINH VIEN");
			System.out.println("5-EXIT");
			System.out.println("Enter your number [1-5]: ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: xemDanhSach();

				break;
			case 2: themSV();
				break;
			case 3:timSV();
				break;
			case 4:capNhatTTSV();
				break;
			default:
				System.out.println("GOOD BYE!");
				break;
			   }
			
			}while(choice>0 || choice <4);
			sc.close();
		}
		
        
		public static void xemDanhSach() {
			
		}
        public static void themSV() {
			
		}
        public static void timSV() {
			
		}
        public static void capNhatTTSV() {
			
		}

}
