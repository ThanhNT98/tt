package oop;

import java.util.Scanner;

public class mainBook {
	private static book book1=null;

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("-----------------BOOK MANAGER--------------");
		System.out.println("1-ADD BOOK");
		System.out.println("2-EDIT BOOK");
		System.out.println("3-INFO BOOK");
		System.out.println("4-EXIT");
		System.out.println("Enter your number [1-4]: ");
		choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:addBook();

			break;
		case 2: editBook();
			break;
		case 3:infoBook();
			break;
		case 4:System.out.println("GOOD BYE!");
			break;
		default:
			System.out.println("GOOD BYE!");
			break;
		   }
		
		}while(choice>0 || choice <4);
		sc.close();
	}
	
	
	public static void addBook() {
		 Scanner sc=new Scanner (System.in);
		 String bookName="";
		 String bookID="";
		 double bookPrice=0;
		 
		 System.out.println("Name of book: ");
		 bookName=sc.nextLine();
		 System.out.println("ID of book: ");
		 bookID=sc.nextLine();
		 System.out.println("Price of book: ");
		 bookPrice=sc.nextDouble();
		 
		 book1=new book(bookName, bookID, bookPrice);

	}
	
	public static void editBook() {
		Scanner sc=new Scanner(System.in);
		String bookName;
		double bookPrice;
		
		if(book1!=null) {
		System.out.println("Name of book: ");
		bookName=sc.nextLine();
		System.out.println("Price of book: ");
		bookPrice=sc.nextDouble();
		
		book1.setName(bookName);
		book1.setPrice(bookPrice);
		}
		else System.out.println("Book does not exist!");
		
	}
	
	public static void infoBook() {
		if(book1!=null) {
			 book1.showInfo();
			}
			else System.out.println("Book does not exist!");
			
			
		}
		
}
