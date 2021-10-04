package JavaSce;

public class Trainer{
	String name,dept="Java",instiute="Paiylagam";
	private int salary;

	 
	public  Trainer(String name,String dept, String instiute) {
		this.dept = dept;
		this.name = name;
		this.instiute= instiute;
		
	}
	public int getSalary() {
		return this.salary;
		
	}
	public void setSalary(int sal) {
		
		this.salary= sal;
		
	}
	public static void main(String[] args) {
			
	Trainer trainerKumar= new Trainer("Kumar","CSE", "Paiylagam");
	
	trainerKumar.setSalary(10000);
	trainerKumar.training();
	
	
	}
	public void training() {
		
      		
		System.out.println("Trainer "+name+" of "+dept+" dept from "+instiute+"and salary is "+salary);
	}
	
	



}
