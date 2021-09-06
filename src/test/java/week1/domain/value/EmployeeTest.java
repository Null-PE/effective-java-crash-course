package week1.domain.value;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testToString() {

		Employee emp = new Employee();
		emp.empId = 1;
		emp.empNo = "1";
		emp.empNm = "Kobayashi Taro";
		emp.entryDate = LocalDate.of(2000, 4, 1);

		assertThat(emp.toString(), is("Employee [empId=1, empNo=1, empNm=Kobayashi Taro, entryDate=2000-04-01]"));

	}

	@Test
	void testEquals() {

		Employee actualEmp = new Employee();
		actualEmp.empId = 1;
		actualEmp.empNo = "1";
		actualEmp.empNm = "Kobayashi Taro";
		actualEmp.entryDate = LocalDate.of(2000, 4, 1);

		Employee expectedEmp = new Employee();
		expectedEmp.empId = 1;
		expectedEmp.empNo = "1";
		expectedEmp.empNm = "Kobayashi Taro";
		expectedEmp.entryDate = LocalDate.of(2000, 4, 1);

		assertTrue(actualEmp.equals(expectedEmp));

	}

	@Test
	void testCompareTo_sortedByEmpId() {
		// * Note remove the comment out for line:Collections.sort(employees);

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

		// Collections.sort(employees);

		assertTrue(employees.get(0) == emp1);
		assertTrue(employees.get(1) == emp2);
		assertTrue(employees.get(2) == emp3);

	}

}
