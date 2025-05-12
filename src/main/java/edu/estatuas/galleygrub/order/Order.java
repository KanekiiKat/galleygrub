package edu.estatuas.galleygrub.order;

import java.util.ArrayList;
import java.util.List;

import edu.estatuas.galleygrub.items.Item;

public class Order implements Comanda{

    private List<Item> items = new ArrayList<>();
    private double total;

    public Order(){}
    
    @Override
    public void addItem(String name, double price){
        Item item = new Item(name, price);
        this.items.add(item);
    }
    @Override
    public void addItem(String name, double price, String extra){
        Item item = new Item(name, price, extra);
        this.items.add(item);
    }

    @Override
    public int size(){
        return items.size();
    }

    @Override
    public List<Item> itemList(){
        return this.items;
    }

    @Override
    public double getTotal(){
        return this.total;
    }

    @Override
    public void updateTotal(double newTotal){
        this.total = newTotal;
    }
    @Override
    public void display(){
        StringBuilder builder = new StringBuilder();
        for(Item item : items){
            builder.append("\t").append(item.toString()).append("\n");
        }
        System.out.print("\n\t --- Order ---  \n");
        System.out.println(builder.toString());
    }
}
