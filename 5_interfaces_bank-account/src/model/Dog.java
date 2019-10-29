package model;

import sorting.Comparable;

public class Dog implements Comparable {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compare(Comparable objectToCompareTo) {
		// Provide an implementation for comparing two Dog
		// objects.. compare this with objectToCompareTo
		if (objectToCompareTo == null) {
			return 0;
		}
		if (objectToCompareTo instanceof Dog) {
			Dog dogToCompareTo = ((Dog) objectToCompareTo);
			if (this.name == null || dogToCompareTo.getName() == null) {
				if (dogToCompareTo.getName() == null) {
					return 0;
				} else {
					return -1;
				}
			}
			return 0 - this.name.compareTo(dogToCompareTo.getName());
		}
		return 0;
	}

}
