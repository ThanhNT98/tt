package oop;

public class Fraction {
	public int numerator;
	public int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	public Fraction(Fraction fractionA, Fraction fractionB, String operator) {
		switch (operator) {
		case "+":add(fractionA, fractionB); break;
		case "-":sub(fractionA, fractionB); break;
		case "*":
		case "x":
		case ".":
		case "X":
			     mul(fractionA, fractionB); break;
		case "/":
		case ":":
			     div(fractionA, fractionB); break;

		default:
			break;
		}
		
	}
	
	public String print() {
		return this.getNumerator()+"/"+this.getDenominator();
	}
	
	public void normalize() {
		int ucln=this.UCLN(this.getNumerator(), this.getDenominator());
		if(ucln>1) {
		this.setNumerator(this.getNumerator()/ucln);
		this.setDenominator(this.getDenominator()/ucln);
		}
		
		
	}
	
	public void add(Fraction fractionA, Fraction fractionB) {
		this.numerator=fractionA.getNumerator()*fractionB.getDenominator()+fractionA.getDenominator()*fractionB.getNumerator();
		this.denominator=fractionA.getDenominator()*fractionB.getDenominator();
		this.normalize();
		
	}
	
    public void sub(Fraction fractionA, Fraction fractionB) {
    	this.numerator=fractionA.getNumerator()*fractionB.getDenominator()-fractionA.getDenominator()*fractionB.getNumerator();
		this.denominator=fractionA.getDenominator()*fractionB.getDenominator();
		this.normalize();
		
	}
    public void mul(Fraction fractionA, Fraction fractionB) {
    	this.numerator=fractionA.getNumerator()*fractionB.getNumerator();
    	this.denominator=fractionA.getDenominator()*fractionB.getDenominator();
		this.normalize();
    	
	
    }
    public void div(Fraction fractionA, Fraction fractionB) {
    	this.numerator=fractionA.getNumerator()*fractionB.getDenominator();
    	this.denominator=fractionA.getDenominator()*fractionB.getNumerator();
		this.normalize();
    	
	
    }

    private int UCLN(int x, int y) {
    	
    	int ucln=Math.min(x, y);
    	while(ucln>=1) {
    		if(x % ucln == 0 && y % ucln  ==0) return ucln;
    		ucln--;
    	}
    	return ucln;
    			
    	
    }
    
    public boolean checkNormalize() {
    	
    	if(this.UCLN(this.getNumerator(), this.getDenominator())==1) return true;
    	
    	
    	return false;
    }

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
    
    
	
	

}
