package org.launchcode.java.studios.funWithQuizzes;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {

        ArrayList<String> choices = new ArrayList<>(Arrays.asList("badger", "apple", "Snail"));
        MultipleChoice multiChoice = new MultipleChoice("Which is a fruit?", choices, 1);

        System.out.println(multiChoice.getChoices());
    }
}
