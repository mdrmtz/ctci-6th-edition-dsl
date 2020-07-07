package mx.bluetouch.ctci.solutions.chapter_13_java.Q13_06_Object_Reflection;

public class Rectangle {
	private final double width;
	private final double height;
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	public double area() {
		return width * height;
	}
}
