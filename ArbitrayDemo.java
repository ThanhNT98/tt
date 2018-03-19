package oop;

public class ArbitrayDemo {

	public double sum(double...group) {
		double S=0;
		for(double x: group) S+=x;
		return S;
	}
	public static void main(String[] args) {
		ArbitrayDemo obj=new ArbitrayDemo();
		double total=obj.sum(5.4,3.2,9.08,4);
		System.out.println(total);
//		String line=obj.concate("I", "Love", "You", "!");
//		System.out.println(line);
	}
}
