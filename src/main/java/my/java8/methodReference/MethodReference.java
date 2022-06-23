package my.java8.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.codec.digest.DigestUtils;

public class MethodReference {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("node", "java", "python", "ruby");
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String str) {
				System.out.println(str);
			}
		});
		
		list.forEach(str -> System.out.println(str)); // lambda
		
		list.forEach(System.out::println);          // method references
		
		List<String> list2 = Arrays.asList("1", "2", "3", "4");
		try {
			// lambda expression
	        list2.stream()
	                .map(s -> Integer.parseInt(s))
	                .collect(Collectors.toList());

	        // method reference
        	list2.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);
		}catch(NumberFormatException nfe) {
			System.out.println("Exception while converting to number!");
			nfe.printStackTrace();
		}
		
		MethodReference obj = new MethodReference();

		// lambda
        //List<String> result = obj.map(list, x -> obj.sha256(x));

        // method reference
        List<String> result1 = obj.map(list, obj::sha256NonStatic);

        result1.forEach(System.out::println);
        
        list.forEach(MethodReference::sha256); // consumer -wont return any value here, will have to print it there itself
	}
	
	public <T, R> List<R> map(List<T> list, Function<T, R> func) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(func.apply(t));
        }
        return result;
    }
	
	// sha256 a string
    public String sha256NonStatic(String str) {
        return DigestUtils.sha256Hex(str);
    }
	
	// sha256 a string
    public static String sha256(String str) {
    	System.out.println(DigestUtils.sha256Hex(str));
        return DigestUtils.sha256Hex(str);
    }
	
}
