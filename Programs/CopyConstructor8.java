package Day4;


	
	

	class CopyConstructor{
		String name;
		int age;
		CopyConstructor(String Name, int Age){
			name=Name;
			age=Age;
			System.out.println(name);
			System.out.println(age);
		}
		CopyConstructor(CopyConstructor C){
			String Name =C.name;
			int Age= C.age;
			System.out.println(Name);
			System.out.println(Age);
		}
		
	}
	public class CopyConstructor8 {

		public static void main(String[] args) {
			CopyConstructor C1=new CopyConstructor("Arun",21);
			CopyConstructor C2= new CopyConstructor(C1);
		}

	}



