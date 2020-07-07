package mx.bluetouch.ctci.solutions.chapter_09_system_design_and_scalability.Q9_05_Cache;

public class Node {
    public Node prev;
    public Node next;
    public String[] results;
    public String query;

    public Node(String q, String[] res) {
        results = res;
        query = q;
    }
}
