package test;

import main.DinerMenu;
import main.PancakeHouseMenu;
import main.Waitress;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaitressTest {
    @Test
    public void knowsAllMenuItems() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
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

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        assertEquals(waitress.printmenu(), "Breakfast\n" +
                                            "K&B's Pancake Breakfast\n" +
                                            "2.99\n" +
                                            "Pancakes with scrambled eggs, and toast\n" +
                                            "Lunch\n" +
                                            "\n" +
                                            "Vegetarian BLT\n" +
                                            "2.99\n" +
                                            "(Fakin') Bacon with lettuce & tomato on whole wheat");
    }

}