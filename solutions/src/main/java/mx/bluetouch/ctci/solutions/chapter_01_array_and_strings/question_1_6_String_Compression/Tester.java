package mx.bluetouch.ctci.solutions.chapter_01_array_and_strings.question_1_6_String_Compression;

public class Tester {

	public static void main(String[] args) {
		String str = "aaaaabbbbaaaabbddc";
		System.out.println(str);
		System.out.println(QuestionA.compressBad(str));
		System.out.println(QuestionB.compress(str));
		System.out.println(QuestionC.compress(str));
	}

}
