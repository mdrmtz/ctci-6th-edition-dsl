package mx.bluetouch.ctci.solutions.chapter_16_moderate.Q16_03_Intersection;


public class Line {
    public double slope, yIntercept;
    public Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
        if (start.x == end.x) {
            slope = Double.POSITIVE_INFINITY;
            yIntercept = Double.POSITIVE_INFINITY;
        } else {
            slope = (end.y - start.y) / (end.x - start.x);
            yIntercept = end.y - slope * end.x;
        }
    }

    public boolean isVertical() {
        return slope == Double.POSITIVE_INFINITY;
    }

    @Override
    public String toString() {
        return "Line [slope=" + slope + ", yIntercept=" + yIntercept + ", start=" + start + ", end=" + end + "]";
    }

    public double getYFromX(double x) {
        if (isVertical()) {
            return Double.POSITIVE_INFINITY;
        }
        return slope * x + yIntercept;
    }
}