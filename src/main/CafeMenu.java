package main;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{
    private final Hashtable menuItems;

    public CafeMenu() {
        this.menuItems = new Hashtable();
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createMenuItemIterator() {
        return menuItems.values().iterator();
    }
}
