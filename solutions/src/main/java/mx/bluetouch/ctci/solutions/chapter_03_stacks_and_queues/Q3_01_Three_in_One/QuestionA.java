package mx.bluetouch.ctci.solutions.chapter_03_stacks_and_queues.Q3_01_Three_in_One;

import mx.bluetouch.ctci.library.AssortedMethods;

public class QuestionA {
    public static void printStacks(FixedMultiStack stacks) {
        System.out.println(AssortedMethods.arrayToString(stacks.getValues()));
    }

    public static void main(String[] args) throws Exception {
        FixedMultiStack stacks = new FixedMultiStack(4);
        printStacks(stacks);
        stacks.push(0, 10);
        printStacks(stacks);
        stacks.push(1, 20);
        printStacks(stacks);
        stacks.push(2, 30);
        printStacks(stacks);

        stacks.push(1, 21);
        printStacks(stacks);
        stacks.push(0, 11);
        printStacks(stacks);
        stacks.push(0, 12);
        printStacks(stacks);

        stacks.pop(0);
        printStacks(stacks);

        stacks.push(2, 31);
        printStacks(stacks);

        stacks.push(0, 13);
        printStacks(stacks);
        stacks.push(1, 22);
        printStacks(stacks);

        stacks.push(2, 31);
        printStacks(stacks);
        stacks.push(2, 32);
        printStacks(stacks);
    }
}
