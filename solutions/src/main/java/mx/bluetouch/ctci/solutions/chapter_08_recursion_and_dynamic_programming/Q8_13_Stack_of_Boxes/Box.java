package mx.bluetouch.ctci.solutions.chapter_08_recursion_and_dynamic_programming.Q8_13_Stack_of_Boxes;

public class Box {
    public int width;
    public int height;
    public int depth;

    public Box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    public boolean canBeUnder(Box b) {
        return width > b.width && height > b.height && depth > b.depth;
    }

    public boolean canBeAbove(Box b) {
        if (b == null) {
            return true;
        }
        return width < b.width && height < b.height && depth < b.depth;
    }

    public String toString() {
        return "Box(" + width + "," + height + "," + depth + ")";
    }
}
