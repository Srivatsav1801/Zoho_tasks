package bmi_cal;
public class Bmi_cal{
	private double height;
	private double weight;
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public double bmicalculate()
	{
		return (weight / ((height*height)/100))*100;
	}
}