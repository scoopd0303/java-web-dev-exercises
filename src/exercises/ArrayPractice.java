package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int numberOfNumbers = 6;
        int[] numbersArray = {1, 1, 2, 3, 5, 8};
        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        for (int integer: numbersArray) {
            if (integer % 2 == 1) {
                System.out.println(integer);
            }
        }

        String[] words = greenEggs.split(" ");
        String[] sentences = greenEggs.split("\\.");
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(sentences));
    }
}
