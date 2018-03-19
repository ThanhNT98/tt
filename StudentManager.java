package oop;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class StudentManager {
	Student studentList[]=new Student[50];
	int numOfStudent=0;
	
	public Student getStudentByIndex(int index) {
		return studentList[index];
	}
	

	public int addStudent(Student newStudent) {
		
		if (numOfStudent==studentList.length)System.out.println("The list is full!");
		if (numOfStudent < studentList.length) {
			    studentList[numOfStudent++]=newStudent;
			    return 1;
		}
		else {
			return 0;
		}
	}
	public void printStudentList() {
		System.out.println("Student List: ");
		for(int i=0; i<numOfStudent;i++) {
			System.out.println(studentList[i].toString());
		}
	}
	
	public int findStudent(String ID) {
		
		//code
		for(int i=0;i<numOfStudent;i++)
			if(ID.equals(studentList[i].getmID())) return i;
		
		return -1;
	}
	
	public void updateStudent() {
		//code
		if(numOfStudent==0) System.out.println("Empty list!");
		String code;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the code of updated student:");
		code=sc.nextLine();
		int pos=findStudent(code);
		if(pos<0) System.out.println("This person does not exist!");
		else {
			 
			 String nFullName="";
			 Date nDoB=null;
			 String nPhone="";
			 String nAddress="";
			 
			 System.out.println("Enter student's name: ");
			 nFullName=sc.nextLine().toUpperCase();
			 System.out.println("Enter student's DoB: ");
			 SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
			   try {
				   nDoB = f.parse(sc.next());
			   }
			   catch(Exception ex) {
				   ex.printStackTrace();
			   }
			 System.out.println("Enter student's phone: ");
			 nFullName=sc.nextLine();
			 System.out.println("Enter student's address: ");
			 nFullName=sc.nextLine().toUpperCase();
			 studentList[pos].setmFullName(nFullName);
			 studentList[pos].setmDoB(nDoB);
			 studentList[pos].setmPhone(nPhone);
			 studentList[pos].setmAddress(nAddress);
			 System.out.println("The student "+code+"was updated!");
			 
			 
			 
			 
		}
		
		
	}
}
