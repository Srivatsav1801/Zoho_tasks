/* Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'. */

class Assign_data{
	public static void main(String[] args){
		Student basic_details_1 = new Student("John",2);
		Student.Student_data more_details_1 = basic_details_1.new Student_data(944465215,"64C- WallsStreat");
		Student basic_details_2 = new Student("Sam",3);
		Student.Student_data more_details_2 = basic_details_2.new Student_data(943242345,"56A- WallsStreat");
		System.out.println("Roll no: "+basic_details_1.roll_no+" Name: "+basic_details_1.name+ "Phone no : "+more_details_1.phone_no + " Address: "+more_details_1.address);
		System.out.println("Roll no: "+basic_details_2.roll_no+" Name: "+basic_details_2.name+ "Phone no : "+more_details_2.phone_no + " Address: "+more_details_2.address);

	}
}