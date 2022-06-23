package my.java8.parallelStream;

import java.util.stream.IntStream;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		
		// print numbers		
		System.out.println("Normal...");
        IntStream range = IntStream.rangeClosed(1, 10);
        range.forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
        });

        System.out.println("Parallel...");
        IntStream range2 = IntStream.rangeClosed(1, 10);
        range2.parallel().forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
        });
        
        

	}

}
