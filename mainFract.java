package oop;

public class mainFract {

	public static void main(String[] args) {
		Fraction fractionA=new Fraction(2,4);
		Fraction fractionB=new Fraction(3,8);
		
		Fraction fractionC=new Fraction(fractionA, fractionB, "-");
		System.out.println(fractionA.print()+"-"+ fractionB.print()+"=" +fractionC.print());
		
//		System.out.println(fractionA.print());
//		System.out.println(fractionB.print());
		
		
		//System.out.println(fractionA.UCLN());
		
//		if (fractionA.checkNormalize()==true) System.out.println(fractionA.print()+"toi gian");
//		else System.out.println(fractionA.print()+"k toi gian");
		
		System.out.println(fractionA.print());
		fractionA.normalize();
		System.out.println(fractionA.print());
	}

}
