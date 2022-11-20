import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		Set<Integer> setDataStructure = new TreeSet<Integer>();
		//sets will automatically sort and disregard duplicates
		setDataStructure.add(12);
		setDataStructure.add(8);
		setDataStructure.add(12);
		setDataStructure.add(9);
		setDataStructure.add(1);
		
		for(Integer i: setDataStructure)
		{
			System.out.println(i);
		}

	}

}
