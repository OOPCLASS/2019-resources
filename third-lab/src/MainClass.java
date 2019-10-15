public class MainClass {

	public static void main(String[] args) {
//		Phone pixel = new Phone();
//		pixel.brandName = "pixel-here";
//		System.out.println(pixel.brandName);
		Phone nexus = new Phone("nexus");
		Phone pixel = new Phone();
		pixel.brandName = "pixel";
		System.out.println(nexus.brandName);
		System.out.println(pixel.brandName);
		
		pixel.turnOn();
		nexus.turnOn();
		
		pixel.brandName = "pixel";
		pixel.changeName(pixel);
		System.out.println("~~" + pixel.brandName);;
	}

}
