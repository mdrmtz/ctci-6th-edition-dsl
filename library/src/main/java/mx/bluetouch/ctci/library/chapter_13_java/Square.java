package mx.bluetouch.ctci.library.chapter_13_java;

public class Square extends Shape {
    private final double len = 5;

    public void printMe() {
        System.out.println("I am a square.");
    }

    public double computeArea() {
        return len * len;
    }
}
