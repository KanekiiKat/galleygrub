package edu.estatuas.galleygrub.items;

import java.util.HashMap;

public class ItemFactory {
    
    private HashMap<String, Item> itemMap = new HashMap<>();

    public ItemFactory() {
    }

    public Item getItem(String name, double price){
        Item item = new Item(name, price);

        return item;
    }

    public Item getItem(String name, double price, String extra){
        Item item = new Item(name, price, extra);
        return item;
    }

    public int size(){

        return itemMap.size();
        
    }
    
}
