import java.util.Collections;

import model.Dog;
import sorting.Arrays;

public class MainClass {
	public static void main(String[] args) {
		Dog[] dogs = new Dog[10];

		Dog first = new Dog();
		first.setName("Jack");
		Dog second = new Dog();
//		second.setName("Lessie");
		Dog third = new Dog();
		third.setName("Sara");
		
		dogs[0] = first;
		dogs[1] = second;
		dogs[2] = third;
		// add dogs here

		print(dogs);
		Arrays.sort(dogs);
		System.out.println("---------");
		print(dogs);
	}

	private static void print(Dog[] dogs) {
		for (int i = 0; i < dogs.length; i++) {
			Dog currentDog = dogs[i];
			if (currentDog != null) {
				System.out.println(currentDog.getName());
			}
		}
	}
}
