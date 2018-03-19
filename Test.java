package oop;


    class Point {
	    int x;
	    int y;
	    
	    public Point() {
	        this.x = 1;
	        this.y = 1;
	    }
	    public Point(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
	    public void print(){
	        System.out.println("x:" +x+ ",y:"+y);
	    }
	}
	public class Test{
	    public static void main(String[] args) {
	        Point p1 = new Point();
	        p1.print();
	        Point p2 = new Point(2,3);
	        p2.print();
	        
	                
	    }
	    
	}
	
	
	
	
	
	
	


