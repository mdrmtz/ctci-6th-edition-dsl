package mx.bluetouch.ctci.solutions.chapter_07_object_oriented_design.Q7_08_Othello;

public class Player {
    private final Color color;

    public Player(Color c) {
        color = c;
    }

    public int getScore() {
        return Game.getInstance().getBoard().getScoreForColor(color);
    }

    public boolean playPiece(int row, int column) {
        return Game.getInstance().getBoard().placeColor(row, column, color);
    }

    public Color getColor() {
        return color;
    }
}
