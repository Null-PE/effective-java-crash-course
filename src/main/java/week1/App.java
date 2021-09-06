package week1;

import java.util.Collections;
import java.util.List;

import week1.domain.repository.MockEmployeeRepository;
import week1.domain.value.Employee;

public class App {

	public static void main(String[] args) {
		
		// TODO7 : Effective Java Item 64
		MockEmployeeRepository repository = new MockEmployeeRepository();
		List<Employee> employees = repository.findAll();
		
		//remove the comment out after you finish TODO
		//Collections.sort(employees);
		
		// TODO8 : Effective Java Item 58
		for (int i = 0; i < employees.size(); i++) {
			Employee employee = (Employee) employees.get(i);
			System.out.println(employee.toString());
		}
	}
}
