import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GCDemo {

	private static List<Person> list = new ArrayList<>(); 
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		System.out.println("Free Memory befor : " + run.freeMemory()/1000 + "K");
		System.out.println();
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		executor.execute(() -> {
			for (int i = 0; i < 100_000; i++) {
				Person p = new Person();
				list.add(p);
			}
		});
		
		System.out.println("Free Memory befor : " + run.freeMemory()/1000 + "K");

	}

}

class Person {
	
}