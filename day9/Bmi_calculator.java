package bmicalculator;
import bmi_cal.Bmi_cal;
import java.util.*;
public class Bmi_calculator{
	public static void main(String[] args)
	{
		System.out.println("BMI calculator");
		Scanner sc = new Scanner(System.in);
		Bmi_cal bmi = new Bmi_cal();
		System.out.println("Enter the height in centimeters: ");
		bmi.setHeight(sc.nextDouble());
		System.out.println("Enter the weight in Kg: ");
		bmi.setWeight(sc.nextDouble());
		System.out.println("Your BMI is "+bmi.bmicalculate());
	}
}