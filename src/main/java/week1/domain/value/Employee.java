package week1.domain.value;

import java.time.LocalDate;

public class Employee {

	private long empId;
	private String empNo;
	private String empNm;
	private LocalDate entryDate;

	public Employee(long empId, String empNo, String empNm, LocalDate entryDate) {
		this.empId = empId;
		this.empNo = empNo;
		this.empNm = empNm;
		this.entryDate = entryDate;
	}

	public long getEmpId() {
		return empId;
	}

	public String getEmpNo() {
		return empNo;
	}

	public String getEmpNm() {
		return empNm;
	}

	public LocalDate getEntryDate() {
		return entryDate;
	}

	// TODO4 override toString and pass EmployeeTest.testToString (ask help to
	// eclipse and refactor by using StringJoiner)
	// Item 12

	// TODO5 override equals and hashCode (ask help to eclipse)
	// Item 10 11

	// TODO6 implements Comparable and pass EmployeeTest.testCompareTo_sortedByEmpId
	// Item 14

	// TODO7 which naming is better between EmployeeEnity and EmployeeVo
	
}
