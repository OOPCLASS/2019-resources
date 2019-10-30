
public abstract class Person {

	private String name;
	
	public abstract void sayHello();
	
	public abstract void sayGoodbye();
	
	public void presentYourself() {
		sayHello();
		sayGoodbye();
	}
}
