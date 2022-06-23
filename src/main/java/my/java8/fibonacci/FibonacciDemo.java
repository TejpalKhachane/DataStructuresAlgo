package my.java8.fibonacci;

import java.math.BigInteger;
import java.util.stream.Stream;

public class FibonacciDemo {

	public static void main(String[] args) {
		Stream.iterate(new int[]{1, 1}, t -> new int[]{t[1], t[0] + t[1]})
		.limit(10)
		.map(t -> t[0])
		.forEach(x -> System.out.println(x));

		System.out.println(fib2(10));
		
		BigInteger sum = Stream.iterate(new BigInteger[]{
                BigInteger.ZERO, BigInteger.ONE}, t -> new BigInteger[]{t[1], t[0].add(t[1])})
				.parallel()
                .limit(1000000)
                .map(n -> n[1]) // find, we need n[1]
                .reduce((a, b) -> b).orElse(BigInteger.ZERO);
		
		System.out.println(sum);
		
		System.out.println(fib2(100));
	}
	
	public static BigInteger fib2(int n) {
        if (n <= 1) return BigInteger.valueOf(n);

        BigInteger previous = BigInteger.ZERO, next = BigInteger.ONE, sum;

        for (int i = 2; i <= n; i++) {
            sum = previous;
            previous = next;
            next = sum.add(previous);
        }

        return next;
    }

}
