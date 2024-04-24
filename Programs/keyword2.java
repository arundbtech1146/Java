package day7.keywords;

class Subclass1{
	 String Name;
	 void method(String Name){
		 //this.Name = Name;
	   System.out.println(Name);
	   System.out.println(this.Name);
	 }
	}
class Keyword2 {
	 public static void main(String[] args) {
	   Subclass1 S1 = new Subclass1();
	   S1.method("KPR");
	   Subclass1 S2 = new Subclass1();
	   System.out.println(S1.Name);
	   S1 = S2;
	   System.out.println(S1.Name);  
	 }
	}
