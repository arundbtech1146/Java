package Day5;



	class Employee3{
		int eid;
		String name;String designation;
		int salary;
		String location;
		void display() {
			eid = 001;
			name = "Sumathi";
			designation="developer";
			salary=50000;
			location="coimbatore";
		}
		
	}

	class Programer2 extends Employee3{
		
		void method1() {
			System.out.println("list of data is");
			System.out.println("employee id :"+ eid);
		}
	}

	class Programer3 extends Programer2{
		void print() {
			System.out.println("employee name :"+name);
			System.out.println("designation :"+designation);
			System.out.println("Salary :"+salary);
			System.out.println("location:"+location);

		}
	}
	public class MultilevelInheritance2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Programer3 p1 = new Programer3();
			p1.display();
			p1.method1();
			p1.print();
			

		}
	}



	
