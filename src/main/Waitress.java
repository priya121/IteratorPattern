package main;

import java.util.Iterator;

public class Waitress {
    Menu cafeMenu;
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, CafeMenu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public String printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createMenuItemIterator();
        Iterator dinerIterator = dinerMenu.createMenuItemIterator();
        Iterator cafeMenuIterator = cafeMenu.createMenuItemIterator();

        return "Breakfast" + "\n" +
                printItems(pancakeIterator) + "\n" +
                "Lunch" + "\n\n" +
                printItems(dinerIterator) +
                "Dinner" + "\n\n" +
                printItems(cafeMenuIterator);
    }

    public String printItems(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            return menuItem.getName() + "\n" +
                   menuItem.getPrice() + "\n" +
                   menuItem.getDescription();
        }
        return "No items in menu";
    }
}
