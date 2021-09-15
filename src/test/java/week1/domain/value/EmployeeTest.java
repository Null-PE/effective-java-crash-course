package week1.domain.value;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EmployeeTest {

	@Test
	void testToString() {

		Employee emp = new Employee(1, "1", "Kobayashi Taro", LocalDate.of(2000, 4, 1));
		assertThat(emp.toString(), is("Employee [empId=1, empNo=1, empNm=Kobayashi Taro, entryDate=2000-04-01]"));

	}

	@Test
	void testEquals_AllFiledsAreSame() {

		Employee emp1 = new Employee(1, "1", "Kobayashi Taro", LocalDate.of(2000, 4, 1));
		Employee emp2 = new Employee(1, "1", "Kobayashi Taro", LocalDate.of(2000, 4, 1));

		assertTrue(emp1.equals(emp2));

	}

	@ParameterizedTest
	@CsvSource({ "2,1,Kobayashi Taro,2000-04-01", "1,2,Kobayashi Taro,2000-04-01", "1,1,Kobayashi Jiro,2000-04-01",
			"1,1,Kobayashi Taro,2001-04-02" })
	void testEquals_OneOfTheFiledIsNotSame(long empId, String empNo, String empNm, LocalDate entryDate) {

		Employee emp1 = new Employee(empId, empNo, empNm, entryDate);
		Employee emp2 = new Employee(1, "1", "Kobayashi Taro", LocalDate.of(2000, 4, 1));

		assertFalse(emp1.equals(emp2));

	}

	@Test
	void testHashCode_AllFiledsAreSame() {
		Map<Employee, Long> map = new HashMap<Employee, Long>();
		Employee emp1 = new Employee(1, "1", "Kobayashi Taro", LocalDate.of(2000, 4, 1));
		Employee emp2 = new Employee(1, "1", "Kobayashi Taro", LocalDate.of(2000, 4, 1));
		map.put(emp1, Long.valueOf(1));
		assertThat(map.get(emp2), is(Long.valueOf(1)));

	}

	@ParameterizedTest
	@CsvSource({ "2,1,Kobayashi Taro,2000-04-01", "1,2,Kobayashi Taro,2000-04-01", "1,1,Kobayashi Jiro,2000-04-01",
			"1,1,Kobayashi Taro,2001-04-02" })
	void testHashCode_OneOfTheFiledIsNotSame(long empId, String empNo, String empNm, LocalDate entryDate) {
		Map<Employee, Long> map = new HashMap<Employee, Long>();

		Employee emp1 = new Employee(empId, empNo, empNm, entryDate);
		Employee emp2 = new Employee(1, "1", "Kobayashi Taro", LocalDate.of(2000, 4, 1));

		map.put(emp1, Long.valueOf(1));
		assertThat(map.get(emp2), is(Long.valueOf(1)));

	}

	@Test
	void testCompareTo_sortedByEmpId() {
		// * Note remove the comment out for line:Collections.sort(employees);

		List<Employee> employees = new ArrayList<Employee>();

		Employee emp1 = new Employee(1, "1", "Kobayashi Taro", LocalDate.of(2000, 4, 1));
		Employee emp2 = new Employee(2, "2", "Kobayashi Jiro", LocalDate.of(2000, 4, 2));
		Employee emp3 = new Employee(3, "3", "Kobayashi Saburo", LocalDate.of(2000, 4, 3));

		employees.add(emp3);
		employees.add(emp1);
		employees.add(emp2);

		// Collections.sort(employees);
		assertTrue(employees.get(0) == emp1);
		assertTrue(employees.get(1) == emp2);
		assertTrue(employees.get(2) == emp3);

	}

}
