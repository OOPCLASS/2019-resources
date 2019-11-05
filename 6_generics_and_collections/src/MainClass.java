import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.setContent("");
		System.out.println(box.getContent());
		
		Box<MyBoxableImpl> secondBox = new Box<>();
		MyBoxableImpl content = new MyBoxableImpl();
		secondBox.setContent(content);
		secondBox.getContent().doSomethingElse();
		
		List<String> stringsList = new LinkedList<>();
		stringsList.add("my-element");
		stringsList.size();
		stringsList.contains("something");
		stringsList.addAll(stringsList);
		
		stringsList.get(0);
		
		Set<String> mySet = new HashSet<>();
		mySet.add("my-element");
		mySet.add("my-element");
		mySet.size();
		
		Collections.sort(stringsList);
		Map<String, List<Watch>> map = new HashMap<>();

//		"a" -> {"alpha", "aro", "abc"}
//		"b" -> {}
//		
//		// all watches.. 
//		// watchesUnderAHundredRON
//		// watchesOverAHundredRON
		
		// read about java streams
		
		
	}
}
