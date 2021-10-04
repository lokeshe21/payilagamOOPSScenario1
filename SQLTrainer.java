package JavaSce;

public class SQLTrainer extends Trainer {
	
	public SQLTrainer(String name,String dept, String instiute) {
		super(name,dept,instiute);
		
	}
	
	
	
	public static void main(String[] args) {
		SQLTrainer trainerRam= new SQLTrainer("Ram","CSE", "Paiylagam");
		trainerRam.setSalary(12000);
		trainerRam.training();
		
	

}
}
