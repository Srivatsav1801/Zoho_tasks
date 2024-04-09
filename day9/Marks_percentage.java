import java.util.*;

abstract class Marks {
    abstract double getPercentage();
}
class A extends Marks {
	int mark_1,mark_2,mark_3;
	
	A(int mark_1,int mark_2,int mark_3)
	{
		this.mark_1 = mark_1;
		this.mark_2 = mark_2;
		this.mark_3 = mark_3;
	}
	
    double getPercentage() {
        return ((mark_1+mark_2+mark_3)/3);
    }
}

class B extends Marks {
	int mark_1,mark_2,mark_3,mark_4;
	
	B(int mark_1,int mark_2,int mark_3,int mark_4)
	{
		this.mark_1 = mark_1;
		this.mark_2 = mark_2;
		this.mark_3 = mark_3;
		this.mark_4 = mark_4;
	}
    double getPercentage() {
        return ((mark_1+mark_2+mark_3+mark_4)/4);
    }
}

public class Marks_percentage{
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the student_A marks: ");
        A student_A = new A(input.nextInt(),input.nextInt(),input.nextInt());
		System.out.println("Enter the student_B marks: ");
        B student_B = new B(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());

        System.out.println("The percentage of Student A: "+student_A.getPercentage());
        System.out.println("The percentage of Student B: "+student_B.getPercentage());
    }
}

