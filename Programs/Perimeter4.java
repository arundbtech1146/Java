package Day7;

	
	
	import java.util.Scanner;
	public class Perimeter4 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			float radius = sc.nextFloat();
			float perimeter =(float) (2* 3.14 *radius);
		    System.out.println("the perimeter of the circle is :"+ perimeter);
		    sc.close();
		}
	}


