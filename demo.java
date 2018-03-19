package oop;

public class demo {
		private String name="thanh";
		private int age=19;
	
	
	    public void showInfo1(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	    }
		
		public int sumAb(int a, int b) {
			int sum=0;
			sum=a+b;
			return sum;
					
		}
		
		
	
	    public static void main(String[] args) {
			demo st=new demo();
			st.showInfo1();
			System.out.println("sum: "+st.sumAb(3,4));
			
		}

}
