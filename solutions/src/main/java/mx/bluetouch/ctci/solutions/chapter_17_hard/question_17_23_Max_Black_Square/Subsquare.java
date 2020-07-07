package mx.bluetouch.ctci.solutions.chapter_17_hard.question_17_23_Max_Black_Square;

public class Subsquare {
	public int row, column, size;
	public Subsquare(int r, int c, int sz) {
		row = r;
		column = c;
		size = sz;
	}
	
	public void print() {
		System.out.println("(" + row + ", " + column + ", " + size + ")");
	}
}