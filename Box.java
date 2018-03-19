package oop;

public class Box {
	int length=0;
	int width=0;
	int depth=0;
	//Overloading constructors
	public Box() {
		
	}
	public Box(int l) {
		length=l>0? 1:0;
	}
	public Box(int l, int w) {
		length=l>0 ? 1:0;
		width=w>0? w:0;
	}
	public Box(int l, int w, int d) {
		length=l>0? l:0;
		width=w>0? w:0;
		depth=d>0? d:0;
	}
	
	//Overloading method
	public void setEdge(int l, int w) {
		length=l>0? 1:0;
		width=w>0? w:0;
	}
	public void setEdge(int l, int w, int d) {
		length=l>0? l:0;
		width=w>0? w:0;
		depth=d>0? d:0;
		
	}
	public void output() {
		String S="["+length+","+width+","+depth+"]";
		System.out.println(S);
		
	}
	
}
