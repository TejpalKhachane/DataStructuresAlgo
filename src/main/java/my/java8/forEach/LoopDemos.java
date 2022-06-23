package my.java8.forEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

public class LoopDemos {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 40);
		map.put("E", 50);
		map.put(null, 45);
		map.put("F", 60);

		/*
		 * for (Map.Entry<String, Integer> entry : map.entrySet()) {
		 * System.out.println("Key : " + entry.getKey() + ", Value : " +
		 * entry.getValue()); }
		 */

		map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));

		map.forEach((k, v) -> {
			// yes, we can put logic here
			if (k != null) {
				System.out.println("Key : " + k + ", Value : " + v);
			}
		});

		List<String> list = new ArrayList<>();

		list.add("Pallavi");
		list.add("Tejpal");
		list.add("Khachane");
		list.add(null);
		list.add("Atarwal");
		list.add(null);

		list.add("Pune");

		// lambda
		// list.forEach(x -> System.out.println(x));

		// method reference
		list.forEach(System.out::println);

		list.stream()
			.filter(Objects::nonNull)
			.forEach(System.out::println);

		Consumer<String> printLength = (String x) -> {
			System.out.println(x + " - " + x.length());

		};

		list.stream()
			.filter(Objects::nonNull)
			.forEach(printLength);

	}
}
