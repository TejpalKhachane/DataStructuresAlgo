package my.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class LargeFile {

	public static void main(String[] args) throws IOException {
		
		Path path = Path.of("LargeFile.txt");
		Files.deleteIfExists(path);
		
		String message = "Tejpal Ravindra Khachane Pune";
		Files.write(path, message.getBytes());
		while (Files.size(path) < 2000000000) {
			Files.write(path, message.getBytes(), StandardOpenOption.APPEND);
			Files.write(path, "\n".getBytes(), StandardOpenOption.APPEND);
		}
		System.out.println("Done writing!");
		Files.lines(path).forEach(System.out::println);
		
		//Files.deleteIfExists(path);		
	}
}
