package Day3;



	import java.util.Scanner;

	public class getinputnamedep {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Getting input from the user
	        System.out.println("Enter your name: ");
	        String name = scanner.nextLine();

	        System.out.println("Enter your department: ");
	        String department = scanner.nextLine();

	        System.out.println("Enter your mobile number: ");
	        String mobile = scanner.nextLine();

	        System.out.println("Enter your college: ");
	        String college = scanner.nextLine();

	        System.out.println("Enter your address: ");
	        String address = scanner.nextLine();

	        // Displaying the input provided by the user
	        System.out.println("\nUser Information:");
	        System.out.println("Name: " + name);
	        System.out.println("Department: " + department);
	        System.out.println("Mobile Number: " + mobile);
	        System.out.println("College: " + college);
	        System.out.println("Address: " + address);

	        scanner.close();
	    }
	}


