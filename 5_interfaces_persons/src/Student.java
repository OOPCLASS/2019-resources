
public class Student extends Person implements Saveable, Identifiable {

	@Override
	public void sayHello() {
		System.out.println("Student says hello");
		
	}

	@Override
	public void sayGoodbye() {
		System.out.println("Student says goodbye");
		
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
