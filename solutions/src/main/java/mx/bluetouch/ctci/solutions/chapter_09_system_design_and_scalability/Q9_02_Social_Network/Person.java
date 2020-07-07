package mx.bluetouch.ctci.solutions.chapter_09_system_design_and_scalability.Q9_02_Social_Network;

import java.util.ArrayList;

public class Person {
    private final ArrayList<Integer> friends = new ArrayList<Integer>();
    private final int personID;
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public ArrayList<Integer> getFriends() {
        return friends;
    }

    public int getID() {
        return personID;
    }

    public void addFriend(int id) {
        friends.add(id);
    }

    public Person(int id) {
        this.personID = id;
    }
}
