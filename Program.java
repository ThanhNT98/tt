package oop;

public class Program {

	public static void main(String[] args) {
		Medicine med = new Medicine();
		Medicine mad = new Medicine("A", "A","a", 1, 1, "A", "A", 10);
		mad.Print();
	        med.IncreaseQuantity(50);
	        System.out.println("Test the first Print() method");
	        med.Print();
	        System.out.println("\nTest the second Printf() method");
	        med.Print("code");
	        System.out.println("\nTest the third Print() method");
	        med.Print("code","name");

	}

}
