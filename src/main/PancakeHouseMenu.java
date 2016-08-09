package main;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList();
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}


