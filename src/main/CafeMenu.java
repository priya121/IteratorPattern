package main;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{
    Hashtable menuItems;

    public CafeMenu() {
        this.menuItems = new Hashtable();
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
