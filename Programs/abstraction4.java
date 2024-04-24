package Day5;


abstract class Bank{
	int a = 1000;
	int b =4500;
	abstract void withdraw();
	abstract void deposit();
	void display() {
		System.out.println("bank display method");
	}
}
class Atm extends Bank{
	void withdraw() {
		System.out.println("withdrawn amount:"+ a);
	}
	void deposit() {
		System.out.println("deposit amount:"+ b);
	}
}
public class abstraction4 {
	public static void main(String []args) {
		Atm atm = new Atm();
		atm.display();
		atm.withdraw();
		atm.deposit();
	}
}
