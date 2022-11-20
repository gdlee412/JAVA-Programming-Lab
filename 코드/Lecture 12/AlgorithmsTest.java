import java.util.*;

public class AlgorithmsTest {

	public static void main(String[] args) {
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

		// Create and display a list containing the suits array elements
		List<String> list = Arrays.asList(suits); // create list
		System.out.printf("Unsorted array elements: %s\n", list);

		Collections.sort(list); // sort ArrayList
		System.out.printf("Sorted array elements: %s\n", list);

		Collections.shuffle(list);
		System.out.printf("Shuffle array elements: %s\n", list);

		String[] suitsCopy = new String[4];
		List<String> listCopy = Arrays.asList(suitsCopy);
		Collections.copy(listCopy, list);
		System.out.printf("List Copy elements: %s\n", listCopy);

		List<String> listFill = Arrays.asList(suitsCopy);
		Collections.fill(listFill, "R");
		System.out.printf("List Fill elements: %s\n", listFill);

		int index = Collections.binarySearch(list, "Spades");
		System.out.printf("Element Spades exists in the List at index:%d\n", index);

		int frequency = Collections.frequency(listFill, "R");
		System.out.printf("the repetition of R in the listFill is: %d\n", frequency);

		boolean disjoint = Collections.disjoint(list, listFill);
		System.out.printf("The disjoint of list and listFill is %b\n", disjoint);

		System.out.println("Hollo thore".replace('o', 'e')); // returns
	}

}
