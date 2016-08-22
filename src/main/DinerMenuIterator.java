package main;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.list = items;
    }

    @Override
    public boolean hasNext() {
        return (position < list.length) && (list[position] != null);
    }

    @Override
    public Object next() {
        MenuItem menuItem = list[position];
        position = position + 1;
        return menuItem;
    }
}
