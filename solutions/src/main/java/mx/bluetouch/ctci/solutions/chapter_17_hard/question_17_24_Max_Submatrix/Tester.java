package mx.bluetouch.ctci.solutions.chapter_17_hard.question_17_24_Max_Submatrix;

import mx.bluetouch.ctci.library.AssortedMethods;

public class Tester {

	public static void main(String[] args) {
		int[][] matrix = AssortedMethods.randomMatrix(10, 10, -5, 5);
		AssortedMethods.printMatrix(matrix);
		SubMatrix subA = QuestionA.getMaxMatrix(matrix);
		System.out.println(subA.toString());
		
		SubMatrix subB = QuestionB.getMaxMatrix(matrix);
		System.out.println(subB.toString());
		
		SubMatrix subC = QuestionC.getMaxMatrix(matrix);
		System.out.println(subC.toString());	
	}

}
