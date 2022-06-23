package my.java8.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/*@FunctionalInterface
public interface Consumer<T> {
  void accept(T t);
}
*/
public class ConsumerDemos {

	public static void main(String[] args) {

		Consumer<String> print = x -> System.out.println(x);
		print.accept("java");

		Consumer<String> printLength = (String x) -> { 	
			System.out.println(x + " - " + x.length());

		};

		List<String> list = new ArrayList<>();

		list.add("Pallavi");
		list.add("Tejpal");
		list.add("Khachane");
		list.add(null);
		list.add("Atarwal");
		list.add(null);
		list.add("Pune");

		list.stream()
			.forEach(print);

		list.stream()
			.filter(Objects::nonNull)
			.forEach(printLength);

	}

}
