package oop;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Student1 {
		private String mID="";
		private String mFullName="";
		private Date mDoB=null;
		private String mPhone="";
		private String mAddress="";
		
		public Student1() {}
		
		public Student1(String ID, String FullName, Date DoB, String Phone, String Address) {
			this.mID=ID;
			this.mFullName=FullName;
			this.mDoB=DoB;
			this.mPhone=Phone;
			this.mAddress=Address;
		}

		public String getmID() {
			return mID;
		}

		public void setmID(String mID) {
			this.mID = mID;
		}

		public String getmFullName() {
			return mFullName;
		}

		public void setmFullName(String mFullName) {
			this.mFullName = mFullName;
		}

		public Date getmDoB() {
			return mDoB;
		}

		public void setmDoB(Date mDoB) {
			this.mDoB = mDoB;
		}

		public String getmPhone() {
			return mPhone;
		}

		public void setmPhone(String mPhone) {
			this.mPhone = mPhone;
		}

		public String getmAddress() {
			return mAddress;
		}

		public void setmAddress(String mAddress) {
			this.mAddress = mAddress;
		}
		
		public void input() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter student's ID: ");
			mID=sc.nextLine();
			System.out.println("Enter student's FullName: ");
			mFullName=sc.nextLine();
			System.out.println("Enter student's date of birth: ");
			SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
			   try {
				   mDoB = f.parse(sc.nextLine());
			   }
			   catch(Exception ex) {
				   ex.printStackTrace();
			   }
			
		    System.out.println("Enter student's phone: ");
		    mPhone=sc.nextLine();
		    System.out.println("Enter student's address: ");
			mAddress=sc.nextLine();


		}
		
		public String toString() {
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			return String.format("ID: %s, FullName: %s, DoB:%s ," + "Address: %s, Phone: %s",mID, mFullName,df.format(mDoB), mAddress, mPhone);
		}
		
}
