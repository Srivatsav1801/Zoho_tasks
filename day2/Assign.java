/*1.Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

5. Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'. */
class Student{
	String name = "";
	int roll_no;
	public Student(String name,int roll_no){
		this.name = name;
		this.roll_no = roll_no;
	}
	class Student_data{
		int phone_no;
		String address;
		public Student_data(int phone_no,String address){
			this.phone_no = phone_no;
			this.address = address;
		}
	}
	
}
class Assign{
	public static void main(String[] args){
		Student myObj = new Student("John",2);
		System.out.println("Roll no: "+myObj.roll_no+" Name: "+myObj.name);
	}
}