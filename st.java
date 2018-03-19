package oop;

import java.util.Calendar;

public class st extends person{
	
	public st(String vname, String vcode, int vbirthday) {
		//super(vname, vcode, vbirthday);
		
	}
	public double mark;
		
	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("Mark: "+this.getMark());
	}

}
