import Student_info_1.Student_info;
import java.util.*;
class Student_mark_cal{
	public static void main(String[] args)
	{
		int i,total=0,avg=0;
		Scanner input = new Scanner(System.in);
		Student_info info = new Student_info();
		System.out.println("Enter the Name of Student: ");
		info.setName(input.nextLine());
		System.out.println("Enter the Roll no of Student:");
		info.setRoll_no(input.nextInt());
		System.out.println("Enter the Marks in 3 Subjects");
		for(i=0;i<3;i++)
		{
			info.setMarks(input.nextInt(),i);
			total += info.getMarks(i);
		}
		avg = total/3;
		System.out.println("The total marks of "+info.getName()+" whose roll no is "+ info.getRoll_No() +" is total= "+total+" and avg marks = "+avg);	
	}
}