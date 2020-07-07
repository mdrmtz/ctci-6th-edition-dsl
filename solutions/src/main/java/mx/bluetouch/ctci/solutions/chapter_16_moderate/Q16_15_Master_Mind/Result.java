package mx.bluetouch.ctci.solutions.chapter_16_moderate.Q16_15_Master_Mind;

public class Result {
    public int hits;
    public int pseudoHits;

    public Result(int h, int p) {
        hits = h;
        pseudoHits = p;
    }

    @Override
    public String toString() {
        return "Result [hits=" + hits + ", pseudoHits=" + pseudoHits + "]";
    }
}
