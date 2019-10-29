package sorting;

public class Arrays {

	public static void sort(Comparable[] elements) {
		Integer elementsLength = elements.length;
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < elementsLength - 1; i++) {
				for (int j = i + 1; j < elementsLength; j++) {
					Comparable leftElement = elements[i];
					Comparable rightElement = elements[j];
					if (leftElement != null && leftElement.compare(rightElement) < 0) {
						sorted = false;
						elements[i] = rightElement;
						elements[j] = leftElement;
					}
				}
			}
		}
		// Provide your own implementation of a sorting
		// algorithm
		// ...
		// elements[0].compare(elements[1])
	}
}
