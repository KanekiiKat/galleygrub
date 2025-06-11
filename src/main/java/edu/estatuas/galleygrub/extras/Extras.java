package edu.estatuas.galleygrub.extras;

public enum Extras {

    CHESSE(0.25),
    SAUCE(0.50),
    LARGUE(0.50),
    MEDIUM(0.25);


    private double price;

    private Extras(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

}
