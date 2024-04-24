package Day5;


	class Employee1{
		int eid;
		String name;
		String designation;
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
	class Programmer extends Employee1{
		void print() {
			System.out.println("list of data is");
			System.out.println("employee id :"+ eid);
			System.out.println("employee name :"+name);
			System.out.println("designation :"+designation);
			System.out.println("Salary :"+salary);
			System.out.println("location:"+location);
		}
		
	}
	public class SinglelevelInheritance1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Programmer p1 = new Programmer();
			p1.display();
			p1.print();
			

		}

	}



