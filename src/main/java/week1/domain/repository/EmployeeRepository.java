package week1.domain.repository;

import java.util.List;

import week1.domain.value.Employee;

public interface EmployeeRepository {

	public List<Employee> findAll();

}
