package main;

public class Waitress {
    private final MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public String printMenu() {
        return allMenus.show();
    }
}
