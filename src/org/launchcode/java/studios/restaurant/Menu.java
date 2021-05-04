package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdate;

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    private ArrayList<MenuItem> items;

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Menu(Date lastUpdate, ArrayList<MenuItem> items) {
        this.lastUpdate = lastUpdate;
        this.items = items;
    }

    public void removeItem(MenuItem item) {
        for (MenuItem itemName : items) {
            if (itemName.equals(item)) {
                items.remove(item);
            }
        }
    }

    public void addItem(MenuItem item) {
        if(!items.contains(item)) {
            items.add(item);
        }
    }

    public String isNewItem(MenuItem item) {
        if (item.getNewItem()) {
            return item.getName() + " is a new item!!!";
        } else {
            return item.getName() + " is oldddd";
        }
    }

    public String printItem(MenuItem item) {
        return String.format("Name: %s\n Price: %d\n Description: %s\n New: %b\n", item.getName(), item.getPrice(), item.getDescription(), item.getNewItem());
    }

    public String printMenu(ArrayList<MenuItem> menu) {
        String wholeMenu = "";
        for(MenuItem item : menu) {
            wholeMenu += printItem(item);
        }
        return wholeMenu;
    }


    @Override
    public String toString() {
        return "Menu:\n" +
                "last updated: " + lastUpdate + "\n" +
                "items:" + items
                ;
    }
}
