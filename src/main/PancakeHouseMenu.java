package main;

import java.util.*;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList();
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }
}


