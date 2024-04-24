package Day4;





class Overload {
	Overload(String Name, int Age){
		System.out.println("Name:"+Name);
		System.out.println("Age:"+Age);
	}
	Overload(String Name, int Age,String Gender){
		System.out.println("Name:"+Name);
		System.out.println("Age:"+Age);
		System.out.println("Gender:"+Gender);
	}
}

public class ConstructorOverloading9{
	public static void main(String[] args) {
	 Overload o1 = new Overload("Sumathi",20);
	 Overload o2 = new Overload("Sumathi",20,"Female");
	}
}

