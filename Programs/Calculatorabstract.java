package Day3;





	
	import java.util.*;

	public abstract class Calculatorabstract {

		 abstract void add(int a,int b);
		abstract  void  sub(int a,int b);
		abstract void  mul(int a,int b);
        abstract void div(int a,int b);
	    abstract void mod(int a,int b);
	}

	class Calculator extends Calculatorabstract {

		void add(int a,int b){
	                System.out.println(a+b);
		};
		void sub(int a,int b){
	                System.out.println(a-b);
		};
		void mul(int a,int b){
	                System.out.println(a*b);
		};
		void div(int a,int b){
	                System.out.println(a/b);
		};
		void mod(int a,int b){
	                System.out.println(a%b);
		};


		public static void main(String[] args) {
			Calculator t1 = new Calculator();
			int a,b;

			Scanner i = new Scanner(System.in);

			System.out.println("Enter num 1: ");
			a = i.nextInt();
			System.out.println("Enter num 2: ");
			b = i.nextInt();

	        t1.add(a,b);
	        t1.sub(a,b);
	        t1.mul(a,b);
	        t1.div(a,b);
	        t1.mod(a,b);
	    }
	    

	}




