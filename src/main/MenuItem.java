package main;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return  description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String show() {
        return "\n" + getName() +
                "\n " + showIfVeg(isVegetarian()) +
                "\n " + getPrice() +
                "\n--" + getDescription() + "\n";
    }

    public String showIfVeg(boolean isVegetarian) {
        if (isVegetarian) {
            return "V";
        }
        return "";
    }
}
