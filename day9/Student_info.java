package Student_info_1;
public class Student_info{
	private String Name;
	private int Roll_no;
	private int[] Marks = new int[3];
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	public void setRoll_no(int Roll_no)
	{
		this.Roll_no = Roll_no;
	}
	public void setMarks(int Marks,int i)
	{
		this.Marks[i] = Marks;
	}
	public String getName()
	{
		return Name;
	}
	public int getRoll_No()
	{
		return Roll_no;
	}
	public int getMarks(int i)
	{
		return Marks[i];
	}
}