package oop;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Student1Manager {
	private Student1[] list=new Student1[50];
	private int count=0;
	private String mID;
	public Student1Manager ()
	{
		
	}
	int find(String ID) {
		for(int i=0;i<count;i++)
			if(ID.equals(list[i].getmID())) return i;
		return -1;
	}
	public void search() {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter student's ID: ");
        mID = sc.nextLine();
        
        int dem=0;
        for (int i = 0; i < count; i++) {
            if (mID.equalsIgnoreCase(list[i].getmID()) == true) {
                System.out.println(list[i].toString());
                dem++;
            } 
        }
            
        if(dem==0)  System.out.println("khong tim thay sinh vien co ma so: " + mID);
       
        
    }
	public void add() {
		if(count == list.length) System.out.println("List is full!");
		else {
			String nID, nName, nPhone, nAddr;
			Date nDoB=null;
			Scanner sc=new Scanner(System.in);
			int pos;
			do {
				System.out.println("Enter student's ID:");
				nID=sc.nextLine().toUpperCase();
				pos=find(nID);
				if(pos>=0) System.out.println("This ID existed!");
				
			}
			while(pos>=0);
			System.out.println("Enter the student's name:");
			nName=sc.nextLine().toUpperCase();
			System.out.println("Enter student's date of birth: ");
			SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
			   try {
				   nDoB = f.parse(sc.nextLine());
			   }
			   catch(Exception ex) {
				   ex.printStackTrace();
			   }
			
		    System.out.println("Enter student's phone: ");
		    nPhone=sc.nextLine();
		    System.out.println("Enter student's address: ");
			nAddr=sc.nextLine().toUpperCase();
			list[count++]=new Student1(nID, nName, nDoB, nPhone, nAddr);
			System.out.println("New student has been added!");
			
		}
		
		
	}
	
	public void update() {
		//code
		if(count==0) {System.out.println("Empty list!");
		return;
		}
		String code;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the code of updated student: ");
		code=sc.nextLine().toUpperCase();
		int pos=find(code);
		if(pos<0) System.out.println("This person does not exist!");
		else {
			 
			 String nFullName;
			 Date nDoB=null;
			 String nPhone;
			 String nAddress;
			 
			 System.out.println("Enter student's name: ");
			 nFullName=sc.nextLine().toUpperCase();
			 System.out.println("Enter student's DoB: ");
			 SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
			   try {
				   nDoB = f.parse(sc.nextLine());
			   }
			   catch(Exception ex) {
				   ex.printStackTrace();
			   }
			 System.out.println("Enter student's phone: ");
			 nPhone=sc.nextLine();
			 System.out.println("Enter student's address: ");
			 nAddress=sc.nextLine().toUpperCase();
			 list[pos].setmFullName(nFullName);
			 list[pos].setmDoB(nDoB);
			 list[pos].setmPhone(nPhone);
			 list[pos].setmAddress(nAddress);
			 System.out.println("The student "+code+" was updated!");
			 
			 
			 
			 
		}
	}
	public void print() {
		if(count==0)
		{
			System.out.println("Empty list!");
			return;
		}
		System.out.println("LIST OF STUDENTS: ");
		for(int i=0;i<count;i++)
			System.out.println(list[i].toString());
	}
}
	
