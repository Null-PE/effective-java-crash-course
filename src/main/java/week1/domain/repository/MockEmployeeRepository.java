package week1.domain.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import week1.domain.value.Employee;

public class MockEmployeeRepository implements EmployeeRepository {

	@Override
	public List<Employee> findAll() {

		List<Employee> employees = new ArrayList<Employee>();

		Employee emp1 = new Employee(1, "1", "Kobayashi Taro", LocalDate.of(2000, 4, 1));
		Employee emp2 = new Employee(2, "2", "Kobayashi Jiro", LocalDate.of(2000, 4, 2));
		Employee emp3 = new Employee(3, "3", "Kobayashi Saburo", LocalDate.of(2000, 4, 3));

		employees.add(emp3);
		employees.add(emp1);
		employees.add(emp2);

		return employees;
	}

}
