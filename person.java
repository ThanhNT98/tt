package oop;

import java.util.Calendar;

    public class person {
	public String name;
	public String code;
	public int birthday;
	
//	public person(String vname, String vcode, int vbirthday) {
//		
//		this.name=vname;
//		this.code=vcode;
//		this.birthday=vbirthday;
//	
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
    public int getAge() {
		
		Calendar now=Calendar.getInstance();
		return now.get(Calendar.YEAR)-this.getBirthday();
		
		
	}
	 public void showInfo() {
		 System.out.println("Name: "+this.getName());
		 System.out.println("Code: "+this.getCode());
		 System.out.println("Birthday: "+this.getBirthday());
		 System.out.println("Age: "+this.getAge());
	 }

}
