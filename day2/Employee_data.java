/* /* Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:

Ashwin

1994

64C- WallsStreat

Robert

2000

68D- WallsStreat

John

1999

26B- WallsStreat */ */
class Employee_data{
	public static void main(String[] args){
		Employee showcase1 = new Employee("Ashwin",1994,6,"64C- WallsStreat");
		Employee showcase2 = new Employee("Robert",2000,8,"68D- WallsStreat");
		Employee showcase3 = new Employee("John",1999,6,"26B- WallsStreat");
		System.out.println("First Employee: ");
		showcase1.show();
		System.out.println("Second Employee: ");
		showcase2.show();
		System.out.println("Third Employee: ");
		showcase3.show();
		
	}
}