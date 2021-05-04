package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        MenuItem lobster = new MenuItem("Lobster", 28, "red and tasty", "main");
        MenuItem chickenTendies = new MenuItem("Chicken Tendies", 12, "pretty great", "main", true);

        ArrayList<MenuItem> newMenu = new ArrayList<>();
        newMenu.add(lobster);
        newMenu.add(chickenTendies);


        Menu myMenu = new Menu(new Date(), newMenu);
        System.out.println(myMenu.printMenu(newMenu));


    }
}
