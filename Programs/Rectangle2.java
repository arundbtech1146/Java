package Day4;



public class Rectangle2 {

	void Area(int r) {
		
		System.out.println("Area of circle:"+(3.14*r*r));
		
	}
  void Area(float l,float b) {
		
		System.out.println("Area of Rectangle:"+(l*b));
		
	}
  void Area(float a) {
	
	System.out.println("Area of circle:"+(a*a));
	
}
void Area(int l,int b,int h) {

	System.out.println("Area of triangle:"+(0.5*l*b*h));
	
}
	

	public static void main(String[] args) {
		Rectangle2 o = new Rectangle2();
		o.Area(2);
		o.Area(12.2f,4.3f);
		o.Area(9.0f);
		o.Area(2,4,5);
	}

}
