package my.java8.filters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import my.java8.methodReference.Employee;

public class FiltersDemo {
		
	public static void main(String[] args) {
		List<Employee> persons = new ArrayList<>();
		persons.add(new Employee(1, "Tejpal", 30));
		persons.add(new Employee(2, "jack", 20));
		persons.add(new Employee(3, "lawrence", 40));
       
		Employee result1 = persons.stream()
                .filter((p) -> "jack".equals(p.getName()) && 20 == p.getAge())
                .findAny()
                .orElse(null);
		System.out.println(result1.getName());
		
		List<String> collect = persons.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
	}
	
}
