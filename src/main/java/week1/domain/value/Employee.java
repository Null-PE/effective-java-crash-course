package week1.domain.value;

import java.time.LocalDate;

//TODO2 省略されている extends句を記載せよ(select Employee and right click -> open type hierarchy in eclipse)
public class Employee {

	// TODO1 以下を満たすようにリファクタリングせよ
	// empId,empNo,empNm entryDateの値はコンストラクタでセットし、1度セットした後に変更が不可、参照のみ
	// empIdが0以下の値がセットされた場合にIllegalArgumentExceptionをなげる
	// empNo,empNm,entryDateにnullがセットされた場合にNullPointerを投げる
	// ITEM 16 17 49
	public long empId;
	public String empNo;
	public String empNm;
	public LocalDate entryDate;
	//(Advance)ちなみにLocalDateをDateにした場合に1度セットした後に変更が不可を実現するためにはひと工夫が必要です。
	// ITEM 50

	// TODO3 override toString and pass EmployeeTest.testToString (ask help to eclipse)
	// Item 12

	// TODO4 override equals and hashCode (ask help to eclipse)
	// Item 10 11

	// TODO5 force developer not to extend this class
	// Item 17 
	// (Advanced)Basically we should not extend the class which is not designed to extend
	// Item 19

	// TODO6 implements Comparable and pass EmployeeTest.testCompareTo_sortedByEmpId
	// Item 14

}
