package org.launchcode.java.studios.countingcharacters;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
//        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a passage: ");
        String myString = input.nextLine().toLowerCase();
        char[] charactersInString = myString.toCharArray();

        HashMap<Character, Integer> characterMap = new HashMap<>();

        for (Character i: charactersInString) {
            if (!characterMap.containsKey(i)) {
                characterMap.put(i, 1);
            } else {
                // add +1 to value of key "i"
                characterMap.put(i, characterMap.get(i) + 1);
            }
        }
        for (Map.Entry<Character, Integer> mapEntry : characterMap.entrySet()) {
            System.out.println(mapEntry.getKey() + ": " + mapEntry.getValue());
        }
//        System.out.println(characterMap);
    }
}
