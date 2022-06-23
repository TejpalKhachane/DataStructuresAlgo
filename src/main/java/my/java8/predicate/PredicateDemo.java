package my.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> noGreaterThan5 =  x -> x > 5;
		
		Predicate<Integer> lessThanEqual8 =  x -> x <= 8;

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream()
                .filter(noGreaterThan5.and(lessThanEqual8))
                .collect(Collectors.toList());

        System.out.println(collect); // [6, 7, 8, 9, 10]

	}

}
