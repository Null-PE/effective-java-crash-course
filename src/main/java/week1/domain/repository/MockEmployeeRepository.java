package week1.domain.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import week1.domain.value.Employee;

public class MockEmployeeRepository implements EmployeeRepository {

	@Override
	public List<Employee> findAll() {

		List<Employee> employees = new ArrayList<Employee>();

		Employee emp1 = new Employee();
		emp1.empId = 1;
		emp1.empNo = "1";
		emp1.empNm = "Kobayashi Taro";
		emp1.entryDate = LocalDate.of(2000, 4, 1);

		Employee emp2 = new Employee();
		emp2.empId = 2;
		emp2.empNo = "2";
		emp2.empNm = "Kobayashi Jiro";
		emp2.entryDate = LocalDate.of(2001, 4, 1);

		Employee emp3 = new Employee();
		emp3.empId = 3;
		emp3.empNo = "3";
		emp3.empNm = "Kobayashi Saburo";
		emp3.entryDate = LocalDate.of(2002, 4, 1);

		employees.add(emp3);
		employees.add(emp1);
		employees.add(emp2);
		
		return employees;
	}

}
