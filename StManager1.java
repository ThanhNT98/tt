package oop;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class StManager1 {
	public static void main(String[] args) {
		int choice;
		Scanner sc= new Scanner(System.in);
		Student1Manager List=new Student1Manager();
		do {
			System.out.println("Select a function!");
			System.out.println("1.Add a new student");
			System.out.println("2.View student list");
			System.out.println("3.Find a student by ID");
			System.out.println("4.Update students'information");
			System.out.println("5.Exit");
			System.out.println("Select: ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:List.add();
				break;
			case 2:List.print();
				break;
			case 3:
				List.search();
				break;
			case 4:List.update();
				break;
			
			
			}
		}
		while(choice>=1 && choice <5);
	}
}
	
