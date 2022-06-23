package my.java8.methodReference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1,"Tejpal"));
		list.add(new Employee(2,"John"));
		list.add(new Employee(3,"Martin"));
		list.add(new Employee(4,"Joshua"));
		list.add(new Employee(5,"Mark"));
		
		
		Comparator<Employee> employeeNameComparator = Comparator.comparing(Employee::getName).reversed();						
		list.sort(employeeNameComparator);
		list.forEach(emp -> System.out.println(emp.getName()));
		

		list.stream()
        	.sorted(Comparator.comparing(Employee::getId).reversed())
            .map(Employee::getId)
            .collect(Collectors.toList()).forEach(System.out::println);
	}

}
