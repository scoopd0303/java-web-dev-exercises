package exercises;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,3,6,5,3,9,1,8,2,7));
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        System.out.println(returnSum(numbers));

        ArrayList<String> words = new ArrayList<>(Arrays.asList(phrase.split(" ")));

        Scanner input = new Scanner(System.in);
        System.out.println("Find words of how many letters long?");
        int xLetters = input.nextInt();
        printXLetterWord(words, xLetters);
    }

    public static Integer returnSum(ArrayList<Integer> nums) {
        int accumulator = 0;
        for (int i = 0; i < nums.size(); i++) {
            accumulator += nums.get(i);
        }
        return accumulator;
    }

    public static void printXLetterWord(ArrayList<String> words, int noOfLetters) {
        ArrayList<String> xLetterWords = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == noOfLetters) {
                xLetterWords.add(words.get(i));
            }
        }
        System.out.println(xLetterWords);
    }
}
