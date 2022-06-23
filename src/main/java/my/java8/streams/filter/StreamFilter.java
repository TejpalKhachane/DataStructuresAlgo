package my.java8.streams.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(15);
		list.add(20);
		list.add(100);
		
		list.stream().filter(i -> i%2 == 0).forEach(System.out::println);
		
		Long cnt = list
				.stream()
				.filter(i -> i%2 == 0)
				.collect(Collectors.counting());
		
		System.out.println(cnt);
		
		list.stream().map(i -> i*i).forEach(System.out::println);
	}

}
