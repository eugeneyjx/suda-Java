package experiment3;

import java.util.*;

class Employee {
	String name;
	int age;
	String dept;
	Date startDate;
	int basicSalary;
	int comSalary()
	{
		Date now=new Date();
		int nowYear=now.getYear();
		int startYear=startDate.getYear();
		int Salary, dyear;
		dyear=nowYear - startYear;
		Salary=basicSalary+dyear*20;
		return Salary;
	}
}

class Manager extends Employee {
	int bonus;
	int comSalary()
	{
		Date now=new Date();
		int Salary, dyear;
		dyear=now.getYear() - startDate.getYear();
		Salary=basicSalary+dyear*20+bonus;
		return Salary;
	}
}

class Contractor extends Employee {
	Date endDate;
	public int comSalary()
	{
		int Salary,dyear;
		dyear=startDate.getYear() - endDate.getYear();
		Salary=basicSalary+dyear*15;
		return Salary;
	}
}

class Diverseclass<T extends Employee>{
	int a(T t) {
		return t.comSalary();
	}
}



