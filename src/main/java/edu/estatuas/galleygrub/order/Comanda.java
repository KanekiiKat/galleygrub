package edu.estatuas.galleygrub.order;

import java.util.List;

import edu.estatuas.galleygrub.items.Item;

public interface Comanda {

    void addItem(String name, double price);
    void addItem(String name, double price, String extra);
    int size();
    List<Item> itemList();
    double getTotal();
    void updateTotal(double newTotal);
    void display();
}
