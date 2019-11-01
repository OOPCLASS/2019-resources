
public class Employee extends Person implements Identifiable {

	@Override
	public void sayHello() {
		System.out.println("Employee says hello");
	}

	@Override
	public void sayGoodbye() {
		System.out.println("Employee says goodbye");
		
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
