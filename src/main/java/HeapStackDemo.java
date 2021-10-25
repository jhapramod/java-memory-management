import java.util.ArrayList;
import java.util.List;

public class HeapStackDemo {

	public static void main(String[] args) {
		int value = 7;
		
		List<String> list = new ArrayList<String>();
		list.add("Wunderkind");
		list.add("Team");
		
		value = calculate(value, list);
		
		System.out.println(value);
		list.forEach(System.out::println);
		

	}

	private static int calculate(int data, List<String> newList) {
		int tempValue = data + 3;
		int newValue = tempValue * 2;
		newList.add("LGS");
		
		return newValue;
	}

}
