package mx.bluetouch.ctci.solutions.chapter_17_hard.question_17_14_Smallest_K;

import mx.bluetouch.ctci.library.AssortedMethods;

import java.util.Arrays;

public class QuestionA {

    public static int[] smallestK(int[] array, int k) {
        if (k <= 0 || k > array.length) {
            throw new IllegalArgumentException();
        }

        /* Sort array. */
        Arrays.sort(array);

        /* Copy first k elements. */
        int[] smallest = new int[k];
        for (int i = 0; i < k; i++) {
            smallest[i] = array[i];
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 9, 1, 11, 6, 13, 15};
        int[] smallest = smallestK(array, 3);
        System.out.println(AssortedMethods.arrayToString(smallest));
    }

}
