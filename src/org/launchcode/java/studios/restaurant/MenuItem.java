package org.launchcode.java.studios.restaurant;

public class MenuItem {

    private String name;
    private int price;
    private String description;
    private String category;
    private Boolean newItem;

    public MenuItem(String name, int price, String description, String category, Boolean newItem) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
    }

    public MenuItem(String name, int price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = false;
    }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public Boolean getNewItem() { return newItem; }
    public void setNewItem(Boolean newItem) { this.newItem = newItem; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", newItem=" + newItem +
                '}';
    }
}
