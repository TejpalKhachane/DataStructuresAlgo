package my.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		Path path = Path.of("LargeFileToRead.txt");
			
		Map<String, Long> map = Files.lines(path).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
				
		System.out.println(map);
		
		
		String fileName = "LargeFileToRead.txt";
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			Long count = stream
					.parallel()
					.filter(line -> line.contains("Khachane"))
					//.peek(x -> System.out.println("Thread : " + Thread.currentThread().getName()))
					.collect(Collectors.counting());
			System.out.println(count);
						
			
			Map<Object, Long> cnt = Files.lines(Paths.get(fileName))
					.parallel()
					.filter(line -> line.contains("Khachane"))
					.map(String::toLowerCase).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));  
			System.out.println(cnt);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
