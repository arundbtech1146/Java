package Day7;

public class factorial2 {


	static int factorial(int n) {
		if(n==0||n==1) {
			return 1;
		}
		return n* factorial(n-1);
		}
	public static void main(String[] args) {
	
//2. Write a java program to print factorial of a number.
		int num=5;
	System.out.println("factorial of"+" " + num + " "+"is"+" "+factorial(num));
		
	}

}
