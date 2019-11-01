package sorting;

public class Cat implements Comparable {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Comparable objectToCompareWith) {
		// ((Cat) objectToCompareWith).getName() == this.name;
		return 0;
	}
}