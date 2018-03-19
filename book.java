package oop;

public class book {
	public String name;
	public String ID;
	public double price;
	
	public book(String name, String ID, double price) {
		this.name=name;
		this.ID=ID;
		this.price=price;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("--------------BOOK'S INFO------------");
		System.out.println("Name : "+this.getName());
		System.out.println("ID   : "+this.getID());
		System.out.println("Price: "+this.getPrice());
	}

}
