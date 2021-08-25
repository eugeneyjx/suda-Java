package สตั้ศý;

class Diverseclass{
	public static void main(String args[]) {
		Employee a=new Employee();
		System.out.println(a.comSalary(10));
		Manager b=new Manager();
		System.out.println(b.comSalary(10));
		Contractor a=new Contractor();
		System.out.println(c.comSalary(10));
	}
}

class Employee {
	String name;
	int age;
	String dept;
	String date;
	Date startDate;
	int basicSalary;
	int comSalary(int dyear) {
		int Salary=basicSalary+dyear*20;
		return Salary;
	}
}

class Manager extends Employee 
{
	int bonus;
	int comSalary(int dyear) {
		int Salary=basicSalary+dyear*20+bonus;
		return Salary;
	}
}
class Contractor extends Employee{
	int overtime;
	int comSalary(int dyear) {
		int Salary=basicSalary+(overtime-dyear)*15;
		return Salary;
	}
}

