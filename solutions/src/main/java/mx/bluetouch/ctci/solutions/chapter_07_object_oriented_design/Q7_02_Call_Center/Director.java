package mx.bluetouch.ctci.solutions.chapter_07_object_oriented_design.Q7_02_Call_Center;

class Director extends Employee {
    public Director(CallHandler callHandler) {
        super(callHandler);
        rank = Rank.Director;
    }
}
