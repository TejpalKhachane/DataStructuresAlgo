package my.java8.fileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileHandling {

	public static void main(String[] args) {
		String fileName = "C:\\MyWork\\Eclipse\\DsAlgo\\src\\filetoRead.csv";
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			Long count = stream
					.parallel()
					.filter(line -> line.contains("20000"))
					//.peek(x -> System.out.println("Thread : " + Thread.currentThread().getName()))
					.collect(Collectors.counting());
			System.out.println(count);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// list.forEach(System.out::println);

	}

}
