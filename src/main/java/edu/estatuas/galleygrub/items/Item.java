package edu.estatuas.galleygrub.items;

public class Item implements Product {
    
    private String name;
    private Double price;
    private String extra;

    public Item(String name , double price){
        this.name = name;
        this.price = price;
    }

    public Item(String name , double price, String extra){
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Double price() {
        return price;
    }

    @Override
    public String extra() {
        return extra;
    }

    @Override
    public Boolean isRegular(){

        if (extra == null){
            return false;
        }
        return true;

    }

    public Boolean equals(Item objeto){
        if (this.name.equals(objeto.name()) && this.price.equals(objeto.price())){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return name() + "...." + price() + "$";
  
    }




}
