package Day4;


	
	
	class Bank1{
		int amount;
		public double InterestCal(double amount) {
			return amount*0.05;
		}
	}
	class Bank2 extends Bank1{
		public double InterestCal(double amount) {
			return amount *0.07;
			
		}
	}
	public class Overriding7{

		public static void main(String[] args) {
			Bank1 b =new Bank1();
			Bank2 b2 = new Bank2();
			double amount = 1000;
			System.out.println("Interest from Bank1:"+ b.InterestCal(amount));
			System.out.println("Interest from Bank2:"+ b2.InterestCal(amount));
		}
	}



