package mx.bluetouch.ctci.app;

import mx.bluetouch.ctci.library.LinkedList;

import static mx.bluetouch.ctci.solutions.StringUtils.join;
import static mx.bluetouch.ctci.solutions.StringUtils.split;

public class Main {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(MessageUtils.getMessage());
        System.out.println(join(tokens));
    }
}
