/* Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle' with a method named 'Area' 
which returns the area and length and breadth passed as parameters to its constructor. */


class Area{
	public static void main(String[] args){
		Rectangle AreaObj1 = new Rectangle(4,5);
		Rectangle AreaObj2 = new Rectangle(5,8);
		System.out.println("Area of first rectangle: " + AreaObj1.area()+ " Area of Second Rectangle "+ AreaObj2.area());
	}
}