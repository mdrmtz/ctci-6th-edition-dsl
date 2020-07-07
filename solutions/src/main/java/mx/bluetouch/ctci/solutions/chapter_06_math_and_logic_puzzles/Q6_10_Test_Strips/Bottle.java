package mx.bluetouch.ctci.solutions.chapter_06_math_and_logic_puzzles.Q6_10_Test_Strips;

public class Bottle {
    private boolean poisoned = false;
    private final int id;

    public Bottle(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAsPoisoned() {
        poisoned = true;
    }

    public boolean isPoisoned() {
        return poisoned;
    }
}
