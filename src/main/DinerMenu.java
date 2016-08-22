package main;

import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;


    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
            if (numberOfItems >= MAX_ITEMS) {
               System.out.print("Sorry, the menu is full! Can't add to the menu");
            } else {
                menuItems[numberOfItems] = menuItem;
                numberOfItems = numberOfItems + 1;
            }
        }

        public Iterator createMenuItemIterator() {
            return new DinerMenuIterator(menuItems);
        }

}
