import java.util.*;

public class ArrayTest {

	public static void main(String[] args) {
		List<String> dataStructure = new ArrayList<String>();
		// List<String> dataStructure = new LinkedLIst<String>();
		// List<String> dataStructure = new Vector<String>();
		dataStructure.add("Hello");
		String array[] = { "world!", "Java", "Interesting" };

		for (String s : array) {
			dataStructure.add(s);
		}

		// print all elements
		for (int i = 0; i < dataStructure.size(); i++) {
			System.out.println(dataStructure.get(i));
		}

		// List iterator: pointer
		ListIterator e = dataStructure.listIterator();

		System.out.println("----------------------");
		// update and write
		while (e.hasNext()) {
			String currentValue = (String) e.next();
			e.set(currentValue + "++");
		}

		// reset pointer
		// e = dataStructure.listIterator();

		// print all elements using iterator
		while (e.hasPrevious()) {
			System.out.println(e.previous());
		}
	}

}
