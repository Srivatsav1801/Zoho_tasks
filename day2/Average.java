/* Print the average of three numbers entered by user by creating a class named 'Average' 
having a method to calculate and print the average. */
class Average{
	int num1,num2,num3;
	public Average(int num1,int num2,int num3){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	public int avg(){
		return ((this.num1+this.num2+this.num3)/3);
	}
}