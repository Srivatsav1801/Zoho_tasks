/* Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:

Ashwin

1994

64C- WallsStreat

Robert

2000

68D- WallsStreat

John

1999

26B- WallsStreat */

class Employee{
	String name;
	int year;
	int salary;
	String address;
	public Employee(String name,int year,int salary,String address){
		this.name = name;
		this.year = year;
		this.salary = salary;
		this.address = address;
	}
	public void show(){
		System.out.println("Name: "+name);
		System.out.println("Year: "+year);
		System.out.println("Salary: "+salary);
		System.out.println("Address: "+address);		
	}
	
}