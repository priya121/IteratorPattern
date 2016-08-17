package test;

import main.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest {
    MenuComponent pancakeHouse = new Menu("PANCAKE HOUSE MENU", "Breakfast");
    MenuComponent dinerMenu= new Menu("DINER MENU", "Lunch");
    MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
    MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

    MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined!");

    @Test
    public void showsAllMenuItems() {
        addMenuItems();
        allMenus = combineMenus();
        Waitress waitress = new Waitress(allMenus);
        assertEquals(waitress.printMenu(), "ALL MENUS\n" +
                " All menus combined!\n" +
                "PANCAKE HOUSE MENU\n" +
                " Breakfast\n" +
                "\n" +
                "K&B's Pancake Breakfast\n" +
                " V\n" +
                " 2.99\n" +
                "--Pancakes with scrambled eggs, and toast\n" +
                "\n" +
                "\n" +
                "Regular Pancake Breakfast\n" +
                " \n" +
                " 2.99\n" +
                "--Pancakes with fried eggs, and sausage\n" +
                "\n" +
                "\n" +
                "Blueberry Pancakes\n" +
                " V\n" +
                " 3.49\n" +
                "--Pancakes made with fresh blueberries\n" +
                "\n" +
                "\n" +
                "Waffles\n" +
                " V\n" +
                " 3.59\n" +
                "--Waffles with your choice of blueberries or strawberries\n" +
                "\n" +
                "DINER MENU\n" +
                " Lunch\n" +
                "\n" +
                "Pasta\n" +
                " V\n" +
                " 3.89\n" +
                "--Spaghetti with Marinara Sauce, and a slice of sourdough bread.\n" +
                "\n" +
                "\n" +
                "Vegetarian BLT\n" +
                " V\n" +
                " 2.99\n" +
                "--(Fakin') Bacon with lettuce & tomato on whole wheat\n" +
                "\n" +
                "\n" +
                "BLT\n" +
                " \n" +
                " 2.99\n" +
                "--Bacon with lettuce & tomato on whole wheat\n" +
                "\n" +
                "\n" +
                "HotDog\n" +
                " \n" +
                " 3.29\n" +
                "--A hot dog with saurkraut, relish, onions, topped with cheese\n" +
                "\n" +
                "DESSERT MENU\n" +
                " Dessert of course!\n" +
                "\n" +
                "Apple Pie\n" +
                " V\n" +
                " 1.59\n" +
                "--Apple pie with a flakey crust, topped with vanilla icecream\n" +
                "\n" +
                "CAFE MENU\n" +
                " Dinner\n" +
                "\n" +
                "Veggie Burger and Air Fries\n" +
                " V\n" +
                " 3.99\n" +
                "--Veggie burger on whole wheat bun, lettuce, tomato, and fries\n" +
                "\n" +
                "\n" +
                "Soup of the day\n" +
                " \n" +
                " 3.69\n" +
                "--A cup of soup of the day, with a side salad\n" +
                "\n" +
                "\n" +
                "Burrito\n" +
                " V\n" +
                " 4.29\n" +
                "--A large burrito, with whole pinto beans, salsa, guacamole\n");
    }

    @Test
    public void getsDessertMenuFromDinerMenu() {
        addMenuItems();
        allMenus = combineMenus();
        assertEquals(getNode(dinerMenu, 4).getName(), "DESSERT MENU");
    }

    private MenuComponent getNode(MenuComponent menu, int index) {
        return menu.getChild(index);
    }

    private MenuComponent combineMenus() {
        allMenus.add(pancakeHouse);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        return allMenus;
    }

    private void addMenuItems() {
        addDinerMenuItems();
        addCafeMenuItems();
        addPancakeHouseMenuItems();
    }

    private void addPancakeHouseMenuItems() {
        pancakeHouse.add(new MenuItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true, 2.99));

        pancakeHouse.add(new MenuItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, and sausage",
                false, 2.99));

        pancakeHouse.add(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true, 3.49));

        pancakeHouse.add(new MenuItem("Waffles",
                "Waffles with your choice of blueberries or strawberries",
                true, 3.59));
    }

    private void addCafeMenuItems() {
        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries",
                "Veggie burger on whole wheat bun, lettuce, tomato, and fries",
                true,
                3.99));

        cafeMenu.add(new MenuItem("Soup of the day", "A cup of soup of the day, with a side salad",
                false,
                3.69));

        cafeMenu.add(new MenuItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true,
                4.29));
    }

    private void addDinerMenuItems() {
        dinerMenu.add(new MenuItem("Pasta",
                                   "Spaghetti with Marinara Sauce, and a slice of sourdough bread.",
                                   true,
                                   3.89));
        dinerMenu.add(new MenuItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99));

        dinerMenu.add(new MenuItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99));

        dinerMenu.add(new MenuItem("HotDog",
                "A hot dog with saurkraut, relish, onions, topped with cheese",
                false,
                3.29));
        addDessertSubMenuToDinerMenu();
    }

    private void addDessertSubMenuToDinerMenu() {
        dessertMenu.add(new MenuItem("Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59));
        dinerMenu.add(dessertMenu);
    }
}
