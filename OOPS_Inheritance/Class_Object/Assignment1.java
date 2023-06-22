/*Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
The dimensions of the Box are width, height, depth. 
The class should have a method that can return the volume of the box. 
Create an object of the Box class and test the functionalities.
*/

public class Assignment1 {
	private double width;
	private double height;
	private double depth;
	
	Assignment1(int width, int height, int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double getVolume() {
		return width * height * depth;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1 box = new Assignment1(10, 20, 30);
		System.out.print("The volume of Box is " + box.getVolume());
	}

}
