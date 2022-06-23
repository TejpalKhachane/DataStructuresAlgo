package my.java8.parallelStream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumbers {

	public static void main(String[] args) {

		long count = Stream.iterate(0, n -> n + 1).limit(1000000)
				 .parallel() //with this 23s, without this 1m 10s
				.filter(PrimeNumbers::isPrime).peek(x -> System.out.format("Thread : " + Thread.currentThread().getName() + "%s\t", x)).count();

		System.out.println("\nTotal: " + count);
	}

	public static boolean isPrime(int number) {
		if (number <= 1)
			return false;
		return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
	}
}
