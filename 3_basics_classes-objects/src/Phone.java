public class Phone {
	public String brandName;
	public Integer ramMemorySize; // in MB
	
	public Phone() {
		brandName = "chinesse-whatever";
		ramMemorySize = 0;
	}
	
	public Phone(String brandName) {
		this.brandName = brandName;
	}
	
	public void turnOn() {
		System.out.println(String.format("%s is booting up", brandName));
	}
	
	public void changeName(Phone phone) {
		phone = new Phone();
	}
}
