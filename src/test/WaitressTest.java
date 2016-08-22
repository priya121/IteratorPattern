package test;

import main.CafeMenu;
import main.DinerMenu;
import main.PancakeHouseMenu;
import main.Waitress;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaitressTest {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    CafeMenu cafeMenu = new CafeMenu();

    @Test
    public void knowsAllMenuItems() {
        addMenuItems(pancakeHouseMenu, dinerMenu, cafeMenu);
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        assertEquals(waitress.printMenu(), "Breakfast\n" +
                                           "K&B's Pancake Breakfast\n" +
                                           "2.99\n" +
                                           "Pancakes with scrambled eggs, and toast\n" +
                                           "Lunch\n" +
                                           "\n" +
                                           "Vegetarian BLT\n" +
                                           "2.99\n" +
                                           "(Fakin') Bacon with lettuce & tomato on whole wheatDinner\n" +
                                           "\n" +
                                           "Soup of the day\n" +
                                           "3.69\n" +
                                           "A cup of soup of the day, with a side salad");
    }

    private void addMenuItems(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu, CafeMenu cafeMenu) {
        addPancakeHouseItems(pancakeHouseMenu);
        addDinerItems(dinerMenu);
        addCafeHouseItems(cafeMenu);
    }

    private void addDinerItems(DinerMenu dinerMenu) {
        dinerMenu.addItem("Vegetarian BLT",
                          "(Fakin') Bacon with lettuce & tomato on whole wheat",
                          true,
                          2.99);
        dinerMenu.addItem("BLT",
                          "Bacon with lettuce & tomato on whole wheat",
                          false,
                          2.99);
        dinerMenu.addItem("HotDog",
                          "A hot dog with saurkraut, relish, onions, topped with cheese",
                          false,
                          3.29);
    }

    private void addPancakeHouseItems(PancakeHouseMenu pancakeHouseMenu) {
        pancakeHouseMenu.addItem("K&B's Pancake Breakfast",
                                 "Pancakes with scrambled eggs, and toast",
                                 true, 2.99);
        pancakeHouseMenu.addItem("Regular Pancake Breakfast",
                                 "Pancakes with fried eggs, and sausage",
                                 false, 2.99);
        pancakeHouseMenu.addItem("Blueberry Pancakes",
                                 "Pancakes made with fresh blueberries",
                                 true, 3.49);
        pancakeHouseMenu.addItem("Waffles",
                                 "Waffles with your choice of blueberries or strawberries",
                                 true, 3.59);
    }

    private void addCafeHouseItems(CafeMenu cafeMenu) {
        cafeMenu.addItem("Veggie Burger and Air Fries",
                "Veggie burger on whole wheat bun, lettuce, tomato, and fries",
                true,
                3.99);
        cafeMenu.addItem("Soup of the day", "A cup of soup of the day, with a side salad",
                false,
                3.69);
        cafeMenu.addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true,
                4.29);
    }

}