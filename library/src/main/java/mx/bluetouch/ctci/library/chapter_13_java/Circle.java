package mx.bluetouch.ctci.library.chapter_13_java;

public class Circle extends Shape {
    private final double rad = 5;

    public void printMe() {
        System.out.println("I am a circle.");
    }

    public double computeArea() {
        return rad * rad * 3.15;
    }
}
