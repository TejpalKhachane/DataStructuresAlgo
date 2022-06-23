package my.java8.mapReduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapReduce {

	public static void main(String[] args) {
		String[] strings = { "a", "b", "c", "d", "e" };

		// |a|b|c|d|e , the initial | join is not what we want
		String reduce = Arrays.stream(strings).reduce("", (a, b) -> a + "|" + b);
		System.out.println(reduce);
		
		String join = String.join("|", strings);
		System.out.println(join);
		
		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
	 	//java, python, nodejs, ruby
		String result = String.join(", ", list);
		System.out.println(result);
		
		 String result1 = Arrays.stream(strings)
					.collect(Collectors.joining(", ", "{", "}"));
		  
		 System.out.println(result1);
		 
		 String result2 = Arrays.stream(strings)
					.collect(Collectors.joining("|"));
		 
		 System.out.println(result2);
	}

}
