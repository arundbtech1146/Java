package Day5;


	

	class Employe{
		String name = "sumathi";
		int salary = 10000;
		void print() {
			System.out.println("employee name is :"+name);
		}
	}

	class Programer7 extends Employe{
		void display() {
			System.out.println("employee salary is:"+salary);
		}	
	}

	class Tester1 extends Employe{
		 void display2() {
			 System.out.println("employee details");
		 }
	}
	public class HierarchicalInheritance3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Tester1 t = new Tester1();
			Programer7 p = new Programer7();
			t.print();
			p.display();
			

		}

	}



