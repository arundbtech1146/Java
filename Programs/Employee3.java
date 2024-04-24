package Day4;

public class Employee3 {
    private int id;
    private String name;
    private int salary;
    public int getid() {
    	return id;
    }
    public void setid(int id) {
    	this.id=id;
    }
    public String getname() {
    	return name;
    }
    public void setname(String name) {
    	this.name=name;
    }
    public int getsalary() {
    	return salary;
    }
    public void setsalary(int salary) {
    	this.salary=salary;
    }
    
	public static void main(String[] args) {
		Employee3  e = new Employee3 ();
		e.setid(1);
		e.setname("sumathi");
		e.setsalary(100000);
		System.out.println("your id is:"+e.getid());
		System.out.println("your name is:"+e.getname());
		System.out.println("your salary is:"+e.getsalary());
	}

}
