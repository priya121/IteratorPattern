package main;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public String printmenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        return "Breakfast" + "\n" + printItems(pancakeIterator) + "\n" + "Lunch" + "\n\n" + printItems(dinerIterator);
    }

    public String printItems(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            return menuItem.getName() + "\n" + menuItem.getPrice() + "\n" + menuItem.getDescription();
        }
        return "No items in menu";
    }
}
