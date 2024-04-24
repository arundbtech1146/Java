package Day7;




	import java.util.Scanner;
	public class Area3 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		    System.out.println("enter the radius of the circle :");
		    int radius = sc.nextInt();
		    float area = (float)(3.14 * (radius*radius));
		    System.out.println("the area of the circle is :"+ area);
		    sc.close();

		}

	}

