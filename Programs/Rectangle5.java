package Day7;


	import java.util.Scanner;
	public class Rectangle5 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the length of a rectangle :");
		    int length = sc.nextInt();
		    System.out.println("enter the width of a rectangle :");
		    int width = sc.nextInt();
		    
		    int Area = length * width ;
		    System.out.println("the area is :" + Area);
		    
		    sc.close();
		}

	}



